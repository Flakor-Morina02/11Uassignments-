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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // new scanner


        //new scanner
        Scanner input = new Scanner(System.in);

        System.out.println("How many people are in the survey");
        int people = input.nextInt();

        double[] currency = new double[people];
        //asking for the heights
        System.out.println("Please enter the heights");

        for (int i = 0; i < currency.length; i++) {
            currency[i] = input.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < currency.length; i++) {
            sum = sum + currency[i];

        }
        //doubling the average
        double average = sum / currency.length;

        for (int i = 0; i < people; i++) {
            if (currency[i] > average) {
            }
        }
        System.out.print("The average is " + average);

    }
}
