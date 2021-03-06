/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizs;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author morif9929
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //new city called Ontario
        City Ontario = new City();


        // create a robot facing East
        Robot bob = new Robot(Ontario, 1, 0, Direction.EAST);

        // New walls
        new Wall(Ontario, 1, 0, Direction.WEST);
        new Wall(Ontario, 1, 2, Direction.NORTH);
        new Wall(Ontario, 1, 2, Direction.SOUTH);
        new Wall(Ontario, 1, 3, Direction.NORTH);
        new Wall(Ontario, 1, 3, Direction.SOUTH);
        new Wall(Ontario, 1, 4, Direction.NORTH);
        new Wall(Ontario, 1, 4, Direction.SOUTH);
        new Wall(Ontario, 1, 5, Direction.NORTH);
        new Wall(Ontario, 1, 5, Direction.SOUTH);
        new Wall(Ontario, 1, 6, Direction.NORTH);
        new Wall(Ontario, 1, 6, Direction.SOUTH);
        new Wall(Ontario, 1, 6, Direction.EAST);

        //Creating Coal(Things)
        new Thing(Ontario, 1, 2);
        new Thing(Ontario, 1, 3);
        new Thing(Ontario, 1, 4);
        new Thing(Ontario, 1, 5);
        new Thing(Ontario, 1, 6);
        //if the front is clear bob and move 
        while (bob.frontIsClear()) {
            bob.move();
            //when bob is at the object he picks it up and turns towards the direction he started
            if (bob.canPickThing() && bob.getAvenue() != 0) {
                bob.pickThing();
                bob.turnLeft();
                bob.turnLeft();
            }
            //if there isnt any objects the robot is carying it drops it and turns towards the mine
            if (bob.getAvenue() == 0) {
                bob.putThing();
                bob.turnLeft();
                bob.turnLeft();
            }
        }
        //once the robot has picked up all the objects it returns back to where it started
        if (!bob.frontIsClear() && !bob.canPickThing()) {
            bob.turnLeft();
            bob.turnLeft();
            //once the robot reaches where it started it turns the direction of the mine
            while (bob.frontIsClear()) {
                bob.move();
            }
        }
        bob.turnLeft();
        bob.turnLeft();


    }
}
