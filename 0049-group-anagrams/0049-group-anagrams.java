class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){

            char[] tmp = strs[i].toCharArray();
            Arrays.sort(tmp);
            String k = String.valueOf(tmp);
            if(map.containsKey(k)){
                List<String> lt = map.get(k);
                lt.add(strs[i]);
                map.put(k,lt);
            }
            else{
                List<String> lt = new ArrayList<>();
                lt.add(strs[i]);
                map.put(k,lt);
            }

        }
        
        for(String k:map.keySet()){
            res.add(map.get(k));
        }

    return res;
    }
}