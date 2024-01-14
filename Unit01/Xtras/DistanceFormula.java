package Unit01.Xtras;

public class DistanceFormula {
    public static void main(String[] args) {
         //declares the x and y values of the two points
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        //finds the distance between the two points
        double distance = (double) (Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));
        //Displays the distance found
        System.out.println(distance);
    }
}
