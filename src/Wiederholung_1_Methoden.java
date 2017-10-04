
public class Wiederholung_1_Methoden {
    public static double einzahlung(double u_konto) {
        System.out.print("Einzahlung: ");
        double einz = Tastatur.liesDouble();
        if (einz < 0) {
            System.out.print("Negativer Wert!");
        } // end of if
        else {
            u_konto += einz;
        } // end of if-else
        return u_konto;
    }

    public static double auszahlung(double u_konto) {
        System.out.print("Auszahlung: ");
        double ausz = Tastatur.liesDouble();
        if (ausz < 0) {
            System.out.println("Negativer Wert!");
        } // end of if
        if (ausz > u_konto) {
            System.out.println("Kein Dispo verfügbar.");
        }
        else {
            u_konto -= ausz;
        } // end of if-else

        return u_konto;
    }

    public static double verzinsung(double u_zins, double u_konto) {
        u_konto += u_konto / 100 * u_zins;
        return u_konto;
    }

    public static double zinssatz(double u_zins) {
        System.out.print("Zinssatz: ");
        double neuzins = Tastatur.liesDouble();
        if (u_zins < 0) {
            System.out.print("Negativer Wert!");
        } // end of if
        else {
            u_zins = neuzins;
        }
        return u_zins;
    }

    public static void ausgabe(double u_konto) {
        System.out.printf("Kontostand: %.2f Euro\n", u_konto);
    }
} // end of class Wiederholung_1_Methoden

