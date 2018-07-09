import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.*;

public class TestFrame {

    public static void createGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ImageIcon icon = new ImageIcon("/src/ball.jpg");
        ImageIcon icon = new ImageIcon("C:\\temp/ball.jpg");

        // POSITION OF THE PICTURE1

        JButton leftButton = new JButton("qwe", icon);
        leftButton.setIcon(icon);
        frame.getContentPane().add(leftButton);

        frame.setPreferredSize(new Dimension(200, 100));

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}