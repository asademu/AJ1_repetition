/**
  *
  * 
  *
  * @version 1.0 vom 14.09.2017
  * @author: Julian A. Hasse 
  */


public class Wiederholung_2 {
         
  public static void main(String[] args) {
    boolean ex;
    int wahl, num;
    final int ANZ = 10;
    double zins = 0, sparkonten[] = new double[ANZ];
    
    do {
      System.out.println("\n1. Einzahlung");
      System.out.println("2. Auszahlung");
      System.out.println("3. Verzinsung");
      System.out.println("4. Ausgabe");
      System.out.println("5. Zinsrate");
      System.out.println("9. Beenden");
      
      wahl = Tastatur.liesInt();
      
      switch (wahl) {
        case 1:
        case 2:
          System.out.print("Kontonummer: ");
          num = Tastatur.liesInt();
          ex = Wiederholung_2_Methoden.existenz(num-1);
          
          if (ex) {
            if (wahl == 1) {
              sparkonten[num-1] = Wiederholung_2_Methoden.einzahlung(sparkonten[num-1]);
            } // end of if
            else {
              sparkonten[num-1] = Wiederholung_2_Methoden.auszahlung(sparkonten[num-1]);
            } // end of if-else
          } // end of if
          break;
        case 3: 
          sparkonten = Wiederholung_2_Methoden.verzinsung(sparkonten, zins);
          break;
        case 4:
          System.out.print("Kontonummer: ");
          num = Tastatur.liesInt();
          ex = Wiederholung_2_Methoden.existenz(num-1);
          if (ex) {
            Wiederholung_2_Methoden.ausgabe(sparkonten[num-1]);
          } // end of if
          break;
        case 5:
          zins = Wiederholung_2_Methoden.zinsrate(zins);
        default:           
      } // end of switch      
    } while (wahl != 9); // end of
  } // end of main
}  