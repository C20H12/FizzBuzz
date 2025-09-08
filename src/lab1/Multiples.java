package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());

        for (int i = 0; i < 1000; i++) {
        for (int j = 0; j < 1000; j++) {
        for (int k = 0; k < 1000; k++) {
            assert (multiples(i, j, k) == multiples2(i,j,k));
        }}}

        System.out.println(123);
    }

    public static int multiples(int n, int a, int b) {
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0) cnt++;
            else if (a != b && i % b == 0) cnt++;
        }
        return cnt;
    }

    private static int multiples() {
        return multiples(1000, 3, 5);
    }

    public static int multiples2(int n, int a, int b) {
        int aMults = n / a;
        int bMults = 0;
        int abMults = 0;

        if (n % a == 0) {
            aMults--;
        }

        if (a != b) {
            bMults = n / b;
            if (n % b == 0) {
                bMults--;
            }
            abMults = n / (a * b);
        }
        return aMults + bMults - abMults;
    }
}
