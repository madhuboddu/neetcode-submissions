class Solution {
    public int maxArea(int[] heights) {
        int curMax = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int tempHeight = Math.min(heights[left], heights[right]) * (right - left);
            curMax = Math.max(tempHeight, curMax);

            if (heights[right] > heights[left]) {
                left++;
            } else {
                right--;
            }
        }

        return curMax;
    }
}
