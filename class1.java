import java.util.ArrayList;

public class class1 {
    public static void main(String[] args) {
        /*
        * Notes:
        * *Sriti miss (Krishnochura): 01733624808; contact her to contact authorities indirectly ig (if you have any issues)
        * More than 1 absent = no certificate. Even more than 5 minutes late can mean you're given an absent
        * 
        * Array is a type of data-structure
        * 
        * There are 2 types of data-structures: Linear and non-linear (We'll be working with the former since we don't have time)
        * 
        * Array: fixed size, primitive data types can be stored
        * ArrayList: dynamic size, data types can't be stored directly
        * 
        * Find out how to open an account on github, open a repository, etc
        * Find out what's a console based project on OOP
        * 
        * Order Complexity Analysis:
        * Amount of Space or Time taken up by an algorithm/code as function of input size, NOT the actual time taken
        * Time Complexity: Depends on the Number of Operations.
        * Space Complexity: Input Space + Auxiliary Space.
        *
        * T ∝ n: T is a function of input size n
        * Big O Notation: Describes the upper bound of the time taken by an algorithm in terms of input size n
        * Basic Operations like sout, assignments, arithmetic, etc are considered to be done in constant time O(1), and are ignored* We ALWAYS consider the worst case scenario. e.g. we have an array [1, 4, -5, 2, 9] and we need to find the largest number. This array is in the worst case, where when we do a linear search, the largest element is at the end of the array, so we have to go through all elements to find it. Assuming the number of elements is n and was input from user, the order of complexity becomes O(n)
        * So basically, primary loops are considered to be O(n)
        * Nested loops are almost always bigger than O(n)
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {}
        }
        * This is O(n²)
        for (i = 0; i < n; i++) {
            for (j = i+1; j < n; j++) {} 
        }
        * This is also O(n²)
        * We wound up with time complexity = (n-1)(n-1+1)/2 = n(n-1)/2
        * = n²/2 - n/2 = n² - n = n² (Consider the largest term only)
        * Now, let m < n
        for (i = 0; i < n; i += m) {
            for (j = 0; j < m; j++) {}
        }
        * This is O(n) because the inner loop runs m times, and the outer loop runs n/m times (outer loop increases by m every time), so total operations = (n/m) * m = n
        *
        * Binary Search Algorithm: O(logn)
        * First we take a sorted array (ascending order [descending works too but then the following process is reversed])
        * Then we take the middle element, and compare it to the target element
        * If the middle element is equal to the target element, we found it ggs
        * If the middle element is less than the target element, we search the right half of the array
        * If the middle element is greater than the target element, we search the left half of the array
        * Then we repeat the same process on the half we chose, which means that for this check, we are essentially using quarter of of the initial array
        * We repeat this process until we find the target element or the array size becomes 0
        * Each time we do this, we are halving the size of the array, so the time complexity is O(logn)
        -- -- -- --
        Inferred by myself:
         However, if the array was not sorted to begin with, we would have to sort it first, which will take O(nlogn) or O(n²) time (variation based on the sorting techniques used), then doing the binary search increases by O(logn), so ultimately, the time complexity = O(nlogn) or O(n²). So in such cases, linear search is faster
        -- -- -- --
        * We went like this; n/2^1 = n/2 --> n/2² = n/4 --> n/2³ = n/8 ... till n/2^k = 1
        * So, n = 2^k => log_2 n = k
        * This searching technique is best when the array size is large. Otherwise, linear search is better
        */
        ArrayList<Integer> sampleList = new ArrayList<Integer>();
        // acc to compiler, we can write ArrayList<Integer> sampleList = new ArrayList<>(); because it can infer the type from the left side for this sort of data type
        // Operations on ArrayList:
        sampleList.add(10); // Add element: O(1)
        sampleList.add(20);
        sampleList.add(30);
        System.out.println(sampleList); // [10, 20, 30]
        System.out.println(sampleList.get(1)); // Get element O(1); 20
        sampleList.set(0, 60); // Set element @index: O(1)
        System.out.println(sampleList); // [60, 20, 30]
        sampleList.remove(1); // Remove element: O(n)
        System.out.println(sampleList); // [60, 30]
        System.out.println(sampleList.contains(30)); // Contains element: O(n); true
    }
}
