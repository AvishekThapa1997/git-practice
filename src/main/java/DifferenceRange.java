public class DifferenceRange {
    public int differenceOfSum(int m, int n) {
        if (m < 0 || n < 0) return -1;
        int divisible = 0;
        int nonDivisible = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0)
                divisible += i;
            else
                nonDivisible += i;
        }
        return nonDivisible - divisible;
    }

    public static void main(String[] args) {

    }
}
