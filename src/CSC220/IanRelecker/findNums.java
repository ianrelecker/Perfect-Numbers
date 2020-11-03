package CSC220.IanRelecker;

public class findNums extends Thread{

    public findNums(int amountToRun) {
        //may need to add long[] something to get the values out
        Main.running(amountToRun);
    }

}
