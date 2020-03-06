package Array;

public class TrappingRainWater {
    public int trapOptimalSolution(int[] height) {
        // Time complexity = O(N)
        // Space complexity = O(1)
        if (height.length == 0) return 0;
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int waterTrapped = 0;
        while (left < right) {
            if (height[left] > leftMax) leftMax = height[left];
            if (height[right] > rightMax) rightMax = height[right];
            waterTrapped += (leftMax - height[left]) + (rightMax - height[right]);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return waterTrapped;
    }
    
    public int trapDPsolution(int[] height) {
        // Time complexity = O(N)
        // Space complexity = O(N)
        if (height.length == 0) return 0;
        int[] maxHeightFromLeft = new int[height.length];
        int[] maxHeightFromRight = new int[height.length];
        maxHeightFromLeft[0] = height[0];
        maxHeightFromRight[height.length-1] = height[height.length-1];
        for (int i = 1; i < height.length; i++) {
            maxHeightFromLeft[i] = Math.max(height[i], maxHeightFromLeft[i-1]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            maxHeightFromRight[i] = Math.max(height[i], maxHeightFromRight[i+1]);
        }
        int waterTrapped = 0;
        for (int i = 0; i < height.length; i++) {
            waterTrapped += Math.min(maxHeightFromLeft[i], maxHeightFromRight[i]) - height[i];
        }
        return waterTrapped;
    }
}
