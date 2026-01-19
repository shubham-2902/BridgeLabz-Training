package com.generics.airesumescreening;
public abstract class JobRole {

    private final String roleName;
    private final int minExperienceYears;

    public JobRole(String roleName, int minExperienceYears) {
        this.roleName = roleName;
        this.minExperienceYears = minExperienceYears;
    }

    public String getRoleName() {
        return roleName;
    }

    public int getMinExperienceYears() {
        return minExperienceYears;
    }

    // Role-specific requirement
    public abstract int getMinSkillScore();

    @Override
    public String toString() {
        return "JobRole{Name=" + roleName +
                ", MinExp=" + minExperienceYears +
                ", MinSkillScore=" + getMinSkillScore() +
                "}";
    }
}
