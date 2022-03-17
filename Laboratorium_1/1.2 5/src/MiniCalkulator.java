import java.io.*;
import java.util.*;

class MiniCalkulator {
  public static void main(String[] args) throws IOException {
    int a, b;    
    
      Scanner in = new Scanner(System.in);
       a = in.nextInt();
    b = in.nextInt();
    System.out.println("Dodawanie: " + a  + " + " + b + " = " + (a + b));
    System.out.println("Odejmowanie: " + a + " - " + b + " = " + (a - b));
      System.out.println("Mnożenie: " + a + " * " + b + " = " + (a * b ));
      System.out.println("Dzielenie modulo: " + a + " mod " + b + " = " + (a % b));
      
    
  }
}
