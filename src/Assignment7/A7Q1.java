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
public class A7Q1 {

    public static double circleArea(double radius) {
        double rsquared = Math.pow(radius, 2);
        double area = Math.PI * rsquared;

        return area;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new scanner
        Scanner input = new Scanner(System.in);
        //ask the radius
        System.out.println("What is the radius of the circle needed?");

        double radius = input.nextDouble();

        double answer = circleArea(radius);

        System.out.println("The area is" + answer + ".");









    }
}
