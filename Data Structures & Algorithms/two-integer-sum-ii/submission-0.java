class Solution {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> storeMap = new HashMap<Integer,Integer>();

        
        for(int i = 0; i<numbers.length; i++){

            int difference = target - numbers[i];

            if(!storeMap.containsKey(difference)){
                storeMap.put(numbers[i],i);
            }else{
                return new int[] {storeMap.get(difference)+1, i+1};
            }
        }

        return new int[] {1, 1};
        
    }
}
