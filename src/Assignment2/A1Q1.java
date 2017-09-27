/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author morif9929
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City Ontario = new City();

        // create a robot
        Robot bob = new Robot(Ontario, 1, 1, Direction.EAST);
    
        //new walls
        new Thing(Ontario, 1, 2);
        new Thing(Ontario, 1, 3);
        new Thing(Ontario, 1, 4);
        new Thing(Ontario, 1, 5);
        new Thing(Ontario, 1, 6);
        new Thing(Ontario, 1, 7);
        new Thing(Ontario, 1, 8);
        new Thing(Ontario, 1, 9);
        new Thing(Ontario, 1, 10);
        new Thing(Ontario, 1, 11);

        //robot movements
        while (bob.countThingsInBackpack() < 7) {
            bob.move();
            bob.pickThing();

        }
        bob.move();
        bob.move();
        bob.move();
        bob.move();

    }
   
}
