class Solution {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
         int vc = 1, hc = 1;
         long ans = 0;

        PriorityQueue<Entry> pq = new PriorityQueue<>();

        for (int i = 0; i < horizontalCut.length; i++)
            pq.add(new Entry(horizontalCut[i], i, 'H'));

        for (int i = 0; i < verticalCut.length; i++)
            pq.add(new Entry(verticalCut[i], i, 'V'));

        //System.out.println(pq);

        while (!pq.isEmpty()) {
            Entry e = pq.poll();
            if (e.cut == 'H') {
                hc++;
                ans += e.v * vc;

            } else {
                vc++;
                ans += e.v * hc;
            }
        }
        return ans;
    }
}

class Entry implements Comparable<Entry> {

    Integer v;
    int i;
    char cut;

    public Entry(int v, int i, char c) {
        this.v = v;
        this.i = i;
        this.cut = c;
    }

    public int compareTo(Entry e) {
        return e.v.compareTo(this.v);
    }

    public String toString() {
        return v + " " + i + "  " + cut;
    }
}