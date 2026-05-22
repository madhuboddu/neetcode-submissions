class Solution {
    public boolean hasDuplicate(int[] nums) {

        ArrayList<Integer> storage = new ArrayList<Integer>();

        int longthu = nums.length;

        for(int i = 0 ; i < longthu; i++){

            if(storage.contains(nums[i])){
                return true;
            }else{
                storage.add(nums[i]);
            }
        }
        
        return false;
    }
}