/*
* worst sorting algorithm
 *  in an array find the max/min number and place at right or left side of array by swapping
 * now after placing the max/min no at correct position now just consider the array excluding the max/min number
 * follow this until n iterations
*
* */

package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int[] a={6,5,4,7,3,2,20,1};
        ss(a);
        System.out.println(Arrays.toString(a));
    }
    static void ss(int[] a){
        for (int i = a.length-1; i >= 0; i--) {
            int max = i;
            for (int j = i; j >= 0; j--) {
                if(a[j]>a[max]){
                    max = j;
                }
            }
            int temp = a[max];
            a[max] = a[i];
            a[i] = temp;
        }
    }
}
