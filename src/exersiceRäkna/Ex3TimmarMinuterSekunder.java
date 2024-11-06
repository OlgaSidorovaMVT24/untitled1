package exersiceRäkna;

public class Ex3TimmarMinuterSekunder {
    public static void main(String[] args) {

        // Skapa ett program som läser in antal timmar, beräknar och skriver ut hur mycket det
        //blir omvandlat till minuter resp sekunder.

        int timmar = 10;
        int minuter = timmar * 60;
        int sekunder = minuter * 60;

        System.out.println(timmar + " timmar är " + minuter + " minuter och " + sekunder + " sekunder.");

    }
}
