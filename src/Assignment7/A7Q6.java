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
public class A7Q6 {

    public static void lastDigit(int num) {
        //divide by 10 to seperate last digit
        int digit = 0;
        digit = num % 10;
        System.out.println(digit);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new scanner  
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = Math.abs(input.nextInt());
        //output last digit
        System.out.println("The last digit is: ");

        lastDigit(num);





    }
}
