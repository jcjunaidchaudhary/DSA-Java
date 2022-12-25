package BinarySearch;

public class MinimumInRotational {
    public static void main(String[] args) {
//        int[] arr={4,6,7,8,0,1,2,3};
        int[] arr={11,13,15,17};
//        int[] arr={1,2};
       // int[] arr={2,3,4,5,1};
        //int ans= findPivot(arr);
        int ans= findMin(arr);
        System.out.println(ans);

    }


    static int findMin(int[] nums){
        int start=0;
        int end=nums.length-1;
        while (start<end){
            int mid=start+(end-start)/2;

            if (mid>start && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if (mid<end && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if (nums[mid]>=nums[start]){
                start=mid+1;
            }else {
                end=mid-1;
            }

        }
    return nums[0];

    }

//    static int findMin(int[] num) {
//        int pivot=findPivot(num);
//        return num[pivot+1];
//
//    }
//
//    static int findPivot(int[] arr){
//        int start=0;
//        int end=arr.length-1;
//
//        while (start<=end){
//            int mid=start+(end-start)/2;
//
//            if(mid<end && arr[mid]>arr[mid+1]){
//                return mid;
//            }if (mid>start && arr[mid]<arr[mid-1]) {
//                return mid-1;
//            }if (arr[mid] <= arr[start]) {
//                end=mid-1;
//            }else {
//                start=mid+1;
//            }
//        }
//        return -1;
//    }
}
