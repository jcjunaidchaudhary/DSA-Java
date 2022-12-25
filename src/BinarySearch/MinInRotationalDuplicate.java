package BinarySearch;

public class MinInRotationalDuplicate {
    public static void main(String[] args) {
        int[] arr={1,1,3,1};
        int ans=findMin(arr);
        System.out.println(ans);


    }
    static int findMin(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }if (mid>start && arr[mid]<arr[mid-1]) {
                return arr[mid];
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end] && mid>start){
                if (arr[start]>arr[start+1]){
                    return arr[start+1];
                }
                start++;
                if (arr[end]<arr[end-1]){
                    return arr[end];
                }
                end--;

            }else if (arr[mid]>arr[start] || (arr[mid]==arr[start] && arr[mid]>arr[end]) ){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return arr[0];

    }
}
