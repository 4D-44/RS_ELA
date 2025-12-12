
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class class5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Find any pair in a sorted arrayList which, after summing, gives target sum
        // Must be O(n)
        // pari ni
        ArrayList<Integer> sample = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int targSum = sc.nextInt();
        for (int i = 0, j = sample.size()-1; i < j; ) {
            int iEl = sample.get(i);
            int jEl = sample.get(j);

            int sum = iEl + jEl;
            if (sum > targSum)
                j--;
            else if (sum < targSum) 
                i++;
            else
            {
                System.out.printf("The pairs are: %d and %d.", iEl, jEl);
                break;
            }
        }
        System.out.println();

        // Find if a string is a palindrome or not
        // Must be O(n)
        // parsi
        String test = sc.next();
        boolean isPal = true;
        for (int i = 0, j = test.length()-1; i < j; i++, j--) {
            char iEl = test.charAt(i);
            char jEl = test.charAt(j);

            if (iEl != jEl) {
                isPal = false;
                break;
            }
        }
        if (isPal) 
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        // Add Digit: Find the summation of the digits of a number till it becomes a single digit
        // O(n) if possible
        // parsi but O(n²)
        int num = sc.nextInt();
        while (num >= 10) {
            int sum = 0, n = num;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            num = sum;
            if (num < 10) System.out.println(num);
        }

        sc.close();
    }
}
