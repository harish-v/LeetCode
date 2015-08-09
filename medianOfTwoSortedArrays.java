public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        if((len1 + len2)%2 == 0){
            return (findMedian(nums1, nums2, (len1+len2)/2, 0, len1-1, 0, len2-1)+
                findMedian(nums1, nums2, ((len1+len2)/2)-1, 0, len1-1, 0, len2-1))*0.5;
        }else{
            return (double)findMedian(nums1, nums2, (len1+len2)/2, 0, len1-1, 0, len2-1);
        }
    }
    
    private int findMedian(int[] nums1, int[] nums2, int k, int aStart, int aEnd, int bStart, int bEnd){
        
        int aLen = aEnd - aStart + 1;
        int bLen = bEnd - bStart + 1;
        
        if(aLen == 0) return nums2[bStart + k];
        else if(bLen == 0) return nums1[aStart + k];
        else if(k == 0) return (nums1[aStart] > nums2[bStart])?nums2[bStart]:nums1[aStart];
        
        int aMid = (aLen * k) / (aLen + bLen);
        int bMid = k - aMid - 1;
        
        aMid += aStart;
        bMid += bStart;
        
        if(nums1[aMid] > nums2[bMid]){
            k = k - (bMid - bStart + 1);
            aEnd = aMid;
            bStart = bMid + 1;
        }else{
            k = k - (aMid - aStart + 1);
            bEnd = bMid;
            aStart = aMid + 1;
        }
        
        return findMedian(nums1, nums2, k, aStart, aEnd, bStart, bEnd);
    }
}
