package Unit10;

public class Topic10_1Recursion {

    public static int sumOfArray(int[] a, int position) {
        // write a recursive function that returns the sum of the elements
        if(position == a.length){
            return 0;
        }
        int curr = a[position];
        if(position < a.length){
            return curr + sumOfArray(a, position + 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sumOfArray(new int[] {3, 1, 5, 2}, 0 ));
    }
}
