class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> mapStore = new HashMap<Integer, Integer>();
        int reqInd = -1;

        for(int n = 0; n<nums.length; n++){

            int req = target - nums[n];

            if(!mapStore.containsKey(req)){
                mapStore.put(nums[n],n);
            }else{
                return new int[]{mapStore.get(req), n};
            }
        }
            return (new int[]{0,0});
        }

    }
