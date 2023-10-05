class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        if(digits[l-1] == 9)
        {
            digits[l-1] =0;
            int extra = 1,index = l-2;
            while(extra!=0){
                if(index<0){
                    int[] res = new int[l+1];
                    res[0] = 1;
                    for(int i=0;i<l;i++)
                    res[i+1] = digits[i];
                    return res;
                }
                if(digits[index]==9){
                    digits[index]=0;
                    index--;
                }
                else{
                    digits[index]+=1;
                    extra=0;
                }
            }


            return digits;
        }
        else{
            digits[digits.length-1] +=1;
            return digits;
        }



    }
}