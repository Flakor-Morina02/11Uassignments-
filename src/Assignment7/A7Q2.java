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
public class A7Q2 {

    public static char examGrade(int mark) {
        //if the mark is in the specific number range print the letter for that range 
        if (mark <= 49) {
            System.out.println("F");
        }

        if (mark >= 50 && mark < 60) {
            System.out.println("D");
        }

        if (mark >= 60 && mark < 70) {
            System.out.println("C");
        }

        if (mark >= 70 && mark < 80) {
            System.out.println("B");
        }

        if (mark >= 80) {
            System.out.println("A");
        }

        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new scanner
        Scanner input = new Scanner(System.in);
        //asking for the mark
        System.out.println("Enter your mark");

        int mark = input.nextInt();

        System.out.println("Your grade is");

        char grade = examGrade(mark);










    }
}
