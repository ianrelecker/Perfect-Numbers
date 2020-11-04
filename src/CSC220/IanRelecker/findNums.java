package CSC220.IanRelecker;

import javax.swing.*;

public class findNums extends Thread{
    private int amt;
    public long[] results;
    private JTextArea statusfield;

    public findNums(int amountToRun, JTextArea statusField) {
        this.amt = amountToRun;
        this.statusfield = statusField;
    }
        //may need to add long[] something to get the values out
//        Main.running(amountToRun);
    public void run(){

        //fix all of this
        //num of results loop.
        /*
        results = Main.running(amt);
        for (int i = 0; i < results.length; i++) {
            textArea.append(String.valueOf(results[i]) + "\n");
        }


        public static long[] running(int amountToRun) {
            long[] results = new long[amountToRun * 2 / 3];
            int a = 0;
            for (int i = 1; i < 20; i++) {
                long perfect = getPerfect(i);
                if (isPerfect(perfect)) {
                    results[a] = i;
                    a++;
                }
            }
            return results;

         */

    }

    public long[] getResults(){
        return results;
    }

}
