class Solution {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        for(int i=(int)Math.sqrt(area);i>=1;i--){
            if(area%i==0){
                if(i>area/i){
                    ans[0] = i;
                    ans[1] = area/i;
                }
                else{
                    ans[0] = area/i;
                    ans[1] = i;
                }
                break;
            }
        }
        return ans;
    }
}