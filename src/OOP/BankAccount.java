package OOP;

public class BankAccount {

    private double saldo;

    public double getSaldo(){
        return saldo;
    }

     //  public void setSaldo(double newSaldo) {
     //    saldo = newSaldo;
     //  }

    public void deposit(double amount) {
        saldo = saldo + amount;
    }

    public void withDraw(double amount) {
        saldo = saldo-amount;
    }

    public boolean withDrawOk(double amount) {
        if (saldo > amount) return true;
             else return false;
    }


  //  Skapa ett program BankAccount som kan hålla 	koll på hur stort saldo man har (pengar på sitt 	konto)

            //11. 	Utöka programmet så att man kan skriva ut 	saldot

        //12. 	Utöka programmet så att man kan bestämma 	ett nytt värde för saldo

        //13. 	Utöka programmet så att man kan lägga till 	och ta bort en viss summa ifrån saldot

}
