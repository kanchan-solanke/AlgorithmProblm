import sun.text.normalizer.Utility;
//Algorithm:
/*
suppose number = 2;
n =2^n = 4;
higher 4 so print num is bet 0 to 4
mid form = 0 + 4/2 = 2;
high - low == 1 ; 4-0 = 4; 4 == 1;
condition false
if boolean condition
asked low or mid now low 1 nd high 4
4 > 1 correct print mid 2 this is our number
if this condition not true it is going to else part
// enter input 2
think number 0 to 4
number less than 2
false
number is less than 3
true
number get 2
*/
import java.util.Scanner;
public class GuessNumber {
    // create a constructor
    public static int guessing(int low, int high) {
        Scanner sc = new Scanner(System.in);
        int mid = (low + high) / 2;
        if (high - low == 1)
            return low;
        System.out.println("this number is less than from this number  " + mid);
        if (sc.nextBoolean()) {
            return guessing(low, mid);
        } else {
            return guessing(mid, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input ");
        int n = sc.nextInt();
        int high = (int) Math.pow(2, n);
        int low = 0;
        System.out.println("think the number in between " + low + "to" + high);
        System.out.println("number is " + guessing(low, high));
        sc.close();
    }

}