package exersiceClass;

public class Car {

    private String myColor;      // attribut

    public void setColor(String color) {        // metod som gör något
                                                // skriver in/ner/registrerar färgen
        myColor = color;                        // därför det ska vara      void  namn (input)

    }

    public String getColor() {          // metod som gör inget
                                        // utan returnerar det som finns
        return myColor;                 // därför det ska vara      String   namn ()
    }                                   // returnera ett ord - string

}
