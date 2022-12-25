package BinarySearch;

public class FindInMaountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(searchInMountain(arr,target));

    }

    static int searchInMountain(int[] arr,int target){
        int peak=peakIndexInMauntainArray(arr);
        if (target==arr[peak]){
            return peak;
        }

        int firstTry=orderAgnosticOS(arr,target,0,peak-1);
        if (firstTry!=-1){
            return firstTry;
        }else {
            return orderAgnosticOS(arr,target,peak+1,arr.length-1);
        }
    }

    static int peakIndexInMauntainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                return -1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr,int target, int start, int end){
        while (start<=end){
            int mid=start+(end-start)/2;

            if (target>arr[mid]){
                start=mid+1;
            } else if (target < arr[mid]) {
                end=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    static int orderAgnosticOS(int[] arr,int target,int start,int end){
        boolean isAsc=arr[start]<arr[end];
        while (start<=end){
            int mid =start+(end-start)/2;
            if (target==arr[mid]) {
                return mid;
            }
            if (isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if(target>arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
