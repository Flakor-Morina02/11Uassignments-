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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //new scanner 
        Scanner input = new Scanner(System.in);
        //asking the user how many students are in the class
        System.out.println("how many students are in the classroom");
        int students = input.nextInt();

        double[] currency = new double[students];
        //asking for marks
        System.out.println("Please insert the marks");

        for (int i = 0; i < currency.length; i++) {
            currency[i] = input.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < currency.length; i++) {
            sum = sum + currency[i];
        }
        //outputing the answer
        double average = sum / currency.length;
        System.out.println("The average  is" + average + ".");

    }
}
