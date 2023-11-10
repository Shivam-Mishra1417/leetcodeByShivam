class Solution {
    public int compareVersion(String version1, String version2) {
         System.out.println(version1+"  <==>  "+version1);
        String[] v1 = version1.split("[^0-9]");
        String[] v2 = version2.split("[^0-9]");
        //System.out.println(Arrays.toString(v1));
       // System.out.println(Arrays.toString(v2));
        int vl1=v1.length, vl2 = v2.length;
        int l = (vl1 > vl2)?vl1:vl2;
        int index=0,ans;
        //System.out.println(vl1+" -- "+vl2+"  "+l);
        while(index<l){
            int a = (index<vl1)?(Integer.parseInt(v1[index])):0;
            int b = (index<vl2)?(Integer.parseInt(v2[index])):0;
            ans = Integer.compare(a,b);
            //System.out.println(a+"  "+b+"  =>"+ans);
            if(ans!=0) return ans;
            index++;
        }
        return 0;
    }
}