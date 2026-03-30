class Solution {
    public boolean isHappy(int n) {

        int attempts = 0;

        while(n != 1 && attempts < 1000){
            n = helper(n);
            attempts++;
        }

        return n == 1;
    }

    static int helper(int n){
        int sum = 0;

        while(n > 0){
            int d = n % 10;
            sum += d * d;
            n = n / 10;
        }

        return sum;
    }
}
