package Assignment8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author Owner
 */
public class Unknownbird extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 1000;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    // new bird
    Rectangle bird = new Rectangle(20, 20, 20, 20);
    //array of rectangles
    Rectangle[] Column = new Rectangle[6];
    //speed
    int ColumnSpeed = 4;
    int birdSpeed = 1;
    //X and Y direction
    int Xdirection = -1;
    int Ydirection = 1;
    int Birdxdirection = 1;
    //boolean movement
    boolean jump = false;
    //gravity
    int gravity = 1;
    //boolean for end game
    boolean gameOver;
    //score
    int score = 0;
    //bird speed
    int birdspeed = 10;
    Font biggerfont = new Font("arial", Font.BOLD, 30);
    Font smallerFont = new Font("calibri", Font.ITALIC, 30);
    //menu
    boolean menu = true;
    //game start
    boolean gamestart = false;
    //tells your score after game
    boolean Storedscore = false;
    //new rectangle in between columns and ground for score tracker
    Rectangle middle1 = new Rectangle(250, 140, 1, 100);
    Rectangle middle2 = new Rectangle(550, 320, 1, 100);
    Rectangle middle3 = new Rectangle(900, 80, 1, 100);
    Rectangle ground = new Rectangle(0, HEIGHT - 120, WIDTH, 20);

    // GAME VARIABLES END HERE   
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Unknownbird() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);
        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);
        // sets some op*+tions and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        // GAME DRAWING GOES HERE
        //menu
        if (menu) {
            g.setColor(Color.CYAN);
            g.fillRect(0, 0, 1000, 600);
            g.setColor(Color.ORANGE);
            g.setFont(biggerfont);
            g.drawString("Press 'SPACE' to start", 330, WIDTH / 2 - 150);
            g.drawString("FLAPPYBIRD!!", 390, WIDTH / 2 - 300);
        }
        // once the game is over it gives you options
        if (menu == false && gamestart == false) {
            g.setColor(Color.CYAN);
            g.fillRect(0, 0, 1000, 600);
            g.setColor(Color.WHITE);
            g.setFont(biggerfont);
            g.drawString("GAME OVER", 390, WIDTH / 2 - 280);
            g.drawString("Your Score Was: " + score, 345, WIDTH / 2 - 180);
            Storedscore = true;
          
        }
        //when the game begins 
        if (menu == false && gamestart) {
            //sky
            g.setColor(Color.CYAN);
            g.fillRect(0, 0, WIDTH, HEIGHT);
            // 1 layer ground
            g.setColor(Color.ORANGE);
            g.fillRect(0, HEIGHT - 120, WIDTH, 120);
            // 2 layer ground
            g.setColor(Color.GREEN);
            g.fillRect(0, HEIGHT - 120, WIDTH, 20);
            // bird drawing
            g.setColor(Color.RED);
            g.fillRect(bird.x, bird.y, bird.width, bird.height);
            //score
            g.setColor(Color.BLACK);
            g.setFont(biggerfont);
            g.drawString("" + score, WIDTH / 2, 50);

            g.setColor(Color.MAGENTA);
            for (int i = 0; i < Column.length; i++) {
                g.fillRect(Column[i].x, Column[i].y,
                        Column[i].width, Column[i].height);
            }

        }

        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        // columns
        Column[0] = new Rectangle(250, 0, 40, 140);
        Column[1] = new Rectangle(250, 250, 40, 230);
        Column[2] = new Rectangle(550, 0, 40, 320);
        Column[3] = new Rectangle(550, 440, 40, 40);
        Column[4] = new Rectangle(900, 0, 40, 80);
        Column[5] = new Rectangle(900, 200, 40, 280);

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;
        preSetup();
        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();
            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            //when game starts once the columns hit the left wall respawn them at the right wall
            if (menu == false && gamestart) {
                if (Column[0].x < 0) {
                    Column[0].x = WIDTH;
                }
                if (Column[1].x < 0) {
                    Column[1].x = WIDTH;
                }
                if (Column[2].x < 0) {
                    Column[2].x = WIDTH;
                }
                if (Column[3].x < 0) {
                    Column[3].x = WIDTH;
                }
                if (Column[4].x < 0) {
                    Column[4].x = WIDTH;
                }
                if (Column[5].x < 0) {
                    Column[5].x = WIDTH;
                }

                if (middle1.x < 0) {
                    middle1.x = WIDTH;
                }
                if (middle2.x < 0) {
                    middle2.x = WIDTH;
                }
                if (middle3.x < 0) {
                    middle3.x = WIDTH;
                }
                // move the columns and middle left towards the wall
                Column[0].x = Column[0].x + Xdirection * ColumnSpeed;
                Column[1].x = Column[1].x + Xdirection * ColumnSpeed;
                Column[2].x = Column[2].x + Xdirection * ColumnSpeed;
                Column[3].x = Column[3].x + Xdirection * ColumnSpeed;
                Column[4].x = Column[4].x + Xdirection * ColumnSpeed;
                Column[5].x = Column[5].x + Xdirection * ColumnSpeed;

                middle1.x = middle1.x + Xdirection * ColumnSpeed;
                middle2.x = middle2.x + Xdirection * ColumnSpeed;
                middle3.x = middle3.x + Xdirection * ColumnSpeed;

                for (int i = 0; i < Column.length; i++) {
                    // did the player hit a block?
                    if (bird.intersects(Column[i])) {
                        gameOver = true;
                        gamestart = false;
                        jump = false;
                        ColumnSpeed = 0;
                        
                        
                    }

                }
                //if the bird hits the middle score goes up by 5
                if (bird.intersects(middle1)) {
                    score = score + 1;
                }
                if (bird.intersects(middle2)) {
                    score = score + 1;
                }

                if (bird.intersects(middle3)) {
                    score = score + 1;
                }
                //once score reaches 100 it goes up by 
                if (score >= 100) {
                    ColumnSpeed = 5;
                }
                //if bird hits ground game over
                if (bird.intersects(ground)) {
                    gameOver = true;
                    gamestart = false;
                    jump = false;
                    ColumnSpeed = 0;
                }
                // bird jumping abilty
                if (jump) {
                    // do something about jumping
                    // big negative to start moving up
                    Ydirection = -5;
                }
                Ydirection = Ydirection + gravity;
                bird.y = bird.y + Ydirection;
            }
           
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();
            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };

        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            //space
            if (key == KeyEvent.VK_SPACE) {
                jump = true;
            }
            //space
            if (key == KeyEvent.VK_SPACE) {
                menu = false;
                gamestart = true;

            }

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
           //space
            if (key == KeyEvent.VK_SPACE) {
                jump = false;
            }
           
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        Unknownbird game = new Unknownbird();

        // starts the game loop
        game.run();
    }
}
