package da11;

import java.util.Scanner;

class Node {

	int key;
	String name;
	Node leftChild;
	Node rightChild;
	Node(int key, String name) {
		this.key = key;
		this.name = name;
	}
	public String toString() {
		return name + " has the key " + key;
	}
}
public class BinaryTree {	//BST

	Node root;	// this is parent member in tree
	
	void addNode(int key, String name) {
		Node newNode = new Node(key, name);
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
	
	void inOrder(Node focusNode){
		if(focusNode!=null){
			inOrder(focusNode.leftChild);
			System.out.println(focusNode);
			inOrder(focusNode.rightChild);
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
		BinaryTree b=new BinaryTree();
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		boolean t=true;
		while(t){
			System.out.println("1------Add Node\n2------inOrder\n3------preOrder\n4------postOrder\n5------Find");
			switch (sc.nextInt()) {
			case 1:System.out.println("Enter the key and element");
				b.addNode(sc.nextInt(), in.nextLine());
				break;
			case 2:b.inOrder(b.root);
				break;
			case 3:b.preOrder(b.root);
				break;
			case 4:b.postOrder(b.root);
				break;
			case 5:System.out.println("Enter key to find");
				System.out.println(b.findNode(sc.nextInt()));
				break;
			default:t=false;
				break;
			}
		}
	}
}
