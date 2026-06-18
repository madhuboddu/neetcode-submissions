class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }

        int[] count = new int[26];
        
        for(char sr : (s.toCharArray())){
            count[sr - 'a']++;
        }

        for(char tr : (t.toCharArray())){
            count[tr - 'a']--;
        }

        for(int i : count){
            if(i!=0){
                return false;
            }
        }

          return true;

    }
}
