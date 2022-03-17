import java.io.*;
import java.util.*;

class Picture {
  public static void main(String[] args) throws IOException {
        int star;
    
      Scanner in = new Scanner(System.in);
     do  
     {try 
     {      
           star = in.nextInt();
     }
          catch(Exception e)
      {         
          star = -1;
      }
     }
      while (star < 0);
          for (int i = 1; i <= star; i++) 
		{
			for (int j = 1; j <= star; j++)
			{
				if (j <= i)
					System.out.printf("*");

				else
					System.out.printf("");
			}
			
			System.out.printf("\n");
		}
            for (int i = 1; i <= star; i++)
		{
			for (int j = 1; j <= star; j++)
			{
				if (i <= star - j + 1)
					System.out.printf("*");

				else
					System.out.printf("");
			}
			
			System.out.printf("\n");
		}
        for (int i = 1; i <= star; i++)
		{
			for (int j = 1; j <= star; j++)
			{
				if (j <= i - 1)
					System.out.printf(" ");

				else
					System.out.printf("*");
			}
			System.out.printf("\n");
			
		}
          for (int i = 1; i <= star; i++)
		{
			for (int j = 1; j <= star; j++)
			{
				if (i <= star - j)
					System.out.printf(" ");

				else
					System.out.printf("*");
			}
			
			System.out.printf("\n");
		}
        
      }
       
  }
