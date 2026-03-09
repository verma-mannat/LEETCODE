package arrays;
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int total = m + n;
        double median=0;
        
        int[] arr = new int[total];
        
        for(int i = 0; i < n; i++) arr[i] = nums1[i];
        for(int i = 0; i < m; i++) arr[n + i] = nums2[i];
        
        Arrays.sort(arr);
        
        if(total % 2 == 0){
            median = (arr[total/2 - 1] + arr[total/2]) / 2.0;
        } else {
            median = arr[total/2];
        }
        
        return median;
    }
}
