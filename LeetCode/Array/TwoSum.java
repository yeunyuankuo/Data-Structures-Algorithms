import java.util.HashMap;
public class TwoSum {
    // Time complexity: O(N)
    // Space complexity: O(N)
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) return new int[]{map.get(comp), i};
            else map.put(nums[i], i);
        }
        return new int[]{};
    }
}
