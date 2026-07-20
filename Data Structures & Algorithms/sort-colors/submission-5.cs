public class Solution {
    public void SortColors(int[] nums) {

        int left = -1;
        int right = nums.Length;
        int temp = 0;
        int i = 0;

        while(i < right ){

            if(nums[i] == 0){
                left++;
                temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                i++;
                
            }else if (nums[i] == 2){
                right--;
                temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
                
            }else{
                i++;
            }           
        }
   
    }

    
}