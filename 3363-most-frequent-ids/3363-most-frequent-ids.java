class Solution {
    public long[] mostFrequentIDs(int[] nums, int[] freq) {
        
        PriorityQueue<Entry> pq = new PriorityQueue<>();
        HashMap<Integer, Long> map = new HashMap<>();
        long[] ans = new long[nums.length];
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            flag = false;
            map.put(nums[i],map.getOrDefault(nums[i],0l)+freq[i]);
            Entry e = new Entry(nums[i],map.get(nums[i]));
            pq.add(e);
            while(!flag && !pq.isEmpty()){
                Entry ne = pq.peek();
                // System.out.println(pq+"\n"+map);
                if(map.get(ne.num)==ne.freq){
                    ans[i] = ne.freq;
                    flag = true;
                    //System.out.println(i+" "+ans[i]+"  "+nums[i]+"--"+freq[i]);
                }
                else{
                    // System.out.println("Going for polling "+i);
                 pq.poll();

                }
            }
        }
        return ans;
    }
}

class Entry implements Comparable<Entry>{
    Integer num;
    Long freq;

    public Entry(Integer n, Long f){
        this.num = n;
        this.freq = f;
    }

    public int compareTo(Entry e){
        return e.freq.compareTo(this.freq);
    }

    public String toString(){
        return num+">>"+freq;
    }
}