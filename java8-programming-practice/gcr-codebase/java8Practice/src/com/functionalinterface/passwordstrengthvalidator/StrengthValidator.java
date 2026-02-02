package com.functionalinterface.passwordstrengthvalidator;
interface StrengthValidator {

    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[@#$%^&+=].*");
    }
}
