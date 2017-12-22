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
public class A7Q3 {

    public static void factors(int num) {
        // find and output of the integers
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // new scanner 
        Scanner input = new Scanner(System.in);
        //asking foe the number
        System.out.println("Enter a number: ");

        int num = input.nextInt();

        System.out.println("The factors of the number you choose is");

        factors(num);


    }
}
