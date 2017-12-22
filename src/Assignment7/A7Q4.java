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
public class A7Q4 {

    public static double compundInterest(double balance, double rate, int years) {
        //caculate the compound interest
        double interestRate = 1 + rate;
        double finalstep = Math.pow(interestRate, years) * balance;

        System.out.println(finalstep);

        return finalstep;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // new scanner
        Scanner input = new Scanner(System.in);

        //asking for blance, rate and year
        System.out.println("Please enter");
        double balance = input.nextDouble();
        double rate = input.nextDouble();
        int years = input.nextInt();

        //method
        compundInterest(balance, rate, years);
    }
}
