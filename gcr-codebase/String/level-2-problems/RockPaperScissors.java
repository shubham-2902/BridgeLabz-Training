import java.util.Scanner;

 public class RockPaperScissors {

    public static String computerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "Rock";
        if (choice == 1) return "Paper";
        return "Scissors";
    }

    public static String findWinner(String user, String computer) {

        if (user.equals(computer)) return "Draw";

        if (user.equals("Rock") && computer.equals("Scissors") ||
            user.equals("Paper") && computer.equals("Rock") ||
            user.equals("Scissors") && computer.equals("Paper")) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, computerWins = 0;

        System.out.println("\nGame\tUser\tComputer\tWinner");

        for (int i = 1; i <= games; i++) {

            System.out.print("\nEnter choice (Rock/Paper/Scissors): ");
            String userChoice = sc.next();

            String compChoice = computerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;

            System.out.println(i + "\t" + userChoice + "\t" + compChoice + "\t\t" + winner);
        }

        double userPercent = (userWins * 100.0) / games;
        double compPercent = (computerWins * 100.0) / games;

        System.out.println("\nUser Wins: " + userWins + " (" + userPercent + "%)");
        System.out.println("Computer Wins: " + computerWins + " (" + compPercent + "%)");
    }
}
