public class EmployeeBonus {

    public static double[][] generateEmployeeData(int employees) {
        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + (Math.random() * 90000); // salary
            data[i][1] = (int) (Math.random() * 10) + 1; // years of service
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] result = new double[data.length][3];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];

            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    public static void calculateTotals(double[][] result) {
        double oldSum = 0, bonusSum = 0, newSum = 0;

        for (double[] r : result) {
            oldSum += r[0];
            bonusSum += r[1];
            newSum += r[2];
        }

        System.out.println("\nTotal Old Salary: " + oldSum);
        System.out.println("Total Bonus Paid: " + bonusSum);
        System.out.println("Total New Salary: " + newSum);
    }

    public static void main(String[] args) {
        double[][] data = generateEmployeeData(10);
        double[][] result = calculateNewSalaryAndBonus(data);

        System.out.println("OldSalary   Bonus   NewSalary");
        for (double[] r : result) {
            System.out.printf("%10.2f %8.2f %10.2f%n", r[0], r[1], r[2]);
        }

        calculateTotals(result);
    }
}
