package TDD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestUser {

    @Test
    void testUserKonstruktor () {

     User user = new User("Mamman", "Babis");

    // assertEquals("Mamman", user.userName);
    // assertEquals( "Babis", user.password);

    }

    @Test
    void TestUserName()  {
        User user = new User("Mamman", "Babis");
        String userName = user.userName;
        assertEquals("Mamman", user.userName);
    }

    @Test  //!!!  VOPROS
    void TestUserPassword()  {
        User user = new User("Mamman", "Babis");
      //  String userName = user.userPassword;
     //   assertEquals("Babis", user.userPassword);

    }




}
