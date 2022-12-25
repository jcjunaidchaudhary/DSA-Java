package Array;

import java.util.ArrayList;

public class Candy {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,3};
        int candy=3;
        System.out.println(kidWithCandies(arr,candy));
    }
    static ArrayList<Boolean> kidWithCandies(int[] arr, int extraCandies){
        ArrayList<Boolean> List=new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]+extraCandies<arr[j]){
                    List.add(false);
                    break;
                }
            }
            if (i!=0 && List.get(i-1)==false ){
            List.add(true);}
        }
        return List;
    }
}
