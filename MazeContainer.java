import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class MazeContainer {

    MazeSlide[] container;
    MazeSlide currentSlide;
    Random random = new Random();

    int playerX;
    int playerY;

    int[] vel;
    
    public MazeContainer() {
        //creates the list of 9 maze slides
    	
        container = new MazeSlide[9];
        OrientationMaker OM = new OrientationMaker();
        container[0] = new MazeSlide(OM.get2D());
        OrientationMaker OM1 = new OrientationMaker();
        container[1] = new MazeSlide(OM1.get2D());
        OrientationMaker OM2 = new OrientationMaker();
        container[2] = new MazeSlide(OM2.get2D());
        OrientationMaker OM3 = new OrientationMaker();
        container[3] = new MazeSlide(OM3.get2D());
        OrientationMaker OM4 = new OrientationMaker();
        container[4] = new MazeSlide(OM4.get2D());
        OrientationMaker OM5 = new OrientationMaker();
        container[5] = new MazeSlide(OM5.get2D());
        OrientationMaker OM6 = new OrientationMaker();
        container[6] = new MazeSlide(OM6.get2D());
        OrientationMaker OM7 = new OrientationMaker();
        container[7] = new MazeSlide(OM7.get2D());
        OrientationMaker OM8 = new OrientationMaker();
        container[8] = new MazeSlide(OM8.get2D());

        currentSlide = container[0];
        
        
        //player potion and velocity
        playerX = 15;
        playerY = 15;
        vel = new int[2];
        vel[0] = 0;
        vel[1] = 0;
    }


    //player movement is delt here
    public void movePlayer() {
        currentSlide.removePlayer(playerX, playerY);
        playerX += vel[0];
        playerY += vel[1];
        //try catch to see if it goes out of bounds, if it does it goes to the next slide
        try {
            //this is really basic collision with the walls, its a lil clunky we could fix in the future
            if(currentSlide.possibleMove(playerX, playerY)) {
                currentSlide.addPlayer(playerX, playerY);
            } else {
                playerX -= vel[0];
                playerY -= vel[1];
                currentSlide.addPlayer(playerX, playerY);
            }
        } catch (Exception e) {
            if (playerX >= currentSlide.getMazeSize()) {
                playerX = 0;
            } else if (playerX < 0) {
                playerX = currentSlide.getMazeSize() - 1;
            }

            if (playerY >= currentSlide.getMazeSize()) {
                playerY = 0;
            } else if (playerY < 0) {
                playerY = currentSlide.getMazeSize() - 1;
            }
            //makes the current slide a new one from the list
            cycleSlide();
            currentSlide.addPlayer(playerX, playerY);
        }   
    }

    //picks a random slide
    public void cycleSlide() {
    	MazeSlide nextSlide = currentSlide;
    	while (nextSlide.equals(currentSlide)) {
    		nextSlide = container[random.nextInt(8)];
    	}
        currentSlide = nextSlide;
    }

    public void setVelX(int x) {
        vel[0] = x;
    }

    public void setVelY(int y) {
        vel[1] = y;
    }

    //if you want to make an update to the display, add your funciton here
    public void update() {
        movePlayer();
    }

    //draws the slide
    public void draw(Graphics g) {
        currentSlide.draw(g);
    }
}