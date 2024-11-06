package exersiceString;

import java.util.Scanner;

public class ExMedCharAt {
    public static void main(String[] args) {
        Scanner scanText = new Scanner(System.in);
        System.out.println("Mata in textsträng:");
        String text = scanText.nextLine();
        System.out.println();

        for (int i=0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");

        }

        if (text.equals("ägg")) {
            System.out.println("ägg är knasigt");
        }
    }

}
