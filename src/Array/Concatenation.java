package Array;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        int[] arr={2,3,7,6};
        int[] ans=getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        int m=0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            ans[i+m]=nums[i];
            if(i==nums.length-1){
                i=0;
                m=nums.length;
                count++;
                ans[i+m]=nums[i];
                if(count ==2){
                    break;
                }
            }

        }
        return ans;
    }

}
