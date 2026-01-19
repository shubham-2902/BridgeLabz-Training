package com.generics.airesumescreening;
public class DataScientist extends JobRole {

    public DataScientist(int minExperienceYears) {
        super("Data Scientist", minExperienceYears);
    }

    @Override
    public int getMinSkillScore() {
        return 75;
    }
}
