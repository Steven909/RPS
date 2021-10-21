import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String[] rockPaperScissors = {"Rock", "Paper", "Scissors"};
        Scanner scanner = new Scanner(System.in);

        int userScore = 0;
        int computerScore = 0;

        String computerWinMessage = "Computer wins!";
        String userWinMessage = "User wins!";
        String draw = "Draw! Play again!";

        do {
            // Get user input
            System.out.println("Enter choice> ");
            int userChoice = scanner.nextInt();

            // Get computer choice. Randomly select 1 string from rockPaperScissors array.
            int idx = new Random().nextInt(rockPaperScissors.length);
            String compChoice = (rockPaperScissors[idx]);

            //  Print out user choice
            System.out.println("User choice is > " + rockPaperScissors[userChoice]);
            // Print out computer choice
            System.out.println("Computer choice is > " + compChoice);

            // Comparison method to compare all combinations.
            if (userChoice == 0 && idx == 1) {
                System.out.println(computerWinMessage);
                computerScore += 1;
                System.out.println(computerScore);
            } else if (userChoice == 1 && idx == 0) {
                System.out.println(userWinMessage);
                userScore += 1;
                System.out.println(userScore);
            } else if (userChoice == 1 && idx == 2) {
                System.out.println(computerWinMessage);
                computerScore += 1;
                System.out.println(computerScore);
            } else if (userChoice == 2 && idx == 1) {
                System.out.println(userWinMessage);
                userScore += 1;
                System.out.println(userScore);
            } else if (userChoice == 2 && idx == 0) {
                System.out.println(computerWinMessage);
                computerScore += 1;
                System.out.println(computerScore);
            } else if (userChoice == 0 && idx == 2) {
                System.out.println(userWinMessage);
                userScore += 1;
                System.out.println(userScore);
            } else {
                System.out.println(draw);
            }
        } while (userScore < 3 && computerScore < 3);


    }
}
