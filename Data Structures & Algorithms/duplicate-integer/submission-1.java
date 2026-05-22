class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> storage = new HashSet<Integer>();

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