
public class Wiederholung_1 {

    public static void main(String[] args) {
        double konto = 0, zins = 0;
        int wahl;

        do {
            System.out.println("\n1. Einzahlung");
            System.out.println("2. Auszahlung");
            System.out.println("3. Verzinsung");
            System.out.println("4. Ausgabe");
            System.out.println("5. Zinssatz festlegen");
            System.out.println("9. Beenden");

            wahl = Tastatur.liesInt();

            switch (wahl) {
                case 1:
                    konto = Wiederholung_1_Methoden.einzahlung(konto);
                    break;
                case 2:
                    konto = Wiederholung_1_Methoden.auszahlung(konto);
                    break;
                case 3:
                    konto = Wiederholung_1_Methoden.verzinsung(zins, konto);
                case 4:
                    Wiederholung_1_Methoden.ausgabe(konto);
                    break;
                case 5:
                    zins = Wiederholung_1_Methoden.zinssatz(zins);
                default:
            } // end of switch


        } while (wahl != 9); // end of
    } // end of main
}
