package exersiceRäkna;

public class Ex2lön {
    public static void main(String[] args) {
        // En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
        //försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
        //Försäljningssumman ska läsas in.

        int GRUNDLÖN = 8000;
        int procent = 9;
        int försäljningssumman = 1111;
        int lön = GRUNDLÖN + försäljningssumman * procent / 100;

        double löndec = (double)(GRUNDLÖN) + (double)(försäljningssumman * procent) /100;

        System.out.println("lön är " + lön);
        System.out.println("lön med öre är " + löndec);       // varför öre = 0?


    }
}
