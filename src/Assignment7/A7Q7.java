/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author morif9929
 */
public class A7Q7 {

    public static void firstDigit(int digit) {
        //divide number by 10 until 1 digit is left   
        while (digit >= 10) {
            digit = digit / 10;
        }
        System.out.println(digit);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new scanner
        Scanner input = new Scanner(System.in);
        //scaning a number
        System.out.println("Enter a number ");
        int digit = Math.abs(input.nextInt());
        //ouput first digit
        System.out.println("The first digit is ");
        firstDigit(digit);



    }
}
