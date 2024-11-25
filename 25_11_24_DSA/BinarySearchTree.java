package latest;
import java.util.*;


class bst{
	
	node root;
	
	class node{
		int data;
		node left;
		node right;
		node(int d){
			this.data = d;
			this.left = null;
			this.right = null;
		}
	}
	
	bst(int val){
		root = new node(val);
	}
	
	public node insert(node root, int val) {
		
		if(root == null)
			return new node(val);
		
		if(val < root.data)
			root.left = insert(root.left , val);
		if(val > root.data)
			root.right = insert(root.right , val);
		
		return root;
	}
	
	public void display(node root) {
		
		if(root == null) 
			return;
		display(root.left);
		System.out.print(root.data+" ");
		display(root.right);
	}
	
}

class Sample {
    public static void main(String args[]) {
    	System.out.print("works...");
    	bst t = new bst(10);
    	t.insert(t.root, 20);
    	t.insert(t.root, 30);
    	t.insert(t.root, 6);
    	t.insert(t.root, 4);
    	t.insert(t.root, 7);
    	t.insert(t.root, 40);
    	t.display(t.root);
    }
}
