
/*
*
* Binary search:
* to apply this an array must be sorted
* increasing or decreasing order
* take start and end
* mid is middle
* if target is grater than middle change start to m+1
* else change end to m-1
*
*
* */


package Search;

public class BinarySearch {

    public static void main(String[] args) {

    int[] a={1,2,3,4,5,6,7,8,9};
    int x=BS(a,43);
    System.out.println(x);

    }

    public static int BS(int[] a, int target){

        int s = 0;
        int e = a.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(target==a[m]){
                return m;
            }
            else if (target>a[m]) {
                s=m+1;
            }else{
                e=m-1;
            }
        }

        return -1;
    }

}
