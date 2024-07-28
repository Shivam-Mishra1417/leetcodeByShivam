class Solution {
    public int nonSpecialCount(int l, int r) {
        int ct = 0;
        for (int i = (int) Math.ceil(Math.sqrt(l)); i <= (int) Math.sqrt(r); i++) {
            if (isPrime(i))
                ct++;
        }

        return r - l + 1 - ct;
    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }

}