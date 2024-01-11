package Unit01.Xtras;

public class TrigIdentity {
    public static void main(String[] args) {
        double angle = Double.parseDouble(args[0]);
        double sinAngle = Math.sin(angle);
        double cosAngle = Math.cos(angle);
        double result = Math.pow(sinAngle, 2) + Math.pow(cosAngle, 2);
        System.out.println(result);
    }
}
