package exersiceLoop;

public class whileLoop {

    public static void main(String[] args) {

        // Skriva ut alla tal från 1 till 100

        int a =1;
        while ( a <= 100) {
            System.out.println(a);
            a++;
        }


        //Skriva ut alla jämna tal från 1 till 100

        int b = 2;
        while ( b <= 100) {
        System.out.println(b);
        b += 2;
        }




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
