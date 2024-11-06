package TDD;

public class PasswordCheck {

    //private String pass;

    //public PasswordCheck (String input) {         // Konstruktor
    //    pass = input;
    //}

    public boolean check(String password) {           // Första metoden
     return true;
    }

    public boolean checkLength(String password) {      // Metod för att kolla längden
        return (password.length() >= 8);
    }

    public boolean checkSiffra(String password) {
        boolean isSiffra = false;

        for (int i = 0; i < password.length(); i++)  {

            if ( Character.isDigit( password.charAt(i))) {
                isSiffra = true;
                break;
            }
        }

        return isSiffra;
    }

    public boolean checkSpecTecken(String password) {
        boolean  isSpecTecken = false;
        int length = password.length();

        for (int i = 0; i < length; i++ )  {
            if ( !( Character.isLetterOrDigit( password.charAt(i)) ) ) {
                isSpecTecken = true;
                break;
            }
        }
        return isSpecTecken;
    }
}
