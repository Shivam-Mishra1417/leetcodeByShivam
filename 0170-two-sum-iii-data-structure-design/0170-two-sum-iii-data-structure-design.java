class TwoSum {
    HashMap<Integer,Integer> map;
    List<Integer> res;
    public TwoSum() {
        map = new HashMap<Integer,Integer>();
        res = new ArrayList<Integer>();
    }
    
    public void add(int number) {
        res.add(number);
        map.put(number, map.getOrDefault(number,0)+1);
    }
    
    public boolean find(int value) {
        for(int i=0;i<res.size();i++){
            if(value - res.get(i) == res.get(i) && map.get(res.get(i))>1)
            return true;

            if(map.containsKey(value - res.get(i)) && value - res.get(i) != res.get(i))
            return true;
            
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */