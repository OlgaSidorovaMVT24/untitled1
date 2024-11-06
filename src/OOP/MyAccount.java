package OOP;

import java.util.Scanner;

public class MyAccount {

   // Skapa ett program BankAccount som kan hålla 	koll på hur stort saldo man har (pengar på sitt 	konto)

       //     11. 	Utöka programmet så att man kan skriva ut 	saldot

    //    12. 	Utöka programmet så att man kan bestämma 	ett nytt värde för saldo

   //     13. 	Utöka programmet så att man kan lägga till 	och ta bort en viss summa ifrån saldot

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();

        System.out.println("Wälkommen till din bank");
        System.out.println("Vad vill du göra?");
        System.out.println("1  Sätta in pengar på ditt konto");
        System.out.println("2  Ta ut pengar fron ditt konto");
        System.out.println("3  Se saldo");
        System.out.println("4  Avsluta");
        System.out.println("Fyll i / välj en siffra (1 eller 2 eller 3 eller 4) ");

        Scanner scanner = new Scanner(System.in);

        int val = 0;

        while  (val != 4)  {

            val = scanner.nextInt();

            if (val == 4) {
                System.out.println("Hej då, vällkommen åter.");
                break;
            }

            if (val == 1) {
                System.out.println("Hur mycket vill du sätta in?");
                double amount = scanner.nextDouble();
                myAccount.deposit(amount);
            }

            if (val == 2) {
                System.out.println("Hur mycket vill du ta ut?");
                double amount = scanner.nextDouble();
                if (myAccount.withDrawOk(amount)) myAccount.withDraw(amount);
                     else System.out.println("Det går inte. Pengar räcker inte.");
            }

            if (val == 3)  {
                System.out.println("Ditt saldo är  " + myAccount.getSaldo());
            }
            System.out.println("Välj mellan 1, 2, 35 eller 4 ");
        }

    }

}
