package Unit01.Xtras;

public class RandomInt {
    public static void main(String[] args) {
        // int grade = (int) (Math.random() * 4) + 9;
        int lo = Integer.parseInt(args[0]);
        int hi = Integer.parseInt(args[1]);

        int result = (int) (Math.random() * (hi - lo + 1)) + lo;
        System.out.println(result);
    }
}
