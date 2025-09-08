package lab1;

public class Reduce {
    public static int reduce(int n) {
        if (n == 1) return 1;
        if (n % 2 == 0) {
            return 1 + reduce(n / 2);
        }
        return 1 + reduce(n - 1);
    }
}
