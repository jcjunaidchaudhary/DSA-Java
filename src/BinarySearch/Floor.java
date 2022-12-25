package BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr={2,4,9,12,17,33,42,60};
        int target=-12;
        int  ans=ceiling(arr,target);
        System.out.println(ans);

    }

//    return the index of gretest number <=target
    static int ceiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid= start+(end-start)/2;

            if (target>arr[mid]){
                start=mid+1;

            }else if (target<arr[mid]){
                end=mid-1;
            }else {
                return mid;
            }

        }
        return end;
    }
}
