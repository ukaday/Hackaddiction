import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Panel extends JPanel implements KeyListener{

    enum State {
        LEVEL_ONE,
        LEVEL_INFINITE,
    }

    final int SCREEN_WIDTH = 800;
    final int SCREEN_HEIGHT = 800;
    State gameState;

    //timer stuff, fps is how many times it runs per second
    final int fps = 20;
    final double period = 1000000000 / fps;
    double delta = 0;
    long now;
    long lastTime = System.nanoTime();

    MazeSlide currentMaze;
    MazeContainer container;

    int x = 100;
    int y = 100;

    public Panel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(this);

        container = new MazeContainer();
    }

    public void start() {
        gameState = State.LEVEL_ONE;
        container = new MazeContainer();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    //this is the looping function
    //i have the update function running 'fps' times per second
    public void draw(Graphics g) {

        //update functions go here
        now = System.nanoTime();
        delta += (now - lastTime) / period;
        lastTime = now;

        if (delta >= 1) {
            container.update();
            delta--;
        }

        container.draw(g);

        repaint();
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 65:
                container.setVelX(-1);
                break;
            case 68:
                container.setVelX(1);
                break;
            case 87:
                container.setVelY(-1);
                break;
            case 83:
                container.setVelY(1);
                break;
            default:
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 65:
                container.setVelX(0);
                break;
            case 68:
                container.setVelX(0);
                break;
            case 87:
                container.setVelY(0);
                break;
            case 83:
                container.setVelY(0);
                break;
            default:
                break;
        }
    }
}
