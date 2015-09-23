package height;
import java.util.Scanner;
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
	
	int Height(Node node){
		 if (node == null)
		        return -1;
		    else
		        return (1+Math.max(Height(node.leftChild),Height(node.rightChild)));
	}
}

public class height {

	public static void main(String[] argvs){
		BinaryTree b=new BinaryTree();
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		boolean x = false;boolean t=true;
		int a;
		while(t){
			System.out.println("1------Add Node\n2------Height\n3------inOrder");
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
			case 2:System.out.println("Max height is "+b.Height(b.root));
				break;
			case 3:b.inOrder(b.root);break;
			default:t=false;
				break;
			}
		}
	}
}
