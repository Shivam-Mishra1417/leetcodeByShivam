class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        int ans=Integer.MAX_VALUE;
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++){
            for(int j=i+1;j<nums1.length;j++){

              int[] nums11 = new int[nums1.length-2];
              int index=0;
              for(int k=0;k<nums1.length;k++){
                if(k!=i && k!=j){
                    nums11[index] = nums1[k];
                    index++;
                }
              }  

              Arrays.sort(nums11);
              int diff = nums2[0] - nums11[0];
              boolean flag = true;
              for(int x=1;x<nums11.length;x++){
                if(nums2[x]-nums11[x]!=diff){
                    flag = false;
                    break;
                }
              }

              if(flag && ans>diff)
                ans = diff;
                    
            }
        }
        return ans;
    }
}

/**
int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE,max1=0,max2=0;
                
                for(int k=0;k<nums1.length;k++){
                    if(k!=i && k!=j){
                    if(min1>nums1[k])
                        min1=nums1[k];
                    if(max1<nums1[k])
                        max1 = nums1[k];
                    }
                } 

                for(int k=0;k<nums2.length ;k++){
                    if(min2>nums2[k])
                        min2=nums2[k];
                    if(max2<nums2[k])
                        max2 = nums2[k];
                }
                System.out.println(min1+" "+max1+"   ==  "+min2+" "+max2);
                if((min2-min1 == max2-max1) && ans > (max2-max1))
                    ans = max2-max1; */