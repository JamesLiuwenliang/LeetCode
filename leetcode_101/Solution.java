/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root,root);
    }

    private boolean isSymmetric(TreeNode t1,TreeNode t2){
        if(t1 == null && t2 == null ){
            return true;
        }

        if((t1== null && t2 != null) || (t1!=null && t2==null)){
            return false;
        }

        if(t1.val == t2.val){
            return isSymmetric(t1.left ,t2.right ) && isSymmetric(t1.right ,t2.left);
        }

        return false;

    }
}