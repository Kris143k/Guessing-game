import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100)+1;
        int guess=0;
        int attempts=0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100");
        System.out.println("Try to guess it!");

        while(guess!=randomNumber){
            System.out.println("Enter your guess: ");
            guess=sc.nextInt();
            attempts++;
            if(guess<randomNumber){
                System.out.println("Your guess id too low.");
            }else if(guess>randomNumber){
                System.out.println("Your guess is too high.");
            }else{
                System.out.println("Congratulations! You have guessed the correct number.");
                System.out.println("It took you "+attempts+" attempts.");
            }
        }
        sc.close();
    }
}