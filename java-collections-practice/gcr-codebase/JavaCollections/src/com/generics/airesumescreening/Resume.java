package com.generics.airesumescreening;
import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole> {

    private final String candidateId;
    private final String candidateName;
    private final int experienceYears;
    private final int skillScore; // 0-100
    private final List<String> skills;
    private final T appliedRole;

    public Resume(String candidateId, String candidateName, int experienceYears, int skillScore, T appliedRole) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
        this.skillScore = skillScore;
        this.appliedRole = appliedRole;
        this.skills = new ArrayList<>();
    }

    public String getCandidateId() {
        return candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public int getSkillScore() {
        return skillScore;
    }

    public T getAppliedRole() {
        return appliedRole;
    }

    public void addSkill(String skill) {
        if (skill != null && !skill.trim().isEmpty()) {
            skills.add(skill.trim());
        }
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Resume{ID=" + candidateId +
                ", Name=" + candidateName +
                ", Exp=" + experienceYears +
                ", SkillScore=" + skillScore +
                ", Role=" + appliedRole.getRoleName() +
                ", Skills=" + skills +
                "}";
    }
}
