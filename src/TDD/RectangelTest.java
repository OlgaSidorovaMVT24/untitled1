package TDD;

import OOP.Rectangel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangelTest {

    @Test
    @DisplayName("Area 6*5 = 30")


    void area ()

    {
        Rectangel rect = new Rectangel(5.0, 6.0);
        assertEquals(30.0, rect.calculateArea());
    }

  //  private void asserEquals(double i, double v) {
    //}

    @Test
    @DisplayName("Perimeter (6+5)*2 = 22")
    void Perimeter ()

    {
        Rectangel rect = new Rectangel(5.0, 6.0);
        assertEquals(22.0, rect.calculatePerimeter());
    }

}