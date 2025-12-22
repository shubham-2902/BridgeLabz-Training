public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // Exception here
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {

        // Uncomment to see abnormal termination
        // generateException();

        handleException();
    }
}
