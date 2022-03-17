import java.io.*;
import java.util.*;

class Tables {
    public static void main(String[] args) throws IOException {       
        double secoflife, Earthlife, Otherlife, round1,round2;
        String planet;     
       
      
        try {Scanner in = new Scanner(System.in);          
            secoflife = in.nextDouble();
            planet = in.next();
        
            Earthlife = secoflife / 31557600; 
            switch(planet) { case "Merkury":
                Otherlife = Earthlife / 0.2408467;
                round1 = Otherlife*100;
                round2 = Math.round(round1)/100.0;
                System.out.println(round2);
                break;
                case "Wenus":
                Otherlife = Earthlife / 0.61519726;
                round1 = Otherlife*100;
                round2 = Math.round(round1)/100.0;
                System.out.println(round2);
                break;
                case "Ziemia":
                round1 = Earthlife*100;
                round2 = Math.round(round1)/100.0;
                System.out.println(round2);
                break;
                case "Mars":
                Otherlife = Earthlife / 1.8808158;
                round1 = Otherlife*100;
                round2 = Math.round(round1)/100.0;
                System.out.println(round2);
                break;
                case "Jowisz":
                Otherlife = Earthlife / 11.862615;
                round1 = Otherlife*100;
                round2 = Math.round(round1)/100.0;
                System.out.println(round2);
                break;
                case "Saturn":
                Otherlife = Earthlife / 29.447498;
                round1 = Otherlife*100;
                round2 = Math.round(round1)/100.0;
                System.out.println(round2);
                break;
                case "Uran":
                Otherlife = Earthlife / 84.016846;
                round1 = Otherlife*100;
                round2 = Math.round(round1)/100.0;
                System.out.println(round2);
                break;
                case "Neptun":
                Otherlife = Earthlife / 164.79132;
                round1 = Otherlife*100;
                round2 = Math.round(round1)/100.0;
                System.out.println(round2);
                break;           
           }
       }
           catch(Exception e) { System.out.println("Błąd");
           }
    }
}
