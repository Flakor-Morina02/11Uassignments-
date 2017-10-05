/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author morif9929
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        City Ontario = new City();

        // making the robot bob 
        Robot bob = new Robot(Ontario, 1, 1, Direction.EAST, 20);

        //starting the robot with 20 seeds in their backpack
        for (int count = 0; count < 20; count = count + 1) {
            bob.move();
            bob.putThing();
            //showing the movment the robot makes when it has 15 seeds in his backback
            if (bob.countThingsInBackpack() == 15) {
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.putThing();
            }
            //showing the movment the robot makes when it has 10 seeds in his backpack
            if (bob.countThingsInBackpack() == 10) {
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.putThing();
                //showing the movment the robot makes when it has 5 seeds in his backpack
            }
            if (bob.countThingsInBackpack() == 5) {
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.putThing();
                //showing the movment the robot makes when it has 0 seeds left in his backpack
            }

            if (bob.countThingsInBackpack() == 0) {
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                //tells the robot to stop moving once all the seeds have been placed
            }
            while (bob.countThingsInBackpack() == 0) {
                bob.canPickThing();

            }
        }
    }
}
