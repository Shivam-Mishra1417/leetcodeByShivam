// class Solution {
//     public boolean find132pattern(int[] nums) {
       
// 		 String [] left = new String[nums.length];
// 		 left[0] = "NA";
// 		 left[nums.length-1]= "NA";
// 		 int min=nums[0];
// 		 for(int i=1;i<nums.length-1;i++) {
// 			 if(nums[i]>min)
// 				 left[i] = ""+min;
// 			 else {
// 				 min=nums[i];
// 				 left[i] = "NA";
// 			 }
// 		 }
		 
// 		 for(int i=1;i<nums.length-1;i++) {
// 			 if(!left[i].equals("NA")) {
// 				 for(int j=i+1;j<nums.length;j++) {
// 					 if(nums[j] < nums[i] && nums[j] > Integer.parseInt(left[i]))
// 						 return true;
// 				 }
// 			 }
// 		 }
		 
//         // System.out.println(Arrays.toString(left));


// 	        return false;

//     }
// }
public class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}