package CSC220.IanRelecker;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private final int width = 600;
    private final int height = 500;
    private JFrame mainframe;

    public void BaseGUI(){
        setTitle("Perfect #'s");
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5,5));
//        mainframe = new MainPanel();
    }

    public class MainPanel extends JPanel{

        private JButton perfectNumbers;
        private JButton buttonStatus;
        private JTextField fieldStatus;
        private JTextField numberToRun;
        private JScrollPane scrollPaneOutput;

        private String statusThread = "";
        MainPanel(){
//            prepareButtons();
            setLayout(new FlowLayout());
            fieldStatus = new JTextField(statusThread, 8);


        }
    }



    public static void main(String[] args) {
	// write your code here
    }
}
