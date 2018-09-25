import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        //declare
        int pickedNumber;
        Scanner keyboard;
        int answer1;
        boolean win = false;



        //initialization
        keyboard = new Scanner(System.in);
        pickedNumber = (int) (Math.random() * 100);

        System.out.println("welcome to my number guessing game!");

        while(win == false ){

            System.out.println("Try to guess the number 1-100.");
            answer1 = keyboard.nextInt();
        if (pickedNumber == answer1) {
            win = true;
            System.out.println("Correct! You win, well done");
        }
        else if (pickedNumber < answer1) {
            System.out.println("Too high.");
        }
        else if (pickedNumber > answer1) {
            System.out.println("Too low.");
        }




    }
}}
