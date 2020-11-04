package CSC220.IanRelecker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// What should i do to get the results out of the thread
// how do I make sure everything updates

public class GUI extends JFrame {

    public static final long serialVersionUID = 1L;

    private final int width = 500;
    private final int height = 600;
    private int amountToRun;
    private MainPanel mainPanel;

    public GUI(){
        setTitle("Perfect #'s");
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(1,1));
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
        private JTextArea textArea;

        private int numberInt;
        private String statusThread = "";
        private long[] results;
        private findNums finder;
        private Thread.State state;


        MainPanel(){
            perfectNumbers = new JButton("Perfect Numbers");
            perfectNumbers.addActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            findNums finder = new findNums(numberInt);
                            results = finder.getResults();
                            for (int i=0; i<results.length; i++) {
                                textArea.append(String.valueOf(results[i]));
                            }
                        }
                    }
            );
            buttonStatus = new JButton("Status");
            buttonStatus.addActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            state = finder.getState();
//                            fieldStatus.setEditable(true);
                            fieldStatus.setText(String.valueOf(state));
//                            fieldStatus.setEditable(false);
                        }
                    }
            );


            setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
            fieldStatus = new JTextField(statusThread, 6);
            numberToRun = new JTextField(statusThread, 6);
            textArea = new JTextArea(7,8);
            scrollPaneOutput.add(textArea);
            this.add(perfectNumbers);
            this.add(buttonStatus);
            this.add(fieldStatus);
            this.add(numberToRun);

            scrollPaneOutput.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPaneOutput.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            this.add(scrollPaneOutput);
        }
    }



    public static void main(String[] args) {
        new GUI();
    }
}
