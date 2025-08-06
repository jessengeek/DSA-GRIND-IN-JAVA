
import java.util.Scanner;

public class prime {
    public static void decToBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int rem;
        int binNum = 0;
        while (decNum > 0) {
            rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("binary of " + myNum + " is " + binNum);
    }

    public static void main(String[] args) {
        decToBin(11);
    }
}
