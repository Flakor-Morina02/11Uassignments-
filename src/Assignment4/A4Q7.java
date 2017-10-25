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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int pos = 1;
        //asking for the roll
        while (pos < 99) {
            System.out.print("Please enter the roll");

            Scanner roll = new Scanner(System.in);


            int rolls = roll.nextInt();

            pos = pos + rolls;
            //the the player lands on 54 they go to 19
            if (pos == 54) {
                pos = 19;

            }
            //if the player lansd on 90 they go to 48
            if (pos == 90) {
                pos = 48;

            }
            //if the player lands on 99 they go to 77
            if (pos == 99) {
                pos = 77;

            }
            //if the player lands on 9 they go to 34
            if (pos == 9) {
                pos = 34;

            }
            //if the player lands on 40 they go to 64
            if (pos == 40) {
                pos = 64;

            }
            //if the player lands on 67 the go to 86
            if (pos == 67) {
                pos = 86;

            }
            //once they reach 100 the game ends
            if (pos > 100) {
                pos = pos - rolls;
            }
            if (rolls == 0) {
                System.out.println("You Quit?");
                break;
            }
            System.out.println("Your postion is" + pos);

        }

        System.out.println("You win");
    }
}
