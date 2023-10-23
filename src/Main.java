import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Press Enter to roll the dice...");
            scanner.nextLine();

            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("Roll: " + die1 + " + " + die2 + " = " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lost.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You won.");
            } else {
                System.out.println("Point is " + sum);
                boolean continueRolling = true;

                while (continueRolling) {
                    System.out.println("Press Enter to roll the dice again...");
                    scanner.nextLine();

                    die1 = random.nextInt(6) + 1;
                    die2 = random.nextInt(6) + 1;
                    int newSum = die1 + die2;

                    System.out.println("Roll: " + die1 + " + " + die2 + " = " + newSum);

                    if (newSum == sum) {
                        System.out.println("Made point and won!");
                        continueRolling = false;
                    } else if (newSum == 7) {
                        System.out.println("Got a seven and lost.");
                        continueRolling = false;
                    } else {
                        System.out.println("Trying for point...");
                    }
                }
            }

            System.out.println("Do you want to play again? (y/n)");
            String choice = scanner.nextLine().toLowerCase();
            if (!choice.equals("y")) {
                break;
            }
        }

        System.out.println("Thanks play again another time!");
    }
}