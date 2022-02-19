import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Panel extends JPanel implements KeyListener, ActionListener{

    enum State {
        LEVEL_ONE,
        LEVEL_INFINITE,
    }

    final double DELAY = .1;
    final int SCREEN_WIDTH = 800;
    final int SCREEN_HEIGHT = 800;
    Timer timer;
    Random random;

    MazeSlide currentMaze;
    MazeContainer container;

    State gameState;

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
        timer = new Timer(60, this);
        gameState = State.LEVEL_ONE;
        container = new MazeContainer();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {

        //update functions go here

        g.setColor(Color.white);
        container.draw(g);

        repaint();
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
        //key releases for player movement go here
        System.out.println(e.getKeyCode());
    }

    public void actionPerformed(ActionEvent e) {
    }
}
