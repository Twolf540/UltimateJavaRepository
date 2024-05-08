package SideProjects.APPractice;

public class PalindromicNumbers {
    private int[] list;
    public PalindromicNumbers(int numPalindromes, int start){
        list = new int[numPalindromes];
        int i = 0;
        while(i < list.length){
            if(isPalindromic(start)){
                list[i] = start;
                i++;
            }
            else{
                i--;
                start++;
            }
        }
    }
    public int getSum(){
        int sum = 0;
        for(int x=0; x < list.length; x++){
            sum += (list[x]);
        }
        return sum;
    }
    private boolean isPalindromic(int num){
        return false;
    }
}
