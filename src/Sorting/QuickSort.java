
/*
* take a pivot element
* usually as midpoint of array
* place all elements lesser than pivot at left
* all elements greater than pivot at right
* use recursion
*
* */

package Sorting;

import java.util.Arrays;

public class QuickSort {
    static void main() {
        int[] a = {4,5,3,6,2,7,1,8,0,9};
        qs(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }
    static void qs(int[] a,int low,int high){
        if(low>=high){//to return array every time a recursive function is called, it is a base case for the last returning element
            return;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=a[m];
        while(s<=e){
            while(a[s]<pivot){
                s++;
            }
            while(a[e]>pivot){
                e--;
            }
            if(s<=e){
                swap(a, s, e);//pivot will be at crct place
                s++;
                e--;
            }
            qs(a, low,e );
            qs(a, s,high );


        }


    }
    static void swap(int[] a,int c, int b){
        int temp=a[c];
        a[c]=a[b];
        a[b]=temp;
    }
}
