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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // new scanner
        Scanner input = new Scanner(System.in);
        //finding out the amount of students in the class
        System.out.println("How many students are in the class");

        int students = input.nextInt();
        
        System.out.println("Input the students" + students + "marks");

        int[] currency = new int[students];

        for (int i = 0; i < currency.length; i++) {

            currency[i] = input.nextInt();
        }


        for (int i = 0; i < currency.length; i++) {
            for (int x = 1; x < currency.length; x++) {
                if (currency[x - 1] > currency[x]) {
                    int temp = currency[x - 1];
                    currency[x - 1] = currency[x];
                    currency[x] = temp;
                }
            }
        }

        System.out.println("The lowest mark is " + currency[0] + ".");

        int highestMrk = currency.length - 1;

        System.out.println("The highest mark is " + currency[highestMrk] + ".");
        //doubling 
        double average = 0;

        for (int i = 0; i < students; i++) {
            average = average + currency[i];
        }

        average = average / currency.length;

        System.out.println("The average is " + average + ".");


    }
}
