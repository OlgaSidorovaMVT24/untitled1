package exersiceString;

public class Task1 {
    public static void main (String[] args){
        String string = "Bästa klassen ni är så bra * eller hur";

        int i = 0;
        boolean fortsatt = string.charAt(i) != '*';
        do {
            System.out.print(string.charAt(i));
            i++;
            fortsatt = string.charAt(i) != '*';
        } while (fortsatt);
        System.out.println();

        i=0;
        while (string.charAt(i) != '*') {
            System.out.print(string.charAt(i));
            i++;
        }

        System.out.println();

for (int j=0; j < string.length(); j++) {
    if (string.charAt(j) != '*') System.out.print(string.charAt(j));
    else break;
}

    }
}
