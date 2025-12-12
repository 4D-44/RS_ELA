
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
    // If you want to enter software engineering, start researching which companies are good. Right away. Also what sorts of interviews they have.
    // Some examples would be the Bangladeshi companies WellDev, Therap (java mostly) (no internship but high salary even for fresh graduates: Tk. 65k), Brain Station 23 (Low salary), Orbitax (C#, angular) (Low-ish salary initially, but lots of added benefits), Optimizely (Google of Bangladesh; very high salary for fresh graduates: Tk. 100k)
    // Some companies will hire you as long as you are a national level ICPC candidate. They'll only ask you what your salary expectations are via email lol

    /*
    Make sure—
    * Start doing problem-solving
    * Internalize the core concepts properly. নিজ দায়িত্বে 
    * Take any particular framework, learn it, and start development with it (python's one is django, php's is laravel, java's is Spring boot)
    * Learning SQL because it is the backbone of any development. You need it for data manipulation They will also ask abt ts in interviews
    * Learning stuff about CSE370 (Database systems) beforehand maybe. There are no free tutorials on it out there, so you have to invest in yourself. Learn it from some place like udemy
    * If you have good time-management, keeping up with BracU academics while having other hobbies as well as learning skills related to development and whatnot is definitely possible. But it's nigh impossible if your time-management skills are bad
    
    * Do NOT wait till 4th year to do your thesis. Make a habit from now on to read 2 research papers per week. 
    * If 4/5 members for your thesis, have 2/3 pro coders, 3/4 coders, at least. Don't take দোস্তs, take competent people.
    Because the main problem with thesis is figuring out what unique topic to select. So doing this, by the time you get to 3rd year, you'll have a general idea of different fields. Then you'll be able to decide which field is best for you
    If you can do this, you're already in the top 2% of Bangladeshi students
    You will probably not understand anything about the research papers, btw. So just tell AI to give you a summary of it: the outcome of the paper, things to work on (This is important for you!), as well as what technology the author used
    Your supervisors will NOT help you with your research. Maybe if they're really good, they might help you publish your thesis, but no more than that

    * CISCO or something: if you get CGPA 4 in CSE421, the department head of CSE will give you a full scholarship for CISCO or smth. Very important for cyber security
    */
}
