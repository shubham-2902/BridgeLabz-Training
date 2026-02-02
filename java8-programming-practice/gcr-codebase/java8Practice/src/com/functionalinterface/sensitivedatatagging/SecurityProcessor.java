package com.functionalinterface.sensitivedatatagging;
class SecurityProcessor {

    public static void encrypt(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        } else {
            System.out.println("No encryption needed.");
        }
    }

    public static void main(String[] args) {
        UserPassword up = new UserPassword();
        String publicInfo = "Welcome User";

        encrypt(up);
        encrypt(publicInfo);
    }
}
