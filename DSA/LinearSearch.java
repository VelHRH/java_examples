import java.util.Arrays;
import java.util.List;

public class LinearSearch {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int target = 6;
        System.out.println(linearSearch(nums, target));
    }

    public static int linearSearch(List<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
