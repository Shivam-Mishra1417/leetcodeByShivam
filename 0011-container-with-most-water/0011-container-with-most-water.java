class Solution {
    public int maxArea(int[] height) {
        int max=0;
       /* for(int i=0;i<height.length;i++){

            for(int j=i+1;j<height.length;j++){
                int tmp = Math.min(height[i],height[j]) * (j-i);
                if(tmp>max)
                max = tmp;

            }

        }*/

        int l=0, r=height.length-1;
        while(l<r){

            int tmp = Math.min(height[l],height[r]) * (r-l);
            if(tmp>max)
            max = tmp;

            if(height[l] < height[r])
            l++;
            else
            r--;

        }

        return max;
   
   
   
   
   
   
       
   }
}