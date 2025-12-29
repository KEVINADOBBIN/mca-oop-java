import javax.swing.*;
import java.awt.*;

public class MyAppletPanel extends JPanel {

    String fontName = "TimesRoman"; // Font name
    int fontSize = 70;              // Font size

    // Constructor to simulate applet parameters
    public MyAppletPanel(String fontName, int fontSize) {
        this.fontName = fontName;
        this.fontSize = fontSize;
        System.out.println("init() called");
    }

    // Paint method equivalent to applet's paint()
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font f = new Font(fontName, Font.BOLD, fontSize);
        g.setFont(f);
        g.drawString("Java Programming", 50, 100);
    }

    // Simulate start() and stop()
    public void start() {
        System.out.println("start() called");
    }

    public void stop() {
        System.out.println("stop() called");
    }

    public void destroy() {
        System.out.println("destroy() called");
    }

    // Main method to run as a normal Java program
    public static void main(String[] args) {
        JFrame frame = new JFrame("Applet Simulation - Java Programming");
        MyAppletPanel panel = new MyAppletPanel("TimesRoman", 70);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);

        // Simulate applet lifecycle
        panel.start();

        // Optional: stop and destroy can be called when closing frame
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                panel.stop();
                panel.destroy();
            }
        });
    }
}
