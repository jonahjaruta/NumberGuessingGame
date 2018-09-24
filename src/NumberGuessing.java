import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        //declare
        int pickedNumber;
        Scanner keyboard;
        int answer1;
        int answer2;
        int answer3;
        int answer4;
        int answer5;

        //initialization
        keyboard = new Scanner(System.in);
        pickedNumber = (int) (Math.random() * 100);



        System.out.println("Let's play a game, try to guess my number 1-100.");
        answer1 = keyboard.nextInt();

        if (pickedNumber == answer1) {
            System.out.println("Correct! You win, well done");
        } else if (pickedNumber < answer1) {
            System.out.println("Too high, guess again.");
        } else if (pickedNumber > answer1) {
            System.out.println("Too low, try again.");
        }

        answer2 = keyboard.nextInt();

        if (pickedNumber == answer2) {
            System.out.println("Correct! You win, well done");
        } else if (pickedNumber < answer2) {
            System.out.println("Too high, guess again.");
        } else if (pickedNumber > answer2) {
            System.out.println("Too low, try again.");
        }

        answer3 = keyboard.nextInt();

        if (pickedNumber == answer3) {
            System.out.println("Correct! You win, well done");
        } else if (pickedNumber < answer3) {
            System.out.println("Too high, guess again.");
        } else if (pickedNumber > answer3) {
            System.out.println("Too low, try again.");
        }

        answer4 = keyboard.nextInt();

        if (pickedNumber == answer4) {
            System.out.println("Correct! You win, well done");
        } else if (pickedNumber < answer4) {
            System.out.println("Too high, guess again.");
        } else if (pickedNumber > answer4) {
            System.out.println("Too low, try again.");
        }


    }
}
