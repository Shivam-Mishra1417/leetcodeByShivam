class Solution {
    public String largestNumber(int[] nums) {
        
        List<String> res = new ArrayList<String>();
        for(int i=0;i<nums.length;i++){
            String tmp = ""+nums[i];
            res.add(tmp);
        }
        Collections.sort(res, new StringComparator());
        String s="";
         for(int i=0;i<res.size();i++){
              s=res.get(i)+s;
        }
       
       while(s.charAt(0)=='0' && s.length()>1)
       s = s.substring(1);

        return (s.equals(""))?"0":s;
    }
}
public class StringComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2){    
        if(s1.equals(s2)) return 0;    
       
        else  if(Long.parseLong(s1+s2) > Long.parseLong(s2+s1)) return 1;
        else return -1;
    }
}