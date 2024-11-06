package exersiceRäkna;

public class Ex5KronorTillDollarEllerPund {
    public static void main(String[] args) {

        // VARFÖR ÄR DET SÅ ???

        // Läs in ett heltal motsvarande svenska kronor och skriv ut motsvarande värde i pund
        //respektive dollar. Antag att kursen är : 1 dollar = 6 kr, 1 pund = 10 kr.

        int kronor = 20;
        double dollarkoef = 1.0/6;
        double pundkurs = 1.0/10;

        System.out.println(dollarkoef  + ",    " + pundkurs);

        System.out.println(kronor + " SEK är " + kronor*dollarkoef + " $ och är " + kronor*pundkurs + " pund.");

        double krdoll = kronor*dollarkoef;
        double krpund = kronor*pundkurs;

        System.out.println(kronor + " SEK är " + krdoll + " $ och är " + krpund + " pund.");

        krdoll = (double)(kronor)/6;
        krpund = kronor*0.1;

        System.out.println(kronor + " SEK är " + krdoll + " $ och är " + krpund + " pund.");



    }
}
