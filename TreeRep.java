package PacJava;

public class TreeRep {
 Node root;
 
 class Node{
	 int data;
	 Node left;
	 Node right;
	 
	 Node(int d){
		 this.data=d;
		 this.left=null;
		 this.right=null;
	 }
 }
 
 TreeRep(){
	 this.root=null;
 }
 
 Node insert(Node root,int val) {
	 Node newNode = new Node(val);
	 if(root==null) {
		 root=newNode;
	 }else if(val<root.data) {
		 root.left=insert(root.left,val);
	 }else {
		 root.right=insert(root.right,val);
	 }
	 return root;
 }
 
 void inorder(Node root) {
	 if(root!=null) {
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	 }
 }
 
 void preorder(Node root) {
	 if(root!=null) {
		 System.out.print(root.data+" ");
		 preorder(root.left);
		 preorder(root.right);
	 }
 }
 
 void postorder(Node root) {
	 if(root!=null) {
		 postorder(root.left);
		 postorder(root.right);
		 System.out.print(root.data+" ");
	 }
 }
 
 public static void main(String args[]) {
	 TreeRep m = new  TreeRep();
	 
	 m.root=m.insert(m.root, 50);
	 m.root=m.insert(m.root, 70);
	 m.root=m.insert(m.root, 40);
	 m.root=m.insert(m.root, 76);
	 
	 System.out.println("Inorder:");
	 m.inorder(m.root);
	 System.out.println();
	 System.out.println("Preorder:");
	 m.preorder(m.root);
	 System.out.println();
	 System.out.println("Postorder:");
	 m.postorder(m.root);
 }
}
