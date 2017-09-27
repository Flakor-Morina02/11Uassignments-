/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author morif9929
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        City Ontario = new City();

        // create a robot
        Robot bob = new Robot(Ontario, 2, 0, Direction.EAST);



        //object
        new Thing(Ontario, 2, 8);


        //walls

        new Wall(Ontario, 2, 0, Direction.SOUTH);
        new Wall(Ontario, 2, 0, Direction.EAST);
        new Wall(Ontario, 2, 1, Direction.SOUTH);
        new Wall(Ontario, 2, 1, Direction.EAST);
        new Wall(Ontario, 2, 2, Direction.SOUTH);
        new Wall(Ontario, 2, 2, Direction.SOUTH);
        new Wall(Ontario, 2, 3, Direction.SOUTH);
        new Wall(Ontario, 2, 3, Direction.EAST);
        new Wall(Ontario, 2, 4, Direction.SOUTH);
        new Wall(Ontario, 2, 5, Direction.SOUTH);
        new Wall(Ontario, 2, 6, Direction.SOUTH);
        new Wall(Ontario, 2, 6, Direction.EAST);
        new Wall(Ontario, 2, 7, Direction.SOUTH);
        new Wall(Ontario, 2, 8, Direction.SOUTH);

        //bob movement

        while (!bob.canPickThing()) {
            if (bob.frontIsClear()) {
                bob.move();
            } else {
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
                bob.turnLeft();


            }


        }


    }
}
