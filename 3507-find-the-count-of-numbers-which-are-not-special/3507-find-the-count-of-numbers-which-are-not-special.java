class Solution {
    public int nonSpecialCount(int l, int r) {
        int ct=0;
        for(int i=(int)Math.ceil(Math.sqrt(l));i<=(int)Math.sqrt(r);i++){
            if(isPrime(i))
                ct++;
        }

        return r-l+1-ct;
    }
    private static boolean isPrime(int n){
         if (n <= 1) return false; // 0 and 1 are not prime numbers
        if (n <= 3) return true; // 2 and 3 are prime numbers

        // Check for even numbers and multiples of 3
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Check for primes using 6k +/- 1 rule
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }

        return true;
    }


}