package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in );

        // array of primitives
        int[] arr=new int[3];
        arr[0]=22;
        arr[1]=12;
        arr[2]=97;

        System.out.println(arr[2]);

        //input using for loop
        for(int i=0; i<arr.length; i++){
            arr[i]= in.nextInt();
        }

//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

        for(int num :arr){
            System.out.print(num+" ");
        }

        System.out.println();
        //array of objects

        String[] str = new String[3];

        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }

        System.out.println(Arrays.toString(str));

        str[1]="Arfan";
        System.out.println(Arrays.toString(str));
    }
}
