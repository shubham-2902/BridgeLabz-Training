package com.generics.airesumescreening;
public class ProductManager extends JobRole {

    public ProductManager(int minExperienceYears) {
        super("Product Manager", minExperienceYears);
    }

    @Override
    public int getMinSkillScore() {
        return 65;
    }
}
