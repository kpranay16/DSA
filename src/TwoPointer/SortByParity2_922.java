package TwoPointer;

public class SortByParity2_922 {


        public int[] sortArrayByParityII(int[] nums) {

            int l =0,r=1;

            while(l<nums.length-1 && r<nums.length){

                if ((nums[l] & 1) == 0) {
                    l+=2;
                }
                else if ((nums[r] & 1) == 1) {
                    r+=2;
                }
                else {
                    nums[l]= nums[l]+nums[r];
                    nums[r]=nums[l]-nums[r];
                    nums[l]=nums[l]-nums[r];
                    l+=2;
                    r+=2;
                }
            }
            return nums;

        }

}
