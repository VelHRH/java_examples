import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int target = 7;
        System.out.println(binarySearch(nums, target));
    }

    public static int binarySearch(List<Integer> nums, int target) {
        int left = 0;
        int right = nums.size() - 1;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if  (nums.get(mid) == target) {
                return mid;
            }
            if (nums.get(mid) > target){
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}