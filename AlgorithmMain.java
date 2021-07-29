import java.util.ArrayList;
import java.util.List;

public class PermutationsAP1
{
    /*
    Recursive Approach
    1. fixed A possibility ABC & ACB
    2. fixed B possibility BAC & BCA
    3. fixed C possibility CBA & CAB
     */
    // Utility function to swap two characters in a character array
    private static void swap(char[] ch, int i, int j)
    {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    // Recursive function to generate all permutations of a string
    private static int permutations(char[] ch, int currentIndex)
    {
        // suppose A=1 BC=2  : 1 ==2-1 :  1==1 : compare nd print
        if (currentIndex == ch.length - 1) {
            System.out.println(String.valueOf(ch));
        }

        for (int i = currentIndex; i < ch.length; i++)
        {
            swap(ch, currentIndex, i);
            permutations(ch, currentIndex + 1);
            swap(ch, currentIndex, i);
        }
        return currentIndex;
    }
// iterative approach
public static int iteration(String s)
{
    // create an empty ArrayList to store (partial) permutations
    List<String> partial = new ArrayList<>();

    // initialize the list with the first character of the string
    partial.add(String.valueOf(s.charAt(0)));

    // do for every character of the specified string
    for (int i = 1; i < s.length(); i++)
    {
        // consider previously constructed partial permutation one by one

        // (iterate backward to avoid ConcurrentModificationException)
        for (int j = partial.size() - 1; j >= 0 ; j--)
        {
            // remove current partial permutation from the ArrayList
            String str = partial.remove(j);

            // Insert the next character of the specified string at all
            // possible positions of current partial permutation. Then
            // insert each of these newly constructed strings in the list

            for (int k = 0; k <= str.length(); k++)
            {
                // Advice: use StringBuilder for concatenation
                partial.add(str.substring(0, k) + s.charAt(i) +
                        str.substring(k));
            }
        }
    }

    System.out.println(partial);
    return 0;
}
    // generate all permutations of a string in Java
    public static  void main(String[] args)
    {
        String s = "ABC";
        int a = permutations(s.toCharArray(), 0);
        int b = iteration(s);

        if( a == b){
        System.out.println("Two arrays are equals");
        }
        else{
            System.out.println("Two arrays are not equals");
        }
    }
}



