
/*
 * Sort till the index number
 * let n be length of array
 * i-->0 j--> i+1
 * its like two pointer
 * i will be at start and carries the main iteration
 * j will be responsible for nested iteration
 * j will be at the end of the considered array limit will be <0 because we compare j with j-1 index
 * swap that largest term to right
 *
 * */

package Sorting;

import java.util.Arrays;

public class InsertionSort {

    static void main() {
        int[] a= {4,3,5,2,6,1,7};
        is(a);
        System.out.println(Arrays.toString(a));
    }

    static void is(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(a[j]<a[j-1]) {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }

}
