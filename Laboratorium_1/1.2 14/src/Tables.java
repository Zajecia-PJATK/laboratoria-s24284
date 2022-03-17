import java.io.*;
import java.util.*;

class Tables {
  public static void main(String[] args) throws IOException {
       int ile = 0; 
      
      try
      {    
      Scanner in = new Scanner(System.in);
       in.useDelimiter("");          
        char palindromy[] = new char[100];
          while (in.hasNext())
          { 
          palindromy[ile] = in.next().charAt(0);
          ile ++;
          }   
          
          
        for (int j = 0; j < ile; j++)
        {
            if (palindromy[j] != palindromy[ile - 1 - j])
                {
                System.out.println("NIE");
                    return;
                }
            
        }
    
    System.out.println("TAK");
      }
      catch(Exception e)
      {
          System.out.println("BŁĄD");
      }
  }
}