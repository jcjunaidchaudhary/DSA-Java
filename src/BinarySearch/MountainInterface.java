package BinarySearch;


interface MountainArray{
    int get(int index);
    int length();
}

public class MountainInterface implements MountainArray {
    static int[]  arr={2,4,5,8,5,3,1};

    public static void main(String[] args) {
        MountainArray mountainArray = new MountainArray() {
            @Override
            public int get(int index){
                int ele = arr[index];
                return ele;
            }

            @Override
            public int length() {
                return 0;
            }
        };
        int target=3;
        System.out.println(searchInMountain(mountainArray,target));
    }

    public int get(int index){
        int ele = arr[index];
        return ele;
    }

    public int length() {
        return 0;
    }

    static int searchInMountain(MountainArray arr,int target){
        int peak=peakIndexInMountainArray(arr);
        if (target==arr.get(peak)){
            return peak;
        }

        int firstTry=orderAgnosticOS(arr,target,0,peak-1);
        if (firstTry!=-1){
            return firstTry;
        }else {
            return orderAgnosticOS(arr,target,peak+1,arr.length()-1);
        }
    }

    public static int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid+1)) {
                end = mid;
            } else if (arr.get(mid) < arr.get(mid+1)) {
                start = mid + 1;
            } else {
                return -1;
            }
        }
        return start;
    }
    static int orderAgnosticOS(MountainArray arr,int target,int start,int end){
        boolean isAsc=arr.get(start)<arr.get(end);
        while (start<=end){
            int mid =start+(end-start)/2;
            if (target==arr.get(mid)) {
                return mid;
            }
            if (isAsc){
                if(target<arr.get(mid)){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if(target>arr.get(mid)){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }


}
