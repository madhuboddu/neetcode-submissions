class Solution {
    public boolean isPalindrome(String s) {

        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] strArray = str.toCharArray();
        int len = strArray.length;
        int j = len-1;
       for(int i = 0 ; i<len; i++){
            if(strArray[i] == strArray[j]){
                j--;
            }else{
                return false;
            }
       }
        
        return true;
    }
}
