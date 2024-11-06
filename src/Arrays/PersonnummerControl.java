package Arrays;

public class PersonnummerControl {
    public static void main(String[] args) {
       // String personnummer = "12345678-9999";

       char [] persNummer = {'1','2','3','4','5','6','7','8','9','9','9','9','9'};

       if ( persNummer[8] != '-')  {
           System.out.println("OBS! bindestreck saknas mellan födelsedatum och de fyra sista siffrorna!");
       }

    }
}
