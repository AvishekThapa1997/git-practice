public class DifferenceRange {
    public int differenceOfSum(int m, int n) {
        if (m < 0 || n < 0) return -1;
        int divisibleSum = 0;
        int nonDivisibleSum = 0;
        for (int val = 1; val <= m; val++) {
            if (val % n == 0)
                divisibleSum += val;
            else
                nonDivisibleSum += val;
        }
        return nonDivisibleSum - divisibleSum;
    }

    public static void main(String[] args) {
        DifferenceRange differenceRange = new DifferenceRange();
        System.out.println(differenceRange.differenceOfSum(10, 2));
    }
}
