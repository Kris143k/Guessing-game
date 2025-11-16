using System;

public class GuessingGame
{
    public static void Main(string[] args)
    {
        Random random = new Random();
        int randomNumber = random.Next(1, 101); // 1 to 100
        int guess = 0;
        int attempts = 0;

        Console.WriteLine("Welcome to the Guessing Game!");
        Console.WriteLine("I have selected a number between 1 and 100");
        Console.WriteLine("Try to guess it!");

        while (guess != randomNumber)
        {
            Console.Write("Enter your guess: ");
            guess = Convert.ToInt32(Console.ReadLine());
            attempts++;

            if (guess < randomNumber)
            {
                Console.WriteLine("Your guess is too low.");
            }
            else if (guess > randomNumber)
            {
                Console.WriteLine("Your guess is too high.");
            }
            else
            {
                Console.WriteLine("Congratulations! You have guessed the correct number.");
                Console.WriteLine("It took you " + attempts + " attempts.");
            }
        }
    }
}
