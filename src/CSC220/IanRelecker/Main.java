package CSC220.IanRelecker;

public class Main {

//    public static void main(String[] args) {
//        for (int i=1; i<20; i++){
//            long perfect = getPerfect(i);
//            System.out.println(i + " " + perfect + " " + isPerfect(perfect));
//        }
//    }





    private static boolean isPerfect(long perfect) {
        long[] divisors = new long[999];
        int holder = 0;
        boolean through = false;
        for(int i=1; i<perfect; i++){
            if (i != 0 && perfect % i == 0 && i>0){
                //
                if (i==1 && through){break;}
                through = true;
//                System.out.println(i + "   " + perfect);
                //
                divisors[holder] = i;
                holder++;
            }
        }
        long addingTogether = 0;
        for (int i=0; i<divisors.length; i++){
            addingTogether = addingTogether + divisors[i];
        }
        if (addingTogether == perfect){
            return true;
        }else {
            return false;
        }
    }

    private static long getPerfect(long i) {
        return ((long) Math.pow(2, i-1) * (long)(Math.pow(2, i) -1));
    }
}

