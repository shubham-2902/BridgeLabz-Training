package com.lambdaexpression.notificationfilter;
 public class Alert {
    String type;
    int severity;

    public Alert(String type, int severity) {
        this.type = type;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return type + " Severity:" + severity;
    }
}
