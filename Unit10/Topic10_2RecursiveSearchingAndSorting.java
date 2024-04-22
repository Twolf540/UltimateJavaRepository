package Unit10;

public class Topic10_2RecursiveSearchingAndSorting {
    public void merge(int [] myArray, int low, int high, int middle){
        int [] sortedArray = new int[high - low];
        for(int x = low; x < high; x++){
            sortedArray[x] = myArray[x];
        }
        for(int y = 0; y < sortedArray.length - 1; y++){
            for(int z = 1; z < sortedArray.length; z++){        
                if(sortedArray[y] > sortedArray[z]){
                    int temp = sortedArray[y];
                    sortedArray[y] = sortedArray[z];
                    sortedArray[z] = temp;
                }
            }
        }
    }
    public int mergeSort(int [] myArray, int low, int high){
        if(myArray.length > 1){
            return mergeSort(myArray, low, high);
        }
        else{
            return myArray[low];
        }
    }
    public void mergeSortHelper(int [] myArray, int low, int high){
        if(low < high){
            int middle = (low + high) / 2;
            mergeSort(myArray, low, middle);
            mergeSort(myArray, middle + 1, high);
            merge(myArray, low, middle, high);
        }
    }
    public static void main(String[] args) {

    }
}
