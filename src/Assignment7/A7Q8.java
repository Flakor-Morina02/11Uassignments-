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
public class A7Q8 {

    public static boolean allDigitsOdd(int num) {
        // divide by 10 until there is 1 number, if even return false
        while (num > 0 || num < 0) {
            int num2 = num % 10;
            if (num2 % 2 == 0) {
                return false;
            }
            num = num / 10;

        }
        // if the 1 number is odd, return true  

        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // new scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = input.nextInt();

        boolean output = allDigitsOdd(num);

        System.out.println(output);
    }
}