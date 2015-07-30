public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] buf = new int[len];
        
        for(int i = 0;i < len; i++){
            if((i+k) >= len){
                buf[(i+k)%len] = nums[i];
            }else{
                buf[i+k] = nums[i];
            }
        }
        
        for(int i = 0;i<len; i++){
            nums[i] = buf[i];
        }
    }
}
