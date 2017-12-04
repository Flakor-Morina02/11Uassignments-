/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author morif9929
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new scanner
        Scanner input = new Scanner(System.in);
        //asking for 2 integers
        System.out.println("Enter the two integers");

        int[] numbers = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        //find which integer is bigger than the other
        if (numbers[1] > numbers[0]) {

            System.out.println("The numbers in asscending order are:" + numbers[0] + "" + numbers[1]);

        } else {

            System.out.println("The numbers in asscending order are:" + numbers[1] + "" + numbers[0]);

        }
    }
}