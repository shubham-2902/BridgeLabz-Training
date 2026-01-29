package com.reflection.methodexecutiontime;
public class TestTimer {
    public static void main(String[] args) throws Exception {

        Task task = new Task();

        MethodTimer.executeWithTiming(task, "performTask");
    }
}