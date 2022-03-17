import java.io.*;
import java.util.*;

class Tables {
    public static void main(String[] args) throws IOException {       
        List<Integer> Lista = new ArrayList<Integer>();
                                                                 

        try {
            Scanner in = new Scanner(System.in);          
            while (in.hasNext()) { 
                Lista.add(in.nextInt());
            } 
            System.out.println(max_rec(Lista));
        }
        catch(Exception e) {
                                                                               System.out.println("Błąd");
                                                                           }
    }

    public static int max_rec(List<Integer> v) { 
        int maxValue, second = 0;
              
        if (v.size() == 1) {
            maxValue = v.get(0);            
        } 
        else {
            maxValue = v.get(0);
            v.remove(0);
            second = max_rec(v);
            if (second > maxValue) {
                maxValue = second;
            }           
        }
        return maxValue;
    }

   
}