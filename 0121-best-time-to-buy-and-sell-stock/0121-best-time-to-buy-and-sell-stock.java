class Solution {
    public int maxProfit(int[] prices) {
        
        int[] left = new int[prices.length];
        left[0] = prices[0];

        for(int i=1;i<left.length;i++){
            if(prices[i]<left[i-1])
            left[i] = prices[i];
            else
            left[i] = prices[i-1];
        }
       // System.out.println(Arrays.toString(left));
        int max=prices[prices.length-1], diff=Integer.MIN_VALUE;

        for(int i=left.length-1;i>=0;i--){
            if(prices[i]>max)
            max = prices[i];
            if(Math.abs(left[i]-max) > diff)
            diff=  Math.abs(left[i]-max);

        }
        return diff;
    }
}