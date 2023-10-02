/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       int l = n; 
       if(guess(n)==0) return n;
       while(guess(l)!=1){
           l=l/2;
       }
      
       //System.out.println(l+" "+r);
       return bs(l,n);
    }

    public int bs(int l, int r){

        int m = l+(r-l)/2;
        int x= guess(m);

        if(x==0) return m;

        if(x==-1) return bs(l, m-1);
        else return bs(m+1,r);

    }
}