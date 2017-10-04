/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 14.09.2017
  * @author 
  */

public class Wiederholung_2_Methoden {
  
  public static boolean existenz(int u_num) {
    boolean ex = false;
    if (u_num >= 0 && u_num < 10) {
      ex = true;
    } // end of if
    else {
      System.out.println("Kontonummer existiert nicht!");
    } // end of if-else
    return ex;
  }  
  
  public static double einzahlung(double u_sparkonten) {
    System.out.print("Einzahlung: ");
    double einz = Tastatur.liesDouble();
    if (einz < 0) {
      System.out.print("Negativer Wert!");
    } // end of if
    else {
      u_sparkonten += einz;
    } // end of if-else
    return u_sparkonten;    
  }
    
  public static double auszahlung(double u_sparkonten) {
    System.out.print("Auszahlung: ");
    double ausz = Tastatur.liesDouble();
    if (ausz < 0) {
      System.out.println("Negativer Wert!");
    } // end of if
    if (ausz > u_sparkonten) {
      System.out.println("Kein Dispo verf�gbar.");
      }
    else {
      u_sparkonten -= ausz;
    } // end of if-else
    
    return u_sparkonten;
  }
    
  public static double verzinsung(double u_zins) {
    System.out.print("Neuer Zinssatz: ");
    double neuzins = Tastatur.liesDouble();
    if (u_zins < 0) {
      System.out.print("Negativer Wert!");
    } // end of if
    else {
      u_zins = neuzins;
    }
    return u_zins;
  }
  
  public static double[] verzinsung(double[] u_sparkonten, double u_zins) {
    System.out.println("Alle Konten verzinsen? (y/n)");
    char a = Tastatur.liesChar();
    int num;
    boolean ex;

    if (a == 'y') {
      for (int i = 0; i < u_sparkonten.length; i++) {
        u_sparkonten[i] += u_sparkonten[i] / 100 * u_zins;
      } // end of for
    } // end of if
    else {
      System.out.print("Kontonummer: ");
      num = Tastatur.liesInt();
      ex = Wiederholung_2_Methoden.existenz(num-1);
      if (ex) {
        u_sparkonten[num-1] += u_sparkonten[num-1] / 100 * u_zins;
      } // end of if
    } // end of if-else  
    return u_sparkonten;
  }
    
  public static void ausgabe(double u_sparkonten) {
    System.out.printf("Kontostand: %.2f Euro\n", u_sparkonten);
  }

  public static double zinsrate(double u_zins) {
    System.out.print("Zinsrate: ");
    u_zins = Tastatur.liesDouble();
    return u_zins;
  }
} // end of class Wiederholung_1_Methoden

