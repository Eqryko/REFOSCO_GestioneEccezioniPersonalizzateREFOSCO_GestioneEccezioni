/*
__________        _____                           ___________            .__
\______   \ _____/ ____\____  ______ ____  ____   \_   _____/ ___________|__| ____  ____
 |       _// __ \   __\/  _ \/  ___// ___\/  _ \   |    __)_ /    \_  __ \  |/ ___\/  _ \
 |    |   \  ___/|  | (  <_> )___ \\  \__(  <_> )  |        \   |  \  | \/  \  \__(  <_> )
 |____|_  /\___  >__|  \____/____  >\___  >____/  /_______  /___|  /__|  |__|\___  >____/
        \/     \/                \/     \/                \/     \/              \/
    Studente: Refosco Enrico
    Classe: 5BII
    Materia: TPSIT
    Data: 02/10/2025
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== GESTIONE DATE ===");

        try {
            // Data di default
            Data d1 = new Data();
            System.out.println("Data iniziale (default): " + d1.getData());

            // Inserimento seconda data
            System.out.print("Inserisci giorno: ");
            int g = input.nextInt();
            System.out.print("Inserisci mese: ");
            int m = input.nextInt();
            System.out.print("Inserisci anno: ");
            int a = input.nextInt();

            Data d2 = new Data(g, m, a);

            System.out.println("Hai inserito: " + d2.getData());

            // Calcolo distanza
            long diff = d1.distanzaGiorni(d2);
            System.out.println("Distanza tra le due date: " + diff + " giorni.");

        } catch (DataException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore generico: " + e.getMessage());
        }
    }
}