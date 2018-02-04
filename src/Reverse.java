import java.util.Scanner;
/*
creator:Hamid Majeed
purpose:use a method to display integer in reverse
date:02/04/18
 */
public class Reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner

        System.out.println("Integer Mirror!");

        System.out.print("Enter an integer: ");

        int number = input.nextInt();

        reverse(number);
    }

    /** This is the method which displays user inputted integer backwards*/
    public static void reverse(int number) {
        while (number > 0) {
            System.out.print((number % 10));
            number /= 10;
        }
        System.out.println();
    }
}