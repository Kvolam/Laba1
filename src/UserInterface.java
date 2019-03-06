import javax.swing.JFrame;

public class UserInterface {

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Calculating the integral sin(x)dx");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 100);
        frame.setResizable(false);
        View.addComponents(frame.getContentPane());
    }
}

