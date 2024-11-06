package Arrays;

public class array50Tal {
    public static void main(String[] args) {
        int[] talen50 = { 20, 21,22,23,24,25,26,27,28,29,
                           19,18,17,16,15,18,15,10,21,17,
                           15,76,45,44,88,36,57,24,78,99,
                           66,45,98,99,77,79,75,43,52,57,
                           86,93,72,83,85,33,32,35,37,38};

        for (int i =0; i < 50; i++)
            talen50 [i] = 2* talen50 [i];

        for (int i=0; i < 50; i += 2) talen50 [i] = talen50 [i] + talen50 [1];

    }
}
