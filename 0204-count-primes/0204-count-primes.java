class Solution {
    public int countPrimes(int n) {

        if(n<2) return 0;
        boolean [] arr = new boolean[n+1];
       
       for(int i=2;i*i<=n;i++){

           if(!arr[i]){

               for(int j=i*i;j<=n;j+=i){
                   arr[j]=true;
               }
           }
       }

        int res=0;
       for(int i=2;i<n;i++)
        if(!arr[i]) res++;
        //System.out.println(Arrays.toString(arr));
        return res;
    }
}