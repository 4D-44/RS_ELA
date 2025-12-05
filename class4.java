import java.util.HashMap;
import java.util.Set;


public class class4 {
    // questions like finding number of characters in a string, number of repetitions, etc. can be easily found using hashmaps. There are linked hashmaps as well.
    // HashMaps --> (Key, Value) pair data structure, where both have addresses
    /* e.g.:
    Key     : Value
    Pizza   : 10
    Burger  : 20
    Pasta   : 05
    Roll    : 15
    Burgers : 05
    */
    // *Key will ALWAYS be unique. It can never be duplicate. But value can repeat
    // *Unordered; it stores randomly
    // *Map in Java = Object of Javascript
   
    // Some operations: put(key, value), get(key), containsKey(key), remove(key) -- O(1)
    // Some important functions or something: 
    //   For set of values: values() -- (10, 20, 5, 15, 5)
    //   For set of keys:   keySet() -- (Pizza, Burger, Pasta, Roll, Burgers)
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        Set<String> keySet = hm.keySet();
        hm.put("Pizza", 10);
        hm.put("Burger", 20);

        for (String key : keySet) {
            // System.out.println(key);
            System.out.println("Key: " + hm.get(key));
        }
        // * Majority Element
        // From an array of integers, find the element which repeat more than n/3 times when n = size of array.
        // x = [1, 3, 2, 5, 1, 3, 1, 5, 1] (9 elements, so find whichever exist more times than 9/3 = 3)
        // Ans: 1, since it repeats 4 times, and 4 > 3
        // y = [1, 2]
        // Ans: 1 & 2, since they repeat 1 time, and 1 > 0
        // We can solve these using hashmaps easily. In x, "1" as key becomes unique, so it will update the key every repetition.
        int[] x = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int[] y = {1, 2};
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        Set<Integer> keySet2 = hm2.keySet();
        for (int i : x) {
            Integer n = x[i];
            // if (hm2.containsKey(n))
            //     hm2.put(n, hm2.get(n)+1);
            // else 
            //     hm2.put(n, 1);
            hm2.put(n, hm2.getOrDefault(n, 0)+1);
        }
        
        for (Integer k : keySet2) {
            if (hm2.get(k) > x.length/3)
                System.out.println(k);
        }
        
        // * Valid Anagram
        // Anagram checks for the existence of the same characters in same frequency. e.g. art, tar, rat are anagrams of each other
        // Basically, using hashmap makes it easier as in we don't need to do O(n²) double loop solving. But by using hashmaps, we can check if each character (as a key) exists in the same number of times (values)
        String st1 = "rat";
        String st2 = "art";
        String st3 = "tarc";
        HashMap<Character, Integer> hm3 = new HashMap<>();
        Set<Character> kS = hm3.keySet();
        // iterate through st1 to create map, iterate through st2 to see if st2 contains in 'map', decrease value by 1. If all map is empty, true. Else false
        System.out.println();
    }
    public static boolean isAnagram(String s1, String s2) {
        boolean bool = false;

        return bool;
    }
}
