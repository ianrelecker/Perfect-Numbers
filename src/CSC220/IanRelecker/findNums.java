package CSC220.IanRelecker;

import javax.swing.*;

public class findNums extends Thread{
    private int amt;
    public long[] results;
    private JTextArea textArea;

    public findNums(int amountToRun, JTextArea textArea) {
        this.amt = amountToRun;
        this.textArea = textArea;
    }


    public void run(){
        int a = 0;
        int b = 0;
        while (amt >= b){
            long perfect = Main.getPerfect(a+1);
            System.out.print(perfect);
            if (Main.isPerfect(perfect)) {
                textArea.append(perfect + "\n");
                b++;
            }
            a++;
        }
    }


}
