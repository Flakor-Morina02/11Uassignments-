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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //new scanner
        Scanner input = new Scanner(System.in);

        //asking for 10 marks
        System.out.println("Enter 10 marks");
        int[] currency = new int[10];

        for (int i = 0; i < currency.length; i++) {
            currency[i] = input.nextInt();
        }
        
        int temp = 0;
        for (int i = 0; i < currency.length; i++) {
            for (int x = 1; x < currency.length; x++) {
                if (currency[x - 1] > currency[x]) {
                    temp = currency[x - 1];
                    currency[x - 1] = currency[x];
                    currency[x] = temp;
                }
            }
        }

        //the final numbers
        System.out.println("The numbers are");

        for (int i = 0; i < currency.length; i++) {
            System.out.println(currency[i] + "");
        }


    }
}
