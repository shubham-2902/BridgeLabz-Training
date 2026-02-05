package com.day1.HealthCheckPro;
public class LabTestController {

    @PublicAPI
    public String getLabTests() {
        return "List of tests";
    }

    @RequiresAuth(role="DOCTOR")
    public String uploadReport() {
        return "Report uploaded";
    }
}
