class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int max= 0, maxIndex=-1;
        int[] cm = new int[skills.length];

        for(int i=0;i<skills.length;i++){
            if(skills[i]>max){
                max = skills[i];
                maxIndex = i;
            }
            cm[i] = max;
        }
        if(k>=skills.length-1) return maxIndex;
        int ct=0,tmp=cm[0],un=0;
       // System.out.println(Arrays.toString(cm));
        for(int i=1;i<cm.length;i++){
            if(cm[i]==tmp)
                ct++;
            else{
                tmp=cm[i];
                ct=1;
                un=i;
            }

            if(ct==k)
                return un;
          
        }

        return maxIndex;

    }
}