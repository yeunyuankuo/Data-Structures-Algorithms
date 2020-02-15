import java.util.HashMap;

/**
 * 1. Two Sum [EASY]
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * E.g. Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {
    // Time Complexity = O(N^2)
    // Space Complexity = O(1)
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {                             // O(N)
            for (int j = i + 1; j < nums.length - 1; j++) {                 // O(N)
                if (nums[i] + nums[j] == target) return new int[]{i, j};    // O(1)
            }
        }
        throw new IllegalArgumentException("Didn't find a match.");         // O(1)
    }

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static int[] twoSumOptimized(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();        // O(1)
        for (int i = 0; i < nums.length; i++) {                 // O(N)
            int comp = target - nums[i];                        // O(1)
            if (!map.containsKey(comp)) {                       // O(1)
                map.put(nums[i], i);                            // O(1)
            } else {                                            // O(1)
                return new int[]{map.get(comp), i};             // O(1)
            }
        }
        throw new IllegalArgumentException("Didn't find a match.");     // O(1)
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        // int[] result = twoSumBruteForce(nums, target);
        int[] result = twoSumOptimized(nums, target);

        System.out.print("[" + result[0]);
        for (int i = 1; i < result.length; i++) {
            System.out.print(", " + result[i]);
        }
        System.out.println("]");
    }
}
