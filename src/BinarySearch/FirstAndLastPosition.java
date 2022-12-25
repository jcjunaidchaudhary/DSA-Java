package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3,4,4,4,5,7,7,7,9};
        int target=3;
        int[] ans=searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
//        int ans=search(arr,target,true);
//        System.out.println(ans);
;
    }

    static int[] searchRange(int[] nums, int target){
        int[] ans={-1,-1};

        int start=search(nums,target,true);
        int end=search(nums,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }

    static int search(int[] nums, int target, boolean findFirstIndex){


        int ans=-1;
        int start=0;
        int end =nums.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if (target<nums[mid]){
                end=mid-1;
            } else if (target>nums[mid]) {
               start=start+1;
            }else {
                ans=mid;
                if (findFirstIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }

        }
    return ans;
    }

}
