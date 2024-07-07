class Solution {
    public List<String> validStrings(int n) {
        
        List<String> lt = new ArrayList<>();

        for(int i=0;i<(int)(Math.pow(2,n));i++){
            String s = Integer.toBinaryString(i);
            s = String.format("%1$" + n + "s", s).replace(' ', '0');
            //System.out.println(s);
             if(!s.contains("00"))
            lt.add(s);
        }

        return lt;
    }
}