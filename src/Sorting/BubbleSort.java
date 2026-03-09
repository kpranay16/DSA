/*
*
* place the largest element at last
* after placing at last dont consider that elment in next steps
*
*
* */
package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a={1,3,5,2,9,7,5,6};
        bs(a);
        System.out.println(Arrays.toString(a));
    }

    public static void bs(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {
            boolean swap=false;
            for (int j = 0; j < arr.length - i -1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) {break;}
        }
//        return arr;
    }

}
