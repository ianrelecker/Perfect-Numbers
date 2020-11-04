package CSC220.IanRelecker;

public class findNums extends Thread{
    private int amt;
    public long[] results;

    public findNums(int amountToRun) {
        this.amt = amountToRun;
    }
        //may need to add long[] something to get the values out
//        Main.running(amountToRun);
    public void run(){
        results = Main.running(amt);
    }

    public long[] getResults(){
        return results;
    }

}
