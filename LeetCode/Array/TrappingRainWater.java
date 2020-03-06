package Array;

public class TrappingRainWater {
    public int trap(int[] height) {
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
