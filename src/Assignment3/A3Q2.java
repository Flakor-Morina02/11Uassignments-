package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author morif9929
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City Ontario = new City();

        // create a robot
        Robot bob = new Robot(Ontario, 1, 1, Direction.EAST);

        //objects placed so that robot can pick it up
        new Thing(Ontario, 1, 1);
        new Thing(Ontario, 1, 1);
        new Thing(Ontario, 1, 1);
        new Thing(Ontario, 1, 1);
        new Thing(Ontario, 1, 1);
        new Thing(Ontario, 1, 1);
        new Thing(Ontario, 1, 1);
        new Thing(Ontario, 1, 1);
        new Thing(Ontario, 1, 1);
        new Thing(Ontario, 1, 1);



        Ontario.showThingCounts(true);
        int moveCounter = 0;
        //this makes the robot pick up one oject and take it to the other side and it repeats
        for (int count = 0; count < 10; count = count + 1) {
            bob.pickThing();
            bob.move();
            bob.putThing();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
        }
        bob.move();

    }
}
