package com.generics.airesumescreening;
import java.util.List;

public final class AIScreeningEngine {

    private AIScreeningEngine() {
    }

    // Generic method: can screen resume of any job role
    public static <T extends JobRole> double computeAIScore(Resume<T> resume) {

        // Base rule: weighted scoring
        double expScore = Math.min(resume.getExperienceYears() * 10.0, 40.0); // max 40
        double skillScore = resume.getSkillScore() * 0.6;                     // max 60

        // Skill keywords bonus (simple simulation of AI keyword extraction)
        double keywordBonus = keywordBonus(resume.getSkills(), resume.getAppliedRole());

        return Math.min(expScore + skillScore + keywordBonus, 100.0);
    }

    // Generic method: validates resume fields
    public static <T extends JobRole> void validateResume(Resume<T> resume) {

        if (resume.getCandidateId() == null || resume.getCandidateId().trim().isEmpty()) {
            throw new IllegalArgumentException("Candidate ID cannot be empty.");
        }

        if (resume.getCandidateName() == null || resume.getCandidateName().trim().isEmpty()) {
            throw new IllegalArgumentException("Candidate name cannot be empty.");
        }

        if (resume.getExperienceYears() < 0 || resume.getExperienceYears() > 60) {
            throw new IllegalArgumentException("Experience years must be between 0 and 60.");
        }

        if (resume.getSkillScore() < 0 || resume.getSkillScore() > 100) {
            throw new IllegalArgumentException("Skill score must be between 0 and 100.");
        }
    }

    // Generic method: final eligibility decision
    public static <T extends JobRole> boolean isEligible(Resume<T> resume) {

        validateResume(resume);

        T role = resume.getAppliedRole();

        boolean expOk = resume.getExperienceYears() >= role.getMinExperienceYears();
        boolean skillOk = resume.getSkillScore() >= role.getMinSkillScore();

        // AI score threshold can be a universal cutoff
        double aiScore = computeAIScore(resume);
        boolean aiOk = aiScore >= 60;

        return expOk && skillOk && aiOk;
    }

    private static double keywordBonus(List<String> skills, JobRole role) {

        int matchCount = 0;

        for (String s : skills) {
            String skill = s.toLowerCase();

            if (role instanceof SoftwareEngineer) {
                if (skill.contains("java") || skill.contains("spring") || skill.contains("dsa")
                        || skill.contains("react") || skill.contains("microservices")) {
                    matchCount++;
                }
            } else if (role instanceof DataScientist) {
                if (skill.contains("python") || skill.contains("ml") || skill.contains("deep learning")
                        || skill.contains("statistics") || skill.contains("sql")) {
                    matchCount++;
                }
            } else if (role instanceof ProductManager) {
                if (skill.contains("roadmap") || skill.contains("stakeholder") || skill.contains("agile")
                        || skill.contains("scrum") || skill.contains("market research")) {
                    matchCount++;
                }
            }
        }

        // max bonus 10
        return Math.min(matchCount * 2.5, 10.0);
    }
}
