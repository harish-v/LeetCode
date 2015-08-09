public class Solution {
    public int reverse(int x) {
        int result = 0;
        int flag = 1;
        
        flag = (x < 0)?-1:1;
        x *= flag;
        
        while(x > 0){
            if(Integer.MAX_VALUE/10 < result)
                return 0;
            
            if(Integer.MAX_VALUE - (result * 10) < x%10)
                return 0;
                
            result = (x % 10) + (result * 10);
            x /= 10;
        }
        
        return result * flag;
    }
}
