package OOP;

public class Rectangel {

private double length, bredd;      //  Attributen

//  Konstruktor:
    public Rectangel(double inputL, double inputB){
        length = inputL;
        bredd = inputB;
    }

//  Metoderna:
    public double calculateArea()  {
        return length*bredd;
    }
    public double calculatePerimeter() {
        return (length + bredd)*2;
    }

    // En till metod, utöka med isSquare
    public boolean isSquare()  {

        if (length == bredd) {
        return true;}
        else { return false;  }
    }

}
