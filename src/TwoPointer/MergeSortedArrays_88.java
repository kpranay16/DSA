package TwoPointer;

import java.util.Arrays;

public class MergeSortedArrays_88 {


    public void merge_bruteforce(int[] nums1, int m, int[] nums2, int n) {
        int p1=0,p2=nums1.length-m;
        int x=0;

        for(int i=nums1.length-n; i<m+n; i++){
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
        // return nums1;


    }


    public void merge_optimized(int[] nums1, int m, int[] nums2, int n) {
        int mergePos = m+n-1;
        int p1 = m-1 ;
        int p2 = n-1;

        while(p1 >= 0 && p2 >= 0){
            if(nums2[p2]>nums1[p1]){
                nums1[mergePos--]=nums2[p2--];
            }else{
                nums1[mergePos--]=nums1[p1--];
            }

        }
        while(p2>=0){
            nums1[mergePos--]=nums2[p2--];
        }

    }

}
