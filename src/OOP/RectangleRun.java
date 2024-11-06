package OOP;

import java.util.Scanner;

public class RectangleRun {
    public static void main(String[] args) {

        double lengthL, breddB;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv längden och bredden på din rektangel ");

        lengthL = scanner.nextDouble();
        breddB = scanner.nextDouble();

        Rectangel myRectangle = new Rectangel(lengthL, breddB);

         if (myRectangle.isSquare()) {
             System.out.println("Det är en kvadrat.");
         } else {
             System.out.println("Rektangel");}
        System.out.println("Arean är " + myRectangle.calculateArea());

        System.out.println("Perimetern är " + myRectangle.calculatePerimeter());


    }
}
