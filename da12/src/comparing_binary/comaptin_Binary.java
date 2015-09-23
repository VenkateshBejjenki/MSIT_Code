package comparing_binary;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.lang.*;


class Node {
	String name;
	Node leftChild;
	Node rightChild;
	Node(String name) {
		this.name = name;
	}
	public String toString() {
		return name ;
	}
}
class BinaryTree {

	Node root;
	
	void addNode(String name,boolean value) {
		Node newNode = new Node(name);
		if(root==null)
			root=newNode;
		else{
			Node focusNode = root;
			Node temp = root;
			Node parent;
			while(true){
				parent=focusNode;
				if(value==true){
					temp=focusNode;
					focusNode=focusNode.leftChild;
						if(focusNode==null){
							parent.leftChild=newNode;
							return;
						}else if(temp.rightChild==null){
							parent.rightChild=newNode;
							return;
						}
				}else if(value==false){
					temp=focusNode;
					focusNode=focusNode.rightChild;
					if(focusNode==null){
						parent.rightChild=newNode;
						return;
					}else if(temp.leftChild==null){
						parent.leftChild=newNode;
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
	
	Stack<Node> levelorder(Node t){
		Stack<Node> q=new Stack<Node>(); 
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(t);
		while(!queue.isEmpty())  
		  {  
		   Node tempNode=queue.poll();  
		   q.add(tempNode);
		   if(tempNode.leftChild!=null)  
		    queue.add(tempNode.leftChild);  
		   if(tempNode.rightChild!=null)  
		    queue.add(tempNode.rightChild);  
		}
		 return q;
	}
	
	void compare(Node d1,Node d2){
		Stack<Node> q1=new Stack<Node>(); 
		Stack<Node> q2=new Stack<Node>();
		q1=levelorder(d1);
		q2=levelorder(d2);
		int f=1;
		while(!q1.isEmpty()){
			if(!(q1.peek().name.equals(q2.peek().name))){
				System.out.println("two binary trees are not equal");
				f=0;
				break;
			}
			q1.pop();
			q2.pop();
		}
		if(f==1)
			System.out.println("Two binary trees are equal");
	}
}
public class comaptin_Binary {

	public static void main(String[] argvs){
		BinaryTree b=new BinaryTree();
		BinaryTree c=new BinaryTree();
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		boolean x = false;boolean t=true;
		int a;
		while(t){
			System.out.println("First node");
			System.out.println("1------Add Node\n2------inOrder");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("1 for left\n2 for right");
				a=sc.nextInt();
				if(a==1)
					x=true;
				else if(a==2)
					x=false;
				System.out.println("Enter the element");
				b.addNode(in.nextLine(),x);
				break;
			case 2:b.inOrder(b.root);break;
			default:t=false;
				break;
			}
		}
		t=true;
		while(t){
			System.out.println("Second Node");
			System.out.println("1------Add Node\n2------compare\n3------inOrder");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("1 for left\n2 for right");
				a=sc.nextInt();
				if(a==1)
					x=true;
				else if(a==2)
					x=false;
				System.out.println("Enter the element");
				c.addNode(in.nextLine(),x);
				break;
			case 2:c.compare(b.root, c.root);
				break;
			case 3:c.inOrder(b.root);break;
			default:t=false;
				break;
			}
		}
	}
	
}
