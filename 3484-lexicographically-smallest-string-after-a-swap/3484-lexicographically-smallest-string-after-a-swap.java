class Solution {
    public String getSmallestString(String s) {
        
        for(int i=0;i<s.length()-1;i++){
            int curr = Character.getNumericValue(s.charAt(i));
            int next = Character.getNumericValue(s.charAt(i+1));

            System.out.println(curr+"  "+next);
            if((curr%2==0 && next%2==0)&&(next<curr)){
                if(i!=s.length()-2)
                return (s.substring(0,i)+next+""+curr+s.substring(i+2));
                else
                return (s.substring(0,i)+next+""+curr);
            }

            if((curr%2!=0 && next%2!=0)&&(next<curr)){
               if(i!=s.length()-2)
                return (s.substring(0,i)+next+""+curr+s.substring(i+2));
                else
                return (s.substring(0,i)+next+""+curr);
            }
        }

        return s;
    }
}