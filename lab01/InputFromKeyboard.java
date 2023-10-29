package lab01;

// Write a program for input/output from keyboard

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String []args) {
        Scanner keyboard = new Scanner(System.in);

        // Input the string Name
        System.out.println("What's your name?");
        String strName = keyboard.nextLine();

        // Input the int age
        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();

        // Input the double height
        System.out.println("How tall are you (m)?");
        double dHeight = keyboard.nextDouble();

        //similar to other data types
        //nextByte(), nextShort(), nextLong()
        //nextFloat(), nextBoolean()

        // Print the result
        System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. "
                + "Your height is " + dHeight + ".");
    }
}