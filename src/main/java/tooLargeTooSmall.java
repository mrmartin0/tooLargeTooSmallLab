import java.util.Scanner;
import java.util.Random;

/**
 * Created by matthewmartin on 1/12/17.
 */
public class tooLargeTooSmall {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        Random rand = new Random();
        int rando = rand.nextInt(100) + 1;
        int userGuess = 0;
        int lastGuess = 0;
        int counter = 0;

        do {
            lastGuess = userGuess;

            System.out.println("Guess a number between 1 and 100");
            userGuess = ask.nextInt();

            if (userGuess != lastGuess) {
                counter++;
            }

            if (userGuess > rando) {
                System.out.println("Oooof, too much. Your guess was too high. Try again.");
            } else if
               (userGuess < rando) {
                System.out.println("Take me higher!!! Your guess was too low. Try again");
            } else {
                System.out.println("You got it!!! And it only took " + counter + " tries!!!");
            }

        } while (userGuess != rando) ;
    }
}