import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        boolean value = true;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int number;
        int pickedNumber;

        pickedNumber = (int) (Math.random() * 100);

        System.out.println("Please try to guess my number out of 100.");
        number = keyboard.nextInt();

        while (value) {
            if (number > pickedNumber) {
                System.out.println("Sorry, " +number+ " is too high. Gimme another one.");
                number = keyboard.nextInt();
            }
            if (number < pickedNumber) {
                System.out.println("Sorry, " +number+ " is too low. Gimme another one.");
                number = keyboard.nextInt();
            }
            if(number == pickedNumber);
                value = false;
        }
    }
}
