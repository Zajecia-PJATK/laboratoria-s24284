import java.io.*;
import java.util.*;

class Tables {
  public static void main(String[] args) throws IOException {
      int a, b;
        
      try
      {    
      Scanner in = new Scanner(System.in);
          a = in.nextInt();
          b = in.nextInt();
        int matrix[][] = new int[a][b];
       
          for (int i = 0; i < a; i++)
          { 
              for (int j = 0; j < b; j++)
          {
              matrix[i][j] = in.nextInt();
          }
       
          }
         for (int i = 0; i < matrix[0].length; i++)
         {
           for(int j = 0;j < matrix.length; j++)
           {
               if (j < matrix.length -1)
               {
             System.out.print(matrix[j][i]+" ");
               }
               else
             System.out.print(matrix[j][i]);  
               
           }         
         System.out.println();
           }
      }
      catch(Exception e)
      {
          System.out.println("BŁĄD");
      }
  }
}

