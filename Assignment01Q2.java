import java.util.ArrayList;
import java.util.Arrays;

/*
 Take 2 idx values: l = farthest left, r = farthest right
 Area = (whichever is smallest between [l] and [r]) * (distance from l to r)
 If [l] > [r] then r moves backwards. Else l moves forwards
 Loop from 2 as long as l < r
 (Step 1.5) Only update Area if new area > old area
 Exit loop and return area
 */

public class Assignment01Q2 {
    public static int maxArea(ArrayList<Integer> height) {
        int area = 0;
        for (int l = 0, r = height.size()-1; l < r;) {
            int L = height.get(l);
            int R = height.get(r);
            int check = ((L > R)? R : L) * (r - l);
            area = (check > area)? check : area;
            if (L > R) r--; else l++;
        }
        return area;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(Arrays.asList(1,8,6,2, 5,4,8,3,7));
        ArrayList<Integer> height2 = new ArrayList<>(Arrays.asList(1,1));
        ArrayList<Integer> height3 = new ArrayList<>(Arrays.asList(3,1,6,2,8,4,7,5,9,3,6,1,7,2,5));

        System.out.println(maxArea(height)); // Should be 49
        System.out.println(maxArea(height2)); // Should be 1
        System.out.println(maxArea(height3)); // Should be 60 (2 valid positions)
    }
}
