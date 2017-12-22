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
public class A7Q5 {

    public static void chaotic(int flakor) {
        //ouput the asterisks vetween 1 to 5
        for (int x = 0; x < flakor; x++) {
            int randomnumber = (int) (Math.random() * (5 - 1 + 1)) + 1;
            for (int i = 0; i < randomnumber; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        A7Q5 test = new A7Q5();
        //new scanner
        Scanner input = new Scanner(System.in);

        System.out.println("What is the number of lines that you want?");

        int flakor = input.nextInt();

        chaotic(flakor);

    }
}
