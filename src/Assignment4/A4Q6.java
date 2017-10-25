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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Please enter the speed limit: ");
        // scanner was put in 
        Scanner limit = new Scanner(System.in);

        int limits = limit.nextInt();
        //asking for the speed
        System.out.print("Pease enter you speed: ");
        //adding a scanner fot the speed 
        Scanner speed = new Scanner(System.in);

        int speeds = speed.nextInt();

        int over = speeds - limits;
        //after the speed has been put in the system will realize if there is a fine or not and what the price will be
        while (true) {
            if (speeds <= limits) {
                System.out.print("You are within the speed limit");
            }
            if (over > 1 && over < 20) {
                System.out.print("Your fine is $100");
            }
            if (over > 21 && over < 30) {
                System.out.print("Your fine is $270");
            }
            if (over > 30) {
                System.out.print("Your fine is $500");
            }

            break;

        }

    }
}
