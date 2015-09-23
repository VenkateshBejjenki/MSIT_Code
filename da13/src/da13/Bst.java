package da13;

import java.util.LinkedList;
import java.util.Queue;
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
public class Bst {	//BST

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
	
	void remove(int key){
			Node focusNode = root;
			Node parent;
			if(root.key==key){
				root.key=root.rightChild.key;
				root.rightChild=root.rightChild.rightChild;
				root.rightChild.rightChild=null;
			}else{
				while(true){
					parent=focusNode;
					if(key<focusNode.key){
						focusNode=focusNode.leftChild;
						if(focusNode.key==key&&focusNode.leftChild!=null&&focusNode.rightChild!=null){
							if(focusNode.rightChild!=null&&focusNode.rightChild.leftChild!=null){
								System.out.println("left side in deep "+focusNode.key);
								parent.leftChild=focusNode.rightChild.leftChild;
								focusNode.key=focusNode.rightChild.leftChild.key;
								focusNode.rightChild.leftChild=null;
								return;
							}else{
								System.out.println("left side "+focusNode.key);
								parent.leftChild=focusNode.rightChild;
								focusNode.key=focusNode.rightChild.key;
								focusNode.rightChild.leftChild=focusNode.leftChild;
								focusNode.rightChild.rightChild=null;
								return;
							}
						}else if(focusNode.key==key&&focusNode.leftChild==null&&focusNode.rightChild!=null){      
							//leftchild==null
							System.out.println("left side and left null "+focusNode.key);
							parent.leftChild=focusNode.rightChild;
							focusNode.rightChild=null;
							return;
						}else if(focusNode.key==key&&focusNode.leftChild!=null&&focusNode.rightChild==null){
							//rightchild==null
							System.out.println("left side and right null "+focusNode.key);
							parent.rightChild=focusNode.leftChild;
							focusNode.leftChild=null;
							return;
						}else if(focusNode.key==key&&focusNode.leftChild==null&&focusNode.rightChild==null){
							//null
							parent.leftChild=null;
							System.out.println("Left null");
							return;
						}
					}else{
						focusNode=focusNode.rightChild;
						if(focusNode.key==key&&focusNode.leftChild!=null&&focusNode.rightChild!=null){
							if(focusNode.rightChild!=null&&focusNode.leftChild.rightChild!=null){
								System.out.println("left side in deep "+focusNode.key);
								parent.rightChild=focusNode.leftChild.rightChild;
								focusNode.key=focusNode.leftChild.rightChild.key;
								focusNode.leftChild.rightChild=null;
								return;
							}else{
								System.out.println("Right side "+focusNode.key);
								parent.rightChild=focusNode.leftChild;
								focusNode.key=focusNode.rightChild.key;
								focusNode.leftChild.rightChild=focusNode.rightChild;
								focusNode.leftChild.leftChild=null;
								return;
							}
						}
						else if(focusNode.key==key&&focusNode.leftChild==null&&focusNode.rightChild!=null){      
							//leftchild==null
							System.out.println("right side and left null "+focusNode.key);
							parent.rightChild=focusNode.leftChild;
							focusNode.leftChild=null;
							return;
						}else if(focusNode.key==key&&focusNode.leftChild!=null&&focusNode.rightChild==null){
							//rightchild==null
							System.out.println("right side and right null "+focusNode.key);
							parent.leftChild=focusNode.rightChild;
							focusNode.rightChild=null;
							return;
						}else if(focusNode.key==key&&focusNode.leftChild==null&&focusNode.rightChild==null){
							//null
							System.out.println("Right null");
							parent.rightChild=null;
							return;
						}
					}
				}
			}
		}
	
	/*boolean remove(int key) {
		Node focusNode = root;
		Node parent = root;

		boolean isItALeftChild = true;	//left or right

		while (focusNode.key != key) {	//Checking Node is found or not

			parent = focusNode;

			// If we should search to the left

			if (key < focusNode.key) {

				isItALeftChild = true;

				// Shift the focus Node to the left child

				focusNode = focusNode.leftChild;

			} else {

				// Greater than focus node so go to the right

				isItALeftChild = false;

				// Shift the focus Node to the right child

				focusNode = focusNode.rightChild;

			}

			// The node wasn't found

			if (focusNode == null)
				return false;

		}

		// If Node doesn't have children delete it

		if (focusNode.leftChild == null && focusNode.rightChild == null) {

			// If root delete it

			if (focusNode == root)
				root = null;

			// If it was marked as a left child
			// of the parent delete it in its parent

			else if (isItALeftChild)
				parent.leftChild = null;

			// Vice versa for the right child

			else
				parent.rightChild = null;

		}

		// If no right child

		else if (focusNode.rightChild == null) {

			if (focusNode == root)
				root = focusNode.leftChild;

			// If focus Node was on the left of parent
			// move the focus Nodes left child up to the
			// parent node

			else if (isItALeftChild)
				parent.leftChild = focusNode.leftChild;

			// Vice versa for the right child

			else
				parent.rightChild = focusNode.leftChild;

		}

		// If no left child

		else if (focusNode.leftChild == null) {

			if (focusNode == root)
				root = focusNode.rightChild;

			// If focus Node was on the left of parent
			// move the focus Nodes right child up to the
			// parent node

			else if (isItALeftChild)
				parent.leftChild = focusNode.rightChild;

			// Vice versa for the left child

			else
				parent.rightChild = focusNode.rightChild;

		}

		// Two children so I need to find the deleted nodes
		// replacement

		else {

			Node replacement = getReplacementNode(focusNode);

			// If the focusNode is root replace root
			// with the replacement

			if (focusNode == root)
				root = replacement;

			// If the deleted node was a left child
			// make the replacement the left child

			else if (isItALeftChild)
				parent.leftChild = replacement;

			// Vice versa if it was a right child

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

		// While there are no more left children

		while (focusNode != null) {

			replacementParent = replacement;

			replacement = focusNode;

			focusNode = focusNode.leftChild;

		}

		// If the replacement isn't the right child
		// move the replacement into the parents
		// leftChild slot and move the replaced nodes
		// right child into the replacements rightChild

		if (replacement != replacedNode.rightChild) {

			replacementParent.leftChild = replacement.rightChild;
			replacement.rightChild = replacedNode.rightChild;

		}

		return replacement;

	}
*/	
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
		Bst b=new Bst();
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		boolean t=true;
		while(t){
			System.out.println("1------Add Node\n2------inOrder\n3------preOrder\n4------postOrder\n5------Search\n6------LevelOrder\n7------Remove");
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
			case 6:b.levelorder(b.root);break;
			case 7:System.out.println("Enter element to remove");
			 	b.remove(sc.nextInt());
			break;
			default:t=false;
				break;
			}
		}
	}
}
