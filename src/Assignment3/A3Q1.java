package Assignment3;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author morif9929
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City Ontario = new City();

        // create a robot
        Robot bob = new Robot(Ontario, 0, 1, Direction.EAST);

        //new wall
        new Wall(Ontario, 1, 1, Direction.NORTH);
        new Wall(Ontario, 1, 1, Direction.WEST);
        new Wall(Ontario, 2, 1, Direction.WEST);
        new Wall(Ontario, 2, 1, Direction.SOUTH);
        new Wall(Ontario, 2, 2, Direction.SOUTH);
        new Wall(Ontario, 2, 2, Direction.EAST);
        new Wall(Ontario, 1, 2, Direction.EAST);
        new Wall(Ontario, 1, 2, Direction.NORTH);

        //the robot is being told to move around the square walls exactly 2 times and come to a stop after

        for (int count = 0; count < 8; count = count + 1) {
            bob.move();
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
        }

    }
}
