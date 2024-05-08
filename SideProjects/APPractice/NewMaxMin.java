package SideProjects.APPractice;

public class NewMaxMin {
    public static int findMax(int [] values){
        int max = values[0];
        for(int x = 0; x < values.length; x++){
            if(values[x] > max){
                max = values[x];
            }
        }
        return max;
    }
    public static int findMin(int [] values){
        int min = values[0];
        for(int x = 0; x < values.length; x++){
            if(values[x] < min){
                min = values[x];
            }
        }
        return min;
    }
}

