import java.io.*;
import java.util.*;

class Tables {
  public static void main(String[] args) throws IOException {
      int m, n;
      int result = 0;
        
      try
      {    
      Scanner in = new Scanner(System.in);
          n = in.nextInt();
          m = in.nextInt();
        int first_t[] = new int[n];
        int second_t[] = new int[m];
          for (int i = 0; i < n; i++)
          {
          first_t[i] = in.nextInt();
          }
          for (int j = 0; j < m; j++)
          {
              second_t[j] = in.nextInt();
          }
          for (int k = 0; k < n && k < m; k++)
          {
          result = result + (first_t[k] * second_t[k]);
          }
          System.out.println(result);
      }
      catch(Exception e)
      {
          System.out.println("BŁĄD");
      }
  }
}
