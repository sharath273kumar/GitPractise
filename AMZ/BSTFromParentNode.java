package AMZ;


public class BSTFromParentNode {
	
	class Node{
		int data;
		Node left,right;
		
		Node(int d){
			this.data = d;
			this.left = this.right = null;
		}
	}
	
	static Node root = null;
	
	public static void main(String args[]) {
		int P[]=new int[]{-1, 0, 0, 1, 1, 3, 5};
		int N=P.length;
		Node A[]=new Node[N+1];
		for(int i=0;i<N;i++)
			A[i] = null;
		for(int i=0;i<N;i++)
			createTree(P, A, i);
		
		printTree(root);
	}
	
	public static void createTree(int P[], Node A[], int i) {
		
		if(A[i] != null) return;
		
		BSTFromParentNode x =new BSTFromParentNode();
		A[i] = x.new Node(i);
		
		if(P[i] == -1) {
			root = A[i];
			return;
		}
		
		if(A[P[i]] == null)
			createTree(P, A , P[i]);
		
		if(A[P[i]].left == null)
			A[P[i]].left = A[i];
		else
			A[P[i]].right = A[i];
	}
	
	public static void printTree(Node root) {
		if(root != null) {
			printTree(root.left);
			System.out.print(root.data+" ");
			printTree(root.right);
		}
	}

}
