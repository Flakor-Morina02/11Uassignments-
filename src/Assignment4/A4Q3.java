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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner is put in
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter four numbers on seperate lines");
        // telling the system that there are 4 numbers are needed in the system
        double Number1 = input.nextDouble();
        double Number2 = input.nextDouble();
        double Number3 = input.nextDouble();
        double Number4 = input.nextDouble();

        // once the numbers are put in they are all put into one line with commas seperating them
        System.out.println("Your numbers were" + Number1 + "," + Number2 + "," + Number3 + "and" + Number4);






    }
}
