class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        char[] pt = pattern.toCharArray();
        String[] sp = s.split(" ");

        if(pt.length!=sp.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map1 = new HashMap<>();
        for(int i=0;i<pt.length;i++){
            if(map.containsKey(pt[i])){
                if(!map.get(pt[i]).equals(sp[i]))
                    return false;
            }
            else{
                map.put(pt[i], sp[i]);
            }   
        }

        for(int i=0;i<sp.length;i++){
            if(map1.containsKey(sp[i])){
                if(!map1.get(sp[i]).equals(pt[i]))
                    return false;
            }
            else{
                map1.put(sp[i], pt[i]);
            }

        }
        return true;
    }
}