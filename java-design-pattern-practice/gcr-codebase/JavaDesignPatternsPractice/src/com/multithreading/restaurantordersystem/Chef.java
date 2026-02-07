package com.multithreading.restaurantordersystem;
class Chef extends Thread {
    private String chefName;
    private String dish;
    private int cookTime; // in milliseconds

    public Chef(String chefName, String dish, int cookTime) {
        this.chefName = chefName;
        this.dish = dish;
        this.cookTime = cookTime;
    }

    @Override
    public void run() {
        System.out.println("Chef " + chefName + " started preparing " + dish);

        int[] progress = {25, 50, 75, 100};
        int stepTime = cookTime / 4;

        for (int p : progress) {
            try {
                Thread.sleep(stepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Chef " + chefName + " preparing " + dish + ": " + p + "% complete");
        }

        System.out.println("Chef " + chefName + " finished " + dish);
    }
}
