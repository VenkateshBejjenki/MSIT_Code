package BBST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Node {

	
	int key;
	//String name;
	Node leftChild;
	Node rightChild;
	
	Node(int key) {
		this.key = key;
		//this.name = name;
		this.leftChild=null;
		this.rightChild=null;
	}
	public String toString() {
		return "the key " + key;
	}
}
public class BBST {	//BST

	Node root;	// this is parent member in tree
	int[] array=new int[50];
	static int i=0;
	
	void addNode(int key) {
		Node newNode = new Node(key);
		if(root==null)
			root=newNode;
		else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent=focusNode;
				if(key<focusNode.key){
					focusNode=focusNode.leftChild;
					if(focusNode==null){
						parent.leftChild=newNode;
						return;
					}
				}else{
					focusNode=focusNode.rightChild;
					if(focusNode==null){
						parent.rightChild=newNode;
						return;
					}
				}
			}
		}
	}	
	
	void bbst(){
		inOrder(this.root);
		//System.out.println(array);
		this.root=balenced_search_tree(array,0,array.length-1);
	}
	
	Node balenced_search_tree(int[] a,int start,int end){
		if(start>end)
			return null;
		int m=(start+end)/2;
		Node r=new Node(a[m]);
		r.leftChild=balenced_search_tree(a,start,m-1);
		r.rightChild=balenced_search_tree(a,m+1,end);
		return r;
	}
	boolean remove(int key) {
		Node focusNode = root;
		Node parent = root;
		boolean isItALeftChild = true;	//left or right
		while (focusNode.key != key) {	//Checking Node is found or not
			parent = focusNode;
			if (key < focusNode.key) {
				isItALeftChild = true;
				focusNode = focusNode.leftChild;
			} else {
				isItALeftChild = false;
				focusNode = focusNode.rightChild;
			}
			if (focusNode == null)
				return false;
		}
		if (focusNode.leftChild == null && focusNode.rightChild == null) {
			if (focusNode == root)
				root = null;
			else if (isItALeftChild)
				parent.leftChild = null;
			else
				parent.rightChild = null;
		}
		else if (focusNode.rightChild == null) {
			if (focusNode == root)
				root = focusNode.leftChild;
			else if (isItALeftChild)
				parent.leftChild = focusNode.leftChild;
			else
				parent.rightChild = focusNode.leftChild;
		}
		else if (focusNode.leftChild == null) {
			if (focusNode == root)
				root = focusNode.rightChild;
			else if (isItALeftChild)
				parent.leftChild = focusNode.rightChild;
			else
				parent.rightChild = focusNode.rightChild;
		}
		else {
			Node replacement = getReplacementNode(focusNode);
			if (focusNode == root)
				root = replacement;
			else if (isItALeftChild)
				parent.leftChild = replacement;
			else
				parent.rightChild = replacement;
			replacement.leftChild = focusNode.leftChild;
		}
		return true;
	}

	public Node getReplacementNode(Node replacedNode) {
		Node replacementParent = replacedNode;
		Node replacement = replacedNode;
		Node focusNode = replacedNode.rightChild;
		while (focusNode != null) {
			replacementParent = replacement;
			replacement = focusNode;
			focusNode = focusNode.leftChild;
		}
		if (replacement != replacedNode.rightChild) {

			replacementParent.leftChild = replacement.rightChild;
			replacement.rightChild = replacedNode.rightChild;
		}
		return replacement;
	}
	
	void inOrder(Node focusNode){
		if(focusNode!=null){
			inOrder(focusNode.leftChild);
			array[i++]=focusNode.key;
			inOrder(focusNode.rightChild);
		}
	}
	
	void inOrde(Node focusNode){
		if(focusNode!=null){
			inOrde(focusNode.leftChild);
			System.out.println(focusNode);
			inOrde(focusNode.rightChild);
		}
	}
	void preOrder(Node focusNode){
		if(focusNode!=null){
			System.out.println(focusNode);
			preOrder(focusNode.leftChild);
			preOrder(focusNode.rightChild);
		}
	}
	
	void postOrder(Node focusNode){
		if(focusNode!=null){
			postOrder(focusNode.leftChild);
			postOrder(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}
	void levelorder(Node t){
		Queue<Node> queue=new LinkedList<Node>(); 
		queue.add(t);
		 while(!queue.isEmpty())  
		  {  
		   Node tempNode=queue.poll();  
		   System.out.println(tempNode);  
		   if(tempNode.leftChild!=null)  
		    queue.add(tempNode.leftChild);  
		   if(tempNode.rightChild!=null)  
		    queue.add(tempNode.rightChild);  
		}  
	}
	
	Node findNode(int key){
		Node focusNode =root;
		while(focusNode.key!=key){
			if(key<focusNode.key){
				focusNode=focusNode.leftChild;
			}else{
				focusNode=focusNode.rightChild;
			}
			if(focusNode==null)
				return null;
		}
		return focusNode;
	}
	
	public static void main(String[] argvs){
		BBST b=new BBST();
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		boolean t=true;
		while(t){
			System.out.println("1------Add Node\n2------inOrder\n3------preOrder\n4------postOrder\n5------Search\n6------LevelOrder\n7------Remove\n8------BBST");
			switch (sc.nextInt()) {
			case 1:System.out.println("Enter the key and element");
				b.addNode(sc.nextInt());
				break;
			case 2:b.inOrde(b.root);
				break;
			case 3:b.preOrder(b.root);
				break;
			case 4:b.postOrder(b.root);
				break;
			case 5:System.out.println("Enter key to find");
				System.out.println(b.findNode(sc.nextInt()));
				break;
			case 6:b.levelorder(b.root);break;
			case 7:System.out.println("Enter element to remove");
			 	b.remove(sc.nextInt());
			break;
			case 8:b.bbst();break;
			default:t=false;
				break;
			}
		}
	}
}
