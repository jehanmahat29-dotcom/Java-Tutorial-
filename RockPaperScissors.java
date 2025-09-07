import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            
            String[] options = {"rock", "paper", "scissors"};
            System.out.println("Welcome to Rock, Paper, Scissors!");
            
            while (true) {
                System.out.print("Enter your move (rock, paper, scissors). To quit, type 'exit': ");
                String userMove = scanner.nextLine().toLowerCase();
                
                if (userMove.equals("exit")) {
                    System.out.println("Thanks for playing!");
                    break;
                }
                
                // Validate user input
                if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                    System.out.println("Invalid move! Try again.");
                    continue;
                }
                
                // Computer's move
                String computerMove = options[random.nextInt(3)];
                System.out.println("Computer chose: " + computerMove);
                
                // Determine winner
                if (userMove.equals(computerMove)) {
                    System.out.println("It's a tie!");
                } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                        (userMove.equals("scissors") && computerMove.equals("paper")) ||
                        (userMove.equals("paper") && computerMove.equals("rock"))) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }
                
                System.out.println(); // Add space between rounds
            }
        }
    }
}

    

