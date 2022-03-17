import java.io.*;
import java.util.*;

class Tables {
    public static void main(String[] args) throws IOException {       
        String word = ""; 
       
      
        try {    
            Scanner in = new Scanner(System.in);            
           
            word = in.nextLine();
            word = word.toLowerCase();       
              
            Boolean[] alphabetMarker = new Boolean[26];
            Arrays.fill(alphabetMarker, false);
            int alphabetIndex = 0;         
            for (int i = 0; i < word.length(); i++) {
                if ('a' <= word.charAt(i) && word.charAt(i) <= 'z') {
                    alphabetIndex = word.charAt(i) - 'a';
                    alphabetMarker[alphabetIndex] = true;
                }
            }
            for (boolean index : alphabetMarker) {
                if (!index) {                    
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
            return;
            
        }      
      
        catch(Exception e)
        {
          System.out.println("false");
        }
    }
}
              
     