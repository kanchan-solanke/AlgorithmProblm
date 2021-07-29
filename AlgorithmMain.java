import java.util.Arrays;
import java.util.Scanner;
public class prime_numbers_in_a_given_range
{
    public static void main(String[] args)
    {
        //scanner class object creation
        Scanner sc=new Scanner(System.in);
        //input from user
        System.out.print("Enter Starting Number : ");
        int start = 0;
        System.out.print("Enter Ending Number : ");
        int end = 1000;
        System.out.println("Prime numbers between "+start+" and "+end+" are : ");
        int count = 0;
        //loop for finding and printing all prime numbers between given range
        for(int i = start ; i <= end ; i++) {
            //logic for checking number is prime or not
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2)
                System.out.println(i);

        }
            // check palindromes

            //declare and initialize variables
            int  temp,i;
            int sum = 0;

            System.out.println("Enter number to check for palindrome");
            //get input from user
            i = sc.nextInt();

            //store number in a temporary variable temp
            temp = i;

            //use for loop check whether number is prime or not
            for(i = 1; i <= temp; i++)
            {
                if(temp%i == 0)
                {
                    count++;    //increment counter when the reminder is 0
                }
            }

            //use while loop to check whether the number is palindrome or not
            while(i > 0)
            {
                // get last digit of the number
                int rem = i % 10;

                // store the digit last digit
                sum = sum*10+rem;

                // extract all digit except the last
                i = i/10;
            }

            //check whether the number is palindrome and Prime or not
            if(temp == sum && count == 2)
            {
                System.out.println(temp +" is a PalPrime number");
            }
            else
            {
                System.out.println(temp +" is not a PalPrime number");
            }

        }
    }

