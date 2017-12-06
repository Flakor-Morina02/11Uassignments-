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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner
        Scanner input = new Scanner(System.in);
        //first variable        
        int[] currency = new int[1001];

        for (int f = 0; f < currency.length; f++) {
            currency[f] = f;
        }
        //figuring out the prime numbers and outputting them
        System.out.println("The prime numbers are ");
        for (int c = 2; c < currency.length; c++) {
            if (currency[c] != 0) {
                //second variable 
                int primenumbers = currency[c];

                for (int i = 2; i * primenumbers < currency.length; i++) {
                    currency[i * primenumbers] = 0;
                }
                System.out.println(currency[c]);

            }
        }

    }
}