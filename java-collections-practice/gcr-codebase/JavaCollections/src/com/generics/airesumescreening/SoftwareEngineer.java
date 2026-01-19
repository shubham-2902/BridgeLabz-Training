package com.generics.airesumescreening;
public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(int minExperienceYears) {
        super("Software Engineer", minExperienceYears);
    }

    @Override
    public int getMinSkillScore() {
        return 70;
    }
}
