import java.util.*;

class pair{
    Node n;
    int c;
    pair(Node n , int c){
        this.n = n;
        this.c = c;
    }
}

class Solution {

    static ArrayList<Integer> topView(Node root) {
         ArrayList<Integer> res = new  ArrayList<Integer>();
         Queue<pair> q = new LinkedList<>();
         Map<Integer , Integer> l = new TreeMap<>();
         
         if(root == null)
            return res;
        
         q.add(new pair(root , 0));
         
         while(!q.isEmpty()){
             pair pt = q.poll();
             Node cn = pt.n;
             int cc = pt.c;
             
             if(!l.containsKey(cc)){
                 l.put(cc , cn.data);
             }
             
             if(cn.left!=null)
                q.add(new pair(cn.left , cc-1));
             if(cn.right!=null)
                q.add(new pair(cn.right , cc+1));
         }
         
        for(int i:l.values()){
            res.add(i);
        }
        
        return res;
            
    }
}
