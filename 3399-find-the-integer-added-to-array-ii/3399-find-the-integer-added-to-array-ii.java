class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                boolean flag = false, flag2 = true;
                int index2 = 0, tmpDiff = 0;
                for (int x = 0; x < nums1.length; x++) {
                    
                    if (x != i && x != j) {
                        if (!flag) {
                            tmpDiff = nums2[index2] - nums1[x];
                            flag = true;
                        } else if (nums2[index2] - nums1[x] != tmpDiff) {
                            flag = false;
                            flag2 = false;
                            break;
                        }
                        index2++;
                    }
                }

                if (flag2 && ans > tmpDiff)
                    ans = tmpDiff;

            }
        }
        return ans;
    }
}

/**
 * int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE,max1=0,max2=0;
 * 
 * for(int k=0;k<nums1.length;k++){
 * if(k!=i && k!=j){
 * if(min1>nums1[k])
 * min1=nums1[k];
 * if(max1<nums1[k])
 * max1 = nums1[k];
 * }
 * }
 * 
 * for(int k=0;k<nums2.length ;k++){
 * if(min2>nums2[k])
 * min2=nums2[k];
 * if(max2<nums2[k])
 * max2 = nums2[k];
 * }
 * System.out.println(min1+" "+max1+" == "+min2+" "+max2);
 * if((min2-min1 == max2-max1) && ans > (max2-max1))
 * ans = max2-max1;
 */