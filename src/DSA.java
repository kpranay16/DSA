import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DSA {
    static void main() {
        /*
        * DP - 42 trapping rain water
        * */
    }

    public boolean isPalindrome_125(String s) {
        s=s.toLowerCase();
        int left  = 0;
        int right = s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }

            left++;
            right--;

        }
        return true;
    }
    public int[] twoSum2_167(int[] numbers, int target) {

        // int[] a= new int[2];
        // int l=0,r=numbers.length-1;
        // while(l<r){
        //     if(numbers[l]+numbers[r] < target){
        //         l++;
        //     }else if(numbers[l]+numbers[r] > target){
        //         r--;
        //     }else{
        //         a[0]=l+1;
        //         a[1]=r+1;
        //         return a;
        //     }
        // }

        int l=0;
        int r=numbers.length-1;

        while(l<r){

            if(numbers[l]+numbers[r]==target){
                return new int[]{l+1,r+1};
            }else if(numbers[l]+numbers[r]>target){
                r--;
            }else{
                l++;
            }

        }

        return new int[]{0,0};

    }
    public void reverseString_344(char[] s) {
        int r=s.length-1;

        for(int i=0; i<s.length/2; i++){
            char t = s[i];
            s[i]=s[r];
            s[r]=t;
            r--;
        }
    }
    public int[] sortedSquares_977(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i]*=nums[i];
        }

        int[] a = new int[nums.length];
        int p = nums.length-1;
        int l=0;
        int r=nums.length-1;

        while(r>=l){
            if(nums[l]>nums[r]){
                a[p]=nums[l];
                l++;
                p--;
            }else{
                a[p]=nums[r];
                r--;
                p--;
            }
        }

        return a;
    }
        public int containerWithMostWater_11(int[] height) {
            int min=0;
            int c=0;
            int prestorage=0;
            int storage=0;
            int l=0;
            int r=height.length-1;
            while(l<r){
                c=0;
                min=height[r];
                if(height[l]<height[r]){
                    min=height[l];
                    c=1;
                }
                storage=min*(r-l);
                if(storage>prestorage){
                    prestorage=storage;
                }
                if(c==1){
                    l++;
                }else{r--;}

            }
            return prestorage;

    }
    public int[] twoSum_1(int[] nums, int target) {
        //    for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(i==j){
        //             continue;
        //         }if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        //    }
        //    return new int[]{0,0};
        int x =0;
        HashMap<Integer,Integer> m = new HashMap();
        for(int i=0; i<nums.length; i++){
            x= target - nums[i];

            if(m.containsKey(x)){
                return new int[]{m.get(x),i};
            }
            m.put(nums[i],i);

        }

        return new int[]{};
    }
    public List<List<Integer>> threeSum_15(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // skip duplicate left
                    while (left < right && nums[left] == nums[left - 1]) left++;

                    // skip duplicate right
                    while (left < right && nums[right] == nums[right + 1]) right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
    public int findClosestNumber_2239(int[] nums) {

        int res = nums[0];
        int a =0;
        for(int i=1;i<nums.length;i++){
            a=nums[i];
            if(Math.abs(res)>Math.abs(a)){
                res=a;
            }
            else if(Math.abs(res)==Math.abs(a) && a>res){
                res = a;
            }
        }

        return res;
    }
    public int[][] mergeArrays_2570(int[][] nums1, int[][] nums2) {

        int i = 0, j = 0;
        List<int[]> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i][0] == nums2[j][0]) {
                result.add(new int[]{
                        nums1[i][0],
                        nums1[i][1] + nums2[j][1]
                });
                i++;
                j++;
            }

            else if (nums1[i][0] < nums2[j][0]) {
                result.add(nums1[i]);
                i++;
            }

            else {
                result.add(nums2[j]);
                j++;
            }
        }

        // Add remaining elements
        while (i < nums1.length) {
            result.add(nums1[i++]);
        }

        while (j < nums2.length) {
            result.add(nums2[j++]);
        }

        return result.toArray(new int[result.size()][]);
    }





}
