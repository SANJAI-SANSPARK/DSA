import java.util.*;
class pair{
    int c;
    Node n;
    pair(int c , Node n){
        this.c = c;
        this.n = n;
    }
}
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList <Integer> res = new ArrayList<>();
        if(root == null)
           return res;
        
        Queue<pair> q = new LinkedList<>();
        Map<Integer , Integer> l = new TreeMap<>();
        q.add(new pair(0 , root));
        
        while(!q.isEmpty()){
            pair tp = q.poll();
            Node cn = tp.n;
            int cc = tp.c;
            
            l.put(cc , cn.data);
            
            if(cn.left != null)
               q.add(new pair(cc-1 , cn.left));
            if(cn.right != null)
               q.add(new pair(cc+1 , cn.right));
        }
        
        for(int i:l.values()){
            res.add(i);
        }
        
        return res;
        
    }
}