package exersiceLoop;

public class forLoop {
    public static void main(String[] args) {

        // Skriva ut alla tal från 1 till 100
        System.out.println("Number från 1 to 100");
        for( int a = 0; a < 100; a++)
            System.out.print(a + "  ");

        //Skriva ut alla jämna tal från 1 till 100
        System.out.println();
        System.out.println("Even number from 1 to 100");
        for( int b = 2; b < 101; b+=2)
            System.out.print(b + "  ");

        //skriva ut fibonnaccital

        int c1 = 1;
        int c2 = 1;
        int s = c1 + c2;

        System.out.println(c1);
        System.out.println(c2);

        while (s <= 100){

            System.out.println(s);
            s = c1 + c2;
            c1 = c2;
            c2 = s;

        }


    }
}
