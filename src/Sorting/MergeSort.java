/*
 *  best sorting algorithm among all
 * follows divide and conquer rule
 * divides the array from midpoint
 * here we divide the array into multiple single array
 * left and right in the code are used for this purpose
 * after dividing them to single array then we compare and join them
 *
 * in merge function we take left and right and we return the result array
 * we compare left and right elements
 * the smaller value is pushed first into the result array and bigger value is pushed next
 *
 * imagine binary tree
 * after dividing to single array it becomes tree
 * so while sorting we join every node of tree in ascending order till the original length array occurs
 *
 * ONCE DEBUG THE CODE
 *
 * */

package Sorting;

import java.util.Arrays;

public class MergeSort {

    static void main() {
        int[] arr = { 5,4,6,3,7,3,8,2,9,1,0 };
        int[] b = ms(arr);
        System.out.println(Arrays.toString(b));
    }
    static int[] ms(int[] a) {
        if(a.length == 1){
            return a;
        }
        int m= a.length/2;
        int[] left = ms(Arrays.copyOfRange(a,0,m));
        int[] right = ms(Arrays.copyOfRange(a,m,a.length));

        return merge(left,right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] res= new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length&&j<right.length){
            if(left[i]<=right[j]){
                  res[k] = left[i];
                  i++;
                  k++;
            }else{
                res[k] = right[j];
                j++;
                k++;
            }
        }
        if(i<left.length){
            while(i<left.length){
                res[k] = left[i];
                i++;
                k++;
            }
        }
        if(j<right.length){
            while(j<right.length){
                res[k] = right[j];
                j++;
                k++;
            }
        }

        return res;

    }


}
