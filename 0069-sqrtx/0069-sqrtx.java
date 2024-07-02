class Solution {
    public int mySqrt(int x) {
        int t = x, l = 0, r =46340,ct=0,mid=0;
        while (true) {
            mid = l + (r - l) / 2;
            
            if (((mid * mid <= x) && ((mid + 1) * (mid + 1) > x)))
                return mid;
            else if ((mid * mid) > x)
                r = mid - 1;
            else
                l = mid + 1;
            ct++;
            if(ct>32) break;
            //System.out.println(l+" ==  "+r+"  --> "+mid);
        }

        return (mid>46340)?46340:mid;
    }
}