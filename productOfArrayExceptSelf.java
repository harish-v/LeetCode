public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int temp = 1;
        
        for(int i = 0;i < nums.length;i++){
            output[i] = temp;
            temp *= nums[i];
        }
        
        temp = 1;
        for(int i = nums.length-1; i >=0; i--){
            output[i] *= temp;
            temp *= nums[i];
        }
        
        return output;
    }
}
