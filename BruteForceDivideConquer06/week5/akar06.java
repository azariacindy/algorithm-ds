package week5;

public class akar06 {
    public double akarBruteForce(int n) {
        for (int i = 0; i <= n; i++) {
            if (i * i == n) {
                return i;
            }
        }
        return Math.floor(Math.sqrt(n)); // Bulatkan ke bawah jika bukan kuadrat sempurna
    }

    public double akarDivideConquer(int n) {
        return akarDC(n, 0, n);
    }

    private double akarDC(int n, double start, double end) {
        if (start <= end) {
            double mid = (start + end) / 2;
            double midSqr = mid * mid;
            if (midSqr == n) {
                return mid;
            } else if (midSqr < n) {
                return akarDC(n, mid + 1, end);
            } else {
                return akarDC(n, start, mid - 1);
            }
        }
        return Math.floor(end); // Bulatkan ke bawah jika bukan kuadrat sempurna
    }
}
