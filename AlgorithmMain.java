import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[]) {


        //scanner class object creation
        Scanner sc = new Scanner(System.in);
        //input from user
        System.out.println("Enter Starting Number : ");
        int start = 0;
        System.out.print("Enter Ending Number : ");
        int end = 1000;
        System.out.println("Prime numbers between " + start + " and " + end + " are : ");
        int count = 0;
        //loop for finding and printing all prime numbers between given range
        int i;
        for (i = start; i <= end; i++) {
            //logic for checking number is prime or not
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + 1;
            }
            String a = " ";
            if (count == 2)
                 System.out.println(i);
        }



//    /* function to check whether two strings are
//    anagram of each other */
//        static boolean areAnagram ( char[] str1, char[] str2){
//
//// Get lengths of both strings
//            int n1 = str1.length;
//            int n2 = str2.length;
//
//            // If length of both strings is not same,
//            // then they cannot be anagram
//            if (n1 != n2)
//                return false;
//
//            // Sort both strings
//            Arrays.sort(str1);
//            Arrays.sort(str2);
//
//            // Compare sorted strings
//            for (int i = 0; i < n1; i++) {
//                if (str1[i] != str2[i]) {
//                    return false;
//                }
//            }
//            return true;
//        }
//
//        /* Driver Code*/
//        public static void main (String args[]){
//            char str1[] = {'a', 'b', 'c', 'd'};
//            char str2[] = {'d', 'c', 'b', 'a'};
//
//            // Function Call
//            if (areAnagram(str1, str2))
//                System.out.println("The two strings are anagram of each other");
//            else
//                System.out.println("The two strings are not anagram of each other");
//        }

    }
}