package dictionary;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

class NameComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		return ((String) o1).compareTo((String) o2);
	}
}

class Node<K extends Comparable<K>, V> {

	K key;
	V name;
	Node<K,V> leftChild;
	Node<K,V> rightChild;
	Node(K key, V name) {
		this.key = key;
		this.name = name;
		this.leftChild=null;
		this.rightChild=null;
	}

}
public class BSTDictionary <K extends Comparable<K>, V> implements DictionaryInterface <K,V>{

	static int size=0;
	Node<K,V> root;
	
	public K[] getKeys() {
		int i=0;
		String[] ks=new String[size];
		System.out.println("Size "+size);
		Node<K,V> t=root;
		Queue<Node<K,V>> queue=new LinkedList<Node<K,V>>(); 
		queue.add(t);
		 while(!queue.isEmpty())  
		  {  
		   Node<K,V> tempNode=queue.poll();  
		   		 ks[i++]=(String) tempNode.key;
		   if(tempNode.leftChild!=null)  
		    queue.add(tempNode.leftChild);  
		   if(tempNode.rightChild!=null)  
		    queue.add(tempNode.rightChild);  
		}  
		return (K[]) ks;
	}
	
	public V getValue(K str) {
		Node<K,V> focusNode =root;
		NameComparator v=new NameComparator();
		int x;
		while(focusNode!=null){
			x=v.compare(str, focusNode.key);
			if(x==0){
				return (V) focusNode.name;
			}
			else if(x<0){
				focusNode=focusNode.leftChild;
			}else if(x>0){
				focusNode=focusNode.rightChild;
			}
		}
		return (V) focusNode.name;
	}

	public void insert(K key, V value) {
		Node<K,V> newNode = new Node<K,V>(key, value);
		if(root==null){
			root=newNode;
			size++;
		}
		else{
			Node<K,V> focusNode = root;
			Node<K,V> parent;
			while(true){
				parent=focusNode;
				NameComparator v=new NameComparator();
				int x=v.compare(key, focusNode.key);
				if(x<=0){
					focusNode=focusNode.leftChild;
					if(focusNode==null){
						parent.leftChild=newNode;
						size++;
						return;
					}
				}else if(x>0){
					focusNode=focusNode.rightChild;
					if(focusNode==null){
						parent.rightChild=newNode;
						size++;
						return;
					}
				}
			}
		}
		
	}

	public void remove(K key) {
		Node<K,V> focusNode = root;
		Node<K,V> parent = root;
		boolean isItALeftChild = true;	//left or right
		NameComparator v=new NameComparator();
		int x;
		while (focusNode!=null) {	//Checking Node is found or not
			parent = focusNode;
			x=v.compare(key, focusNode.key);
			if(x==0){
				size--;
				break;
			}
			else if(x<=0) {
				isItALeftChild = true;
				focusNode = focusNode.leftChild;
			} else {
				isItALeftChild = false;
				focusNode = focusNode.rightChild;
			}
			
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
			Node<K,V> replacement = getReplacementNode(focusNode);
			if (focusNode == root)
				root = replacement;
			else if (isItALeftChild)
				parent.leftChild = replacement;
			else
				parent.rightChild = replacement;
			replacement.leftChild = focusNode.leftChild;
		}
	
	}
	public Node<K,V> getReplacementNode(Node<K,V> replacedNode) {
		Node<K,V> replacementParent = replacedNode;
		Node<K,V> replacement = replacedNode;
		Node<K,V> focusNode = replacedNode.rightChild;
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
}
