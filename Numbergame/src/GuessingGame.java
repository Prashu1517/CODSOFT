//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int guess;

        while (true) {
            guess = (low + high) / 2;
            System.out.println("Is the number " + guess + "?");
            System.out.print("Enter 'h' if the guess is too high, 'l' if it's too low, or 'c' if it's correct: ");
            char response = scanner.next().charAt(0);

            if (response == 'h') {
                high = guess - 1;
            } else if (response == 'l') {
                low = guess + 1;
            } else if (response == 'c') {
                System.out.println("Yay! I guessed it!");
                break;
            } else {
                System.out.println("Invalid response. Please try again.");
            }
        }
    }
}