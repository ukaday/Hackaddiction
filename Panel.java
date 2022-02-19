import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Panel extends JPanel implements KeyListener{

    final int SCREEN_WIDTH = 800;
    final int SCREEN_HEIGHT = 800;
    Timer timer;
    Random random;

    public Panel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(this);
    }

    public void start() {
    }

    public void paint(Graphics g) {
    }

    public void draw(Graphics g) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
        
    }
}
