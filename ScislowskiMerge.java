import java.util.Arrays;

public class ScislowskiMerge {

    private static int[] merge(int[] arr1, int[] arr2) {
        // assume arr1 and arr2 are sorted
        int[] result = new int[arr1.length + arr2.length];

        int pos1 = 0, pos2 = 0;
        int resultPos = 0;

        while (resultPos < result.length) {
            // if we're at the end of array1
            if (pos1 == arr1.length) {
                result[resultPos] = arr2[pos2];
                pos2++;
                // if we're at the end of array 2
            } else if (pos2 == arr2.length) {
                result[resultPos] = arr1[pos1];
                pos1++;
            } else if (arr1[pos1] < arr2[pos2]) {
                result[resultPos] = arr1[pos1];
                pos1++;
            } else {
                result[resultPos] = arr2[pos2];
                pos2++;
            }
            resultPos++;
        }
        return result;
    }

    private static int[] mergeSortHelper(int[] arr) {
        int[] arr1 = new int[arr.length / 2];
        int[] arr2 = new int[arr.length / 2];
        if(arr.length > 1){
            int pos1 = 0, pos2 = 0;
            for(int i = 0; i < arr.length; i++){
                if (i < arr.length / 2) {
                    arr1[pos1] = arr[i];
                    pos1++;
                } else {
                    arr2[pos2] = arr[i];
                    pos2++;
                }
            }
            int[] sortedLeft = mergeSortHelper(arr1);
            int[] sortedRight = mergeSortHelper(arr2);
            return merge(sortedLeft, sortedRight);
        } else {
            return arr;
        }
    }

    public static void main(String[] args) {
        // int[] merged = merge(new int[] {1, 1, 9, 14}, new int[] {6, 8, 9, 99});
        // System.out.println(Arrays.toString(merged));
        int[] arr = {3, 1, 8, 6, 4, 2, 7, 5};
        int[] sorted = mergeSortHelper(arr);
        System.out.println(Arrays.toString(sorted));
    }

    
}
