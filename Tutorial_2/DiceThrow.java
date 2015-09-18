package Tutorial_2;


import java.util.Scanner;

public class DiceThrow {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        int guess;
        int dice;
        int count = 0;

        dice = (int) (Math.random() * 6) + 1;

        while (count <= 2){
            System.out.print("Enter your guess: ");
            guess = inp.nextInt();

            if (guess == dice) {
                System.out.println("Yay! You guessed it! It was " + dice);
                break;
            }
            else
                System.out.println("Nope!");
            count++;
        }
    }
}
