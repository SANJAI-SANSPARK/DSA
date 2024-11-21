class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
           return true;

        return rec(root.left , root.right);
    }

    public boolean rec(TreeNode l , TreeNode r){
        if(l==null || r==null)
           return (l==r);

        if(l.val != r.val)
           return false;
        
        return rec(l.left , r.right) && rec(r.left , l.right);
    }
}