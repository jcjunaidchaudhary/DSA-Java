package Array;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
//        int[] arr= {};
        int[] arr={12,3,4,2,6};
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,2));
    }

    static int maxRange(int[] arr, int start, int end){
        if (start>end){
            return -1;
        }

        if (arr==null){
            return -1;
        }
        int maxVal=arr[start];
        for (int i = 1; i < end; i++) {
            if (arr[i]>maxVal) {
                maxVal=arr[i];
            }
        }
        return maxVal;
    }



    static int max(int[] arr){
        if (arr.length==0){
            return -1;
        }
        int maxVal=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>maxVal) {
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

}
