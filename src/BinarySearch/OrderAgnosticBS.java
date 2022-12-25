package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr={-12,-2,0,3,5,8,9,12,33,46,80};
        int[] arr={80,70,66,43,32,12,4,2,-7,-8};
        int target=70;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end= arr.length-1;

        boolean isAsc= arr[start]<arr[end];

        while (start<=end){
            int mid=start+(end-start)/2;

            if (target==arr[mid]){
                return mid;
            }

            if (isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if (target>arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}
