package exersiceClass;

public class HellowWorldPrinter {       // en ny klass som kan skriva ut 'Hello World!'
                                     // som heter HellowWorldPrinter
    public void print() {     // metod  som heter print

        System.out.println("Hellow World!");
    }

   public void printManyTimes(int nummer){

       System.out.println();

       for(int i = 0; i < nummer; i++)
        System.out.println("Hellow World!");

   }




}
