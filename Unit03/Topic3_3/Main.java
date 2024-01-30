package Unit03.Topic3_3;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

 Scanner in = new Scanner (System.in);
    int dogAge = (Integer.parseInt(in.nextLine()));

  if(dogAge < 2){
  System.out.println("Your dog is still a puppy");
  }
  
  else{
      System.out.println("Your dog is no longer a puppy");
  }
  in.close();
  }

}

// javac Unit03/Topic3_3/Main.java; java Unit03.Topic3_3.Main