package com.generics.airesumescreening;
import java.util.ArrayList;
import java.util.List;

public class ScreeningPipeline {

    // This list can store Resume<SoftwareEngineer>, Resume<DataScientist>, etc together
    private final List<Resume<? extends JobRole>> resumes;

    public ScreeningPipeline() {
        this.resumes = new ArrayList<>();
    }

    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    public List<Resume<? extends JobRole>> getAllResumes() {
        return resumes;
    }

    // Wildcard method required: handles any job roles dynamically
    public static void displayRoles(List<? extends JobRole> roles) {
        if (roles.isEmpty()) {
            System.out.println("No job roles available.");
            return;
        }

        System.out.println("\n--- Job Roles In Pipeline ---");
        for (JobRole r : roles) {
            System.out.println(r);
        }
    }

    // Extract roles from resumes and call wildcard method
    public void displayRolesInPipeline() {
        List<JobRole> roles = new ArrayList<>();
        for (Resume<? extends JobRole> r : resumes) {
            roles.add(r.getAppliedRole());
        }
        displayRoles(roles);
    }

    public void runScreening() {

        if (resumes.isEmpty()) {
            System.out.println("No resumes available to screen.");
            return;
        }

        System.out.println("\n--- Screening Results ---");
        for (Resume<? extends JobRole> r : resumes) {

            double aiScore = AIScreeningEngine.computeAIScore(r);
            boolean eligible = AIScreeningEngine.isEligible(r);

            System.out.println("Candidate: " + r.getCandidateName() +
                    " | Role: " + r.getAppliedRole().getRoleName() +
                    " | AI Score: " + aiScore +
                    " | Status: " + (eligible ? "SHORTLISTED" : "REJECTED"));
        }
    }
}
