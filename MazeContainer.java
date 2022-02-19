import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MazeContainer {

    MazeSlide[] container;
    
    public MazeContainer() {
        int[][] slide = {
            {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 0, 0, 1, 0, 0, 1},
            {1, 0, 1, 1, 1, 0, 1, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
            {1, 0, 1, 1, 1, 0, 1, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

        container = new MazeSlide[9];
        container[0] = new MazeSlide(slide);
    }

    public void movePlayer(int dir) {
    }

    public void draw(Graphics g) {
        container[0].draw(g);
    }
}
