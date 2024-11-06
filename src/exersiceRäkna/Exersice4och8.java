package exersiceRäkna;

public class Exersice4och8 {
    public static void main(String[] args) {
// exersices 4 och 8
/* Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
Rektangelns sidor ska läsas in.

 */
// rektangels sidor är a och b

 int a=2;
 int b=3;

 // Skriva ut arean

        System.out.println("Arean av rektangeln med sidor " + a + " och " + b + " är " + a*b);

 // Skriva ut omkretsen

        System.out.println("Omkretsen av rektangeln med sidor " + a + " och " + b + " är " + (2*a+2*b));


    /*   . Skapa ett program som läser in tre tal och beräknar och skriver ut summan samt medelvärdet
av de tre talen.
     */

   // de tre tal d, e, f

   int d = 6;
   int e = 8;
   int f = 4;

   // skriva ut summan samt medelvärdet

        System.out.println("Summa av tre talen " + d + ", " + e + " och " + f + " är " + (d+e+f));

        System.out.println("Medelvärde av de tre talen är " + (d+e+f)/3);


    }
}
