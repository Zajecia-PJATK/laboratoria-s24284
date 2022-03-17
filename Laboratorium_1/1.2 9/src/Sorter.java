import java.io.*;
import java.util.*;

class Sorter {
  public static void main(String[] args) throws IOException {
    double a, b, c;    
    
      Scanner in = new Scanner(System.in);
      
       a = in.nextDouble();
       b = in.nextDouble();
       c = in.nextDouble();
      
      if (a < b && a < c)
      {
          if (b < c)
          {
          System.out.printf("%.6f %.6f %.6f\n", a, b, c);
          }
          else
          {
              System.out.printf("%.6f %.6f %.6f\n", a, c, b);
          }
      }
      else if (b < a && b < c)
      {
           if (a < c)
          {
          System.out.printf("%.6f %.6f %.6f\n", b, a, c);
          }
         else
         {
             System.out.printf("%.6f %.6f %.6f\n", b, c, a);
         }
      }
      else if (c < a && c < b)
      {
           if (a < b)
          {
          System.out.printf("%.6f %.6f %.6f\n", c, a, b);
          }
         else
         {
             System.out.printf("%.6f %.6f %.6f\n", c, b, a);
         }          
      } 
      if (a > b && a > c)
      {
          if (b > c)
          {
          System.out.printf("%.6f %.6f %.6f", a, b, c);
          }
          else
          {
              System.out.printf("%.6f %.6f %.6f", a, c, b);
          }
      }
      else if (b > a && b > c)
      {
           if (a > c)
          {
          System.out.printf("%.6f %.6f %.6f", b, a, c);
          }
         else
         {
             System.out.printf("%.6f %.6f %.6f", b, c, a);
         }
      }
      else if (c > a && c > b)
      {
           if (a > b)
          {
          System.out.printf("%.6f %.6f %.6f", c, a, b);
          }
         else
         {
             System.out.printf("%.6f %.6f %.6f", c, b, a);
         }          
      }     
  }
}