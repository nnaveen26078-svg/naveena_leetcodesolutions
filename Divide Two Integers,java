class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long pDividend = Math.abs((long) dividend);
        long pDivisor = Math.abs((long) divisor);

        long quotient = 0;
        while (pDividend >= pDivisor) {
            long tempDivisor = pDivisor, multiple = 1;
            while (pDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            pDividend -= tempDivisor;
            quotient += multiple;
        }

        return negative ? (int)(-quotient) : (int)(quotient);
    }
}
