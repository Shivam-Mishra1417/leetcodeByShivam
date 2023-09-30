class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res= new int[num_people];
        int j=0,ct=0;
        while(candies>0){
            ct++;
            res[(j++)%num_people] += ct <candies ? ct:candies;
            candies-=ct;
        }
        return res;
    }
}