package TwoPointer;

public class RearrangeArrayBySign_2149 {

        public int[] rearrangeArray(int[] nums) {
            int n=nums.length;
            int[] res=new int[n];
            int pos=0;
            int neg=1;
            for(int i:nums){
                if(i>0){
                    res[pos]=i;
                    pos+=2;
                }
                else{
                    res[neg]=i;
                    neg+=2;
                }
            }
            return res;
        }

}
