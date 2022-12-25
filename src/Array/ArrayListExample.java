package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));

        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(44);
//        list.add(12);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println(list);
//        System.out.println(list.contains(12));
//        list.set(0,12);
//        list.remove(2);
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
                list.add(in.nextInt());
        }

        //get 
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);

    }
}
