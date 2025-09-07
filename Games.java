
import java.util.Scanner;

class Game{
//guess the number game
int randomNumber = (int)(Math.random() * 100 + 1);
int guessNumber = 0;
int count = 0;
int score = 0;
Scanner sc = new Scanner(System.in);

public void playGame(){
    System.out.println("Guess the number between 1 and 100");
    while (guessNumber != randomNumber){
        guessNumber = sc.nextInt();
        if (guessNumber < randomNumber){
            System.out.println("Number is too samll");
        }
        else if (guessNumber > randomNumber){
            System.out.println("Number is too large");
        }
        else{
            System.out.println("You guessed the number in " + count + " tries");
            System.out.println("Your score is " + score);
        }
        count++;
        score = 100 - 3*count;
    }
}
}
public class Games {
    public static void main(String[] args) {
        Game GuessNumber = new Game();
        GuessNumber.playGame();
    }
}
