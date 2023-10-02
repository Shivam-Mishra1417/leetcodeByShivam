/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     static int sum=0;
    public static  int sumOfLeftLeaves(TreeNode root) {
        sum=0;
       loop(root,false);
        
         return sum;
    }

    public static void loop(TreeNode root, boolean ct){
         
        if(root!=null){
        if(root.left==null && root.right==null && ct)  
        sum+=root.val;  
        if(root.left!=null){
        
        loop(root.left, true);
        }
        if(root.right!=null){
         loop(root.right, false);
        }
        }
    }
}