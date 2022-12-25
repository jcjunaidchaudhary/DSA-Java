package BinarySearch;

public class SearchInRotated {
    public static void main(String[] args) {
//        int[] arr={6,7,8,9,10,11,2,3,5};
        int[] arr={1};
//        int ans=findPivot(arr);
        int target=0;
        int ans=search(arr,target);
        System.out.println(ans);

    }

    static int search(int[] arr,int target){
        int peak=findPivot(arr);
        if (peak==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if (target==arr[peak]){
            return peak;
        }
        else if (target<arr[0]){
            return binarySearch(arr,target,peak+1,arr.length-1);
        }else {
            return binarySearch(arr,target,0,peak-1);
        }
    }

    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }if (arr[mid] <= arr[start]) {
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid=start+(end-start)/2;

            if (target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
