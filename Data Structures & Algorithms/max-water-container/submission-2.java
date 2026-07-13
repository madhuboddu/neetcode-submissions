class Solution {

    
    public int maxArea(int[] heights) {
        //int currLength = heights.length-1;
        int curMax = 0;

        int left = 0;
        int right = heights.length-1;
        

        while(left < right){
            int tempHeight = 0;
            if(heights[right] > heights[left]){
                tempHeight = heights[left] * (right-left);
                left++;

            }else{
                tempHeight = heights[right] * (right-left); 
                right--;
            }
            curMax = Math.max(tempHeight, curMax);
        }


        return curMax;

        
    }
}
