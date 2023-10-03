/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return bs(1,n);
    }

    public int bs(int l, int r){
        if(l>r) return 1;
        if(l==r) return l;
        int m = l +(r-l)/2;

        boolean bool = isBadVersion(m);

        if(bool) return bs(l, m);
        else return bs(m+1,r);
    }
}