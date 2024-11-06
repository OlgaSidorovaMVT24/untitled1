package TDD;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {

  @Test
public void firstTestCase() {
      // Arrange
      PasswordCheck pass = new PasswordCheck();
      boolean expected = true;

      // Act
      boolean actual = pass.check ("password");

      // Assert
      assertEquals(expected, actual);
  }

 @Test
 public void PasswordsLenth() {
      // Arrange
     PasswordCheck pass = new PasswordCheck();
     boolean expected = true;

     //Act
     boolean actual = pass.checkLength ("password");

     // Assert
     assertEquals(expected, actual);
 }

 @Test
    public void PasswordHarSiffra()  {
      //arrange
     PasswordCheck pass = new PasswordCheck();
     boolean expected = true;

     // Act
     boolean actual = pass.checkSiffra("pass1word");

     // Assert
     assertEquals(expected, actual);
 }

 @Test
    public void PasswordHarSpecTecken()  {
      PasswordCheck pass = new PasswordCheck();
      boolean expected = true;

      boolean actual = pass.checkSpecTecken("passw$ord");

      assertEquals(expected,actual);

 }



}
