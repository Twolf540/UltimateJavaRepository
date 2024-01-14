package Unit01.Xtras;

public class TwoDSix {
    public static void main(String[] args) {
        int result1 = (int) (Math.random() * (6)) + 1;
        int result2 = (int) (Math.random() * (6)) + 1;
        int resultSum = (int) (result1 + result2);
        System.out.println(resultSum);
    }
}
