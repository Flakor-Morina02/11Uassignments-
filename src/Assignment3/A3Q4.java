/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author morif9929
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City Ontario = new City();

        // create a robot
        Robot bob = new Robot(Ontario, 3, 3, Direction.SOUTH);

        //walls
        new Wall(Ontario, 1, 1, Direction.NORTH);
        new Wall(Ontario, 1, 1, Direction.WEST);
        new Wall(Ontario, 2, 1, Direction.WEST);
        new Wall(Ontario, 2, 1, Direction.SOUTH);
        new Wall(Ontario, 2, 2, Direction.SOUTH);
        new Wall(Ontario, 2, 2, Direction.EAST);
        new Wall(Ontario, 1, 2, Direction.EAST);
        new Wall(Ontario, 1, 2, Direction.NORTH);

        new Wall(Ontario, 1, 4, Direction.NORTH);
        new Wall(Ontario, 1, 4, Direction.WEST);
        new Wall(Ontario, 2, 4, Direction.WEST);
        new Wall(Ontario, 2, 4, Direction.SOUTH);
        new Wall(Ontario, 2, 5, Direction.SOUTH);
        new Wall(Ontario, 2, 5, Direction.EAST);
        new Wall(Ontario, 1, 5, Direction.EAST);
        new Wall(Ontario, 1, 5, Direction.NORTH);

        new Wall(Ontario, 4, 1, Direction.NORTH);
        new Wall(Ontario, 4, 1, Direction.WEST);
        new Wall(Ontario, 5, 1, Direction.WEST);
        new Wall(Ontario, 5, 1, Direction.SOUTH);
        new Wall(Ontario, 5, 2, Direction.SOUTH);
        new Wall(Ontario, 5, 2, Direction.EAST);
        new Wall(Ontario, 4, 2, Direction.EAST);
        new Wall(Ontario, 4, 2, Direction.NORTH);

        new Wall(Ontario, 4, 4, Direction.NORTH);
        new Wall(Ontario, 4, 4, Direction.WEST);
        new Wall(Ontario, 5, 4, Direction.WEST);
        new Wall(Ontario, 5, 4, Direction.SOUTH);
        new Wall(Ontario, 5, 5, Direction.SOUTH);
        new Wall(Ontario, 5, 5, Direction.EAST);
        new Wall(Ontario, 4, 5, Direction.EAST);
        new Wall(Ontario, 4, 5, Direction.NORTH);

        int blocks = 0;
        //blocks is used to define how many blocks the robot has gone
        int side = 0;
        //side is used to define how may sides of each block the robot goes
        int go = 0;
        //go is used to define how many spaces on the side of the blocks

        while (blocks < 4) {
            //this tells the robot to go around the sides of the blocks
            while (side < 4) {
                //this tells the robot how many sides to go around
                while (go < 3) {
                    //this tells the robot how many spaces to move
                    bob.move();
                    go = go + 1;
                    //adds one to the movement so it will know it hits the wall   
                }
                bob.turnLeft();
                //turns the robot left around the corner                
                side = side + 1;
                //adds one to the side to the robot so its knows its down 1/4 of the block
                go = 0;
                //resets the moves
            }
            blocks = blocks + 1;
            //adds one to the block after all sides have been completed  
            bob.turnLeft();
            //turns left so that the robot can go around a new block   
            side = 0;
            //resets side so that the robot will know how many sides to go around again              
        }







    }
}
