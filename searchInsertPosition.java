public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0)
            return -1;
        else if (nums[0] > target)
            return 0;
        else if(nums[nums.length-1] < target)
            return nums.length;
            
        return search(nums,target,0,nums.length-1);
    }
    
    public int search(int[]nums, int target,int start, int end){
        int mid = start + (end - start)/2;
        
        if(end - start == 1){
            if(nums[start] == target || nums[start] > target){
                return start;
            }else{
                return end;
            }
        }
        
        if(nums[mid] == target)
            return mid;
        else if(nums[mid] > target){
            return search(nums, target, start, mid);
        }else if(nums[mid] < target){
            return search(nums,target, mid, end);
        }
        
        return -1;
    }
}
