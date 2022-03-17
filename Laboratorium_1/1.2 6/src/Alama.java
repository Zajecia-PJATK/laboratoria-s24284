import java.io.*;
import java.util.*;
import java.lang.*;

class Alama {
  public static void main(String[] args) throws IOException {
      String a;
      String b;
   
    Scanner in = new Scanner(System.in);
      in.useDelimiter(" ");
      a = in.next();
      b = in.next();
    System.out.println("\"%" + b + " " + a + "%\"");
   
  }
}