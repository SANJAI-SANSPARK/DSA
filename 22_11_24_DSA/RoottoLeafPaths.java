import java.util.*;
class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root == null)
           return res;
           
        ArrayList<Integer> tem = new ArrayList<>();
        rec(root , tem , res);
        return res;
    }
    
    public static void rec(Node root ,ArrayList<Integer> tem,ArrayList<ArrayList<Integer>> res){
        
        tem.add(root.data);
        if(root.left == null && root.right == null){
            res.add(new ArrayList<>(tem));
            return;
        }
        
        if(root.left != null){
            rec(root.left , tem , res);
            tem.remove(tem.size()-1);
        }
        
        if(root.right != null){
            rec(root.right , tem , res);
            tem.remove(tem.size()-1);
        }
        
    }
}

