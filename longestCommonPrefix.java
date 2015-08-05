public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
            
        String result = strs[0]; 
        
        for(int i = 1; i < strs.length; i++){
            int j = 0;
            for(; j < strs[i].length() && j < result.length(); j++){
                if(strs[0].charAt(j) != strs[i].charAt(j)){
                    result = strs[0].substring(0,j);
                    break;
                }
            }
            
            if(j == strs[i].length())
                result = strs[i];
        }
        
        return result;
    }
}
