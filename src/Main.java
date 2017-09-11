import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int answer = new Random().nextInt(99);
        Scanner scanner = new Scanner(System.in);
        int guess = -1;
        int numberOfGuesses = 0;

        while (guess != answer) {
            System.out.println( "What is your number (1-100) guess?" );

            guess = scanner.nextInt();
            numberOfGuesses += 1;

            if (guess > answer) {
                System.out.println("Too High");
            } else if (guess < answer) {
                System.out.println("Too Low");
            }
        }
        if (numberOfGuesses == 1) {
            System.out.printf("It took you only 1 guess!");
        } else {
            System.out.printf("It took you %d guesses", numberOfGuesses);
        }
    }
}

