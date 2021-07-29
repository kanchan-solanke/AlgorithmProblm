import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        int n = sc.nextInt();

        String[] arr = new String[n];
        System.out.println("Enter a word:");
        for (int i=0 ; i< arr.length; i++){
            System.out.print("WORD " + (i + 1) + ": ");
            arr[i] = sc.next();
        }

        System.out.println("Enter a word you want to search for: ");
        String word = sc.next();
//Arrays to sort the word list
        Arrays.sort(arr);
        int index= Arrays.binarySearch(arr,word);
        System.out.println(word+ "="+ index);


    }
}
