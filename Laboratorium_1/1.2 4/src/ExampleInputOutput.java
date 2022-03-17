import java.io.*;
import java.util.*;
import java.lang.*;

class ExampleInputOutput {
  public static void main(String[] args) throws IOException {
    double result = Math.sqrt(Math.PI);
      double round1 = result*100;
          double round2 = Math.round(round1)/100.0;
    Scanner in = new Scanner(System.in);
    System.out.println(round2);
   
  }
}