public class SpringSeason {

    public static boolean checkSpring(int M, int D) {

        if (M < 3 || M > 6) {
            return false;
        }

        if (M == 3 && D < 20) {
            return false;
        }

        if (M == 6 && D > 20) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Illegal values");
            return;
        }

        int Month = Integer.parseInt(args[0]);
        int Day = Integer.parseInt(args[1]);

        if (checkSpring(Month, Day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
