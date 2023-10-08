class Solution {
    public int diagonalPrime(int[][] nums) {
        int max=0, c= nums[0].length-1;
        for(int i=0;i<nums.length;i++){

            if(checkPrime(nums[i][i]) && nums[i][i]>max)
            max= nums[i][i];

            if(checkPrime(nums[i][c-i]) && nums[i][c-i]>max)
            max= nums[i][c-i];
        }
        return max;
    }

    public boolean checkPrime(int n){

        if(n<2) return false;
        if(n==2 || n==5) return true;
        int lastDigit = n%10;
        if(lastDigit==1 || lastDigit==3 || lastDigit==7 || lastDigit==9){
            for(int i=2;i*i<=n;i++){
                if(n%i==0)
                return false;
            }
        }
        else return false;
        return true;
    }
}