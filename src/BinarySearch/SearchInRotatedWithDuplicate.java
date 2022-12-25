package BinarySearch;

public class SearchInRotatedWithDuplicate {
    public static void main(String[] args) {
//        int[] arr={1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
//        int[] arr={1};
//        int[] arr={0,1,4,4,5,6,7};
        int[] arr={10,1,10,10,10};
        int target=2;
        int ans=findPivotDuplicate(arr);
      //  int ans= search(arr,target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target){
        int pivot=findPivotDuplicate(arr);
        if (pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if (target==arr[pivot]){
            return pivot;
        }
        if (target<arr[0]){
            return binarySearch(arr,target,pivot+1, arr.length-1);
        }else {
            return binarySearch(arr,target,0,pivot-1);
        }
    }
    static int findPivotDuplicate(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end] && mid>start){
                if (arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;

            }else if (arr[mid]>arr[start] || (arr[mid]==arr[start] && arr[mid]>arr[end]) ){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid=start+(end-start)/2;

            if (target<arr[mid]){
                end=mid-1;
            } else if (target > arr[mid]) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
