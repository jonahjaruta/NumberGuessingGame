import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        //declare
        boolean runAgain = false;
        int pickedNumber;
        Scanner keyboard;

        while (runAgain == false) {

        int answer1;
        boolean win = false;
        int tries = 0;



        //initialization
        keyboard = new Scanner(System.in);



        pickedNumber = (int) (Math.random() * 100);

        System.out.println("welcome to my number guessing game!");


        while (win == false) {

            System.out.println("Try to guess the number 1-100.");
            answer1 = keyboard.nextInt();
            tries++;

            if (pickedNumber == answer1) {
                win = true;
                System.out.println("Correct! You win, well done");
            } else if (pickedNumber < answer1) {
                System.out.println("Too high.");
            } else if (pickedNumber > answer1) {
                System.out.println("Too low.");
            }


        }
        System.out.println("It took you " + tries + " tries.");
        }
    }
}