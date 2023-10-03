// class Solution {
//     public int singleNumber(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int x:nums){
//             if(set.contains(x))
//             set.remove(x);
//             else
//             set.add(x);
//         }
//         for(int x:set)
//         return x;

//         return 0;
//     }
// }

class Solution {
    public int singleNumber(int[] nums) {
        int ans=0; //since XOR with 0 returns same number 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i) 
        }
        return ans;    
    }
}