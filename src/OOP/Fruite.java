package OOP;

import java.util.Scanner;

public class Fruite {
    private String color;

    public void setColor(String string) {
        System.out.println("Vilken färg har din frukt som är " + string + "?");
        Scanner scannerColor = new Scanner(System.in);

        color = scannerColor.next();
    }

    public void printColor(String fruite) {
        System.out.println();
        System.out.println(fruite + " är " +color);
    }
}
