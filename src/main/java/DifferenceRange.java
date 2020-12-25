public class DifferenceRange {
    public int differenceOfSum(int m, int n) {
        if (m < 0 || n < 0) return -1;
        int divisibleSum = 0;
        int nonDivisibleSum = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0)
                divisibleSum += i;
            else
                nonDivisibleSum += i;
        }
        System.out.println(nonDivisibleSum - divisibleSum);
        return nonDivisibleSum - divisibleSum;
    }

    public static void main(String[] args) {
        DifferenceRange differenceRange = new DifferenceRange();
        System.out.println(differenceRange.differenceOfSum(18, 2));
    }
}
