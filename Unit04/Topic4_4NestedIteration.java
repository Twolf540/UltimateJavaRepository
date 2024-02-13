package Unit04;

public class Topic4_4NestedIteration {
    public static void main(String[] args) {
        int h;
        for(h = 0; h < 1; h++){
            for(int m = 0; m < 60; m++){
                for(int s = 0; s < 60; s++){
                    System.out.print(h + " ");
                    System.out.print(m + " ");
                    System.out.println(s);
                }
                
            }
        }
        if(h == 1){
            System.out.println(h + " 0 0");
        }
    }
}

// javac Unit04\Topic4_4NestedIteration.java
// java Unit04.Topic4_4NestedIteration