class Solution {
    public int integerBreak(int n) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(9);
        if(n<7) return list.get(n);
       
        
        
     return Math.max(2*integerBreak(n-2), 3*integerBreak(n-3));
    }
}