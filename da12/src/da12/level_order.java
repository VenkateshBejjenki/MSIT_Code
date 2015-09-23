package da12;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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
	
	void levelorder(Node t){
		Queue<Node> queue=new LinkedList<Node>(); 
		queue.add(t);
		 while(!queue.isEmpty())  
		  {  
		   Node tempNode=queue.poll();  
		   System.out.println(tempNode.name);  
		   if(tempNode.leftChild!=null)  
		    queue.add(tempNode.leftChild);  
		   if(tempNode.rightChild!=null)  
		    queue.add(tempNode.rightChild);  
		}  
	}
}

public class level_order {

	public static void main(String[] argvs){
		BinaryTree b=new BinaryTree();
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		boolean x = false;boolean t=true;
		int a;
		while(t){
			System.out.println("1------Add Node\n2------Level_Order\n3------inOrder");
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
			case 2:b.levelorder(b.root);
				break;
			case 3:b.inOrder(b.root);break;
			default:t=false;
				break;
			}
		}
	}
}
