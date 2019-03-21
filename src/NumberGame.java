import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int number;
        int pickedNumber;

        pickedNumber = (int) (Math.random() * 100);

        System.out.println("Please try to guess my number out of 100.");
        number = keyboard.nextInt();

        if (number == pickedNumber){
            System.out.println("Congrats! " +pickedNumber+ " was the correct answer!");
        }
        while (number > pickedNumber || number < pickedNumber) {

            if (number > pickedNumber) {
                System.out.println("Sorry " + number + " is too high.");
                number = keyboard.nextInt();
            }
            if (number < pickedNumber) {
                System.out.println("Sorry " + number + " is too low.");
                number = keyboard.nextInt();
            }
            if (number == pickedNumber) {
                System.out.println("Congrats my number was " +pickedNumber+ "!");
            }
        }
    }
}