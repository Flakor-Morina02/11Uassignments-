/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author morif9929
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Telling the system to ask the number of inches the person wants to convert into centimeters
        System.out.println("Please enter the number of inchs you wish to convert to centimeters");
        //scanner is put in       
        Scanner input = new Scanner(System.in);
        int Number = input.nextInt();
        //telling the scanner to multiply the number to get the answer into centimeters         
        double Nubers = 2.54 * Number;
        System.out.println(Number + "inches" + "is the same as " + Nubers + "cm");




    }
}
