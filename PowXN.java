class PowXN {
    public double myPow(double x, int n) {
        double result = 1.0;
        if (n == 0) {
            return 1.00;
        }
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        while (N > 0) {
            if ((N & 1) == 1) {
                result *= x;
            }
            x *= x;
            N >>= 1;
        }
        return result;
    }
}
