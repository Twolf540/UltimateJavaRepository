package Unit06;

import java.util.Arrays;

public class Topic6_3EnhancedForLoopForArrays {
    public static void main(String[] args) {
        
        int[] a1 = {1, 2, 3, 4, 5};
        // int[] a2 = {1, 2, 3, 4, 5};
        // // for loops can modify arrays
        // for (int i = 0; i < a1.length; i++) {
        //     a1[i] = 99;
        // }

        // System.out.println(Arrays.toString(a1));

        // // enhanced for loops can't modify arrays
        // for (int num : a2) {
        //     System.out.println("num is: " + num);
        //     num = 99;
        //     System.out.println("now num is: " + num);
        // }

        // System.out.println(Arrays.toString(a2));

        // printing an array directly is gross...
        System.out.println(a1);

        // printing using an enhanced for loop
        for (int item : a1) {
            System.out.println(item);
        }

        // printing using the Arrays.toString() method
        Arrays.toString(a1);


    }
}
