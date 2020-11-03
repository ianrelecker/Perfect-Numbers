package CSC220.IanRelecker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    public static final long serialVersionUID = 1L;

    private final int width = 600;
    private final int height = 500;
    private int amountToRun;
    private MainPanel mainPanel;

    public GUI(){
        setTitle("Perfect #'s");
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5,5));
        mainPanel = new MainPanel();
        this.add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
        mainPanel.setFocusable(true);
        mainPanel.requestFocus();
    }

    public class MainPanel extends JPanel{

        private JButton perfectNumbers;
        private JButton buttonStatus;
        private JTextField fieldStatus;
        private JTextField numberToRun;
        private JScrollPane scrollPaneOutput;

        private int numberint;
        private String statusThread = "";

        MainPanel(){
            Thread a;
            perfectNumbers = new JButton("Perfect Numbers");
            perfectNumbers.addActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            findNums finder = new findNums(numberint);
                        }
                    }
            );
            buttonStatus = new JButton("Status");
            buttonStatus.addActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    }
            );

            setLayout(new FlowLayout());
            fieldStatus = new JTextField(statusThread, 8);

            this.add(perfectNumbers);
//            this.add(buttonStatus);
//            this.add(fieldStatus);
//            this.add(numberToRun);

//            scrollPaneOutput.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//            scrollPaneOutput.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//            this.add(scrollPaneOutput);
        }
    }



    public static void main(String[] args) {
        new GUI();
    }
}
