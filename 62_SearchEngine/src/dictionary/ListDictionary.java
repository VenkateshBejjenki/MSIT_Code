package dictionary;

class ListNode<K extends Comparable<K>, V>{
	K key;
	V value;
	ListNode<K, V> next;
	ListNode(K key,V value){
		this.key=key;
		this.value=value;
		this.next=null;
	}
}
public class ListDictionary <K extends Comparable<K>, V> implements DictionaryInterface <K,V>{

	ListNode<K,V> root;
	ListNode<K,V> start=root;
	
	public K[] getKeys() {
		ListNode<K,V> t=start;
		int size=0;
		while(t!=null){
			size++;
			t=t.next;
		}
		//System.out.println("Size is "+size);
		ListNode<K,V> temp=start;
		String[] array=new String[size];
		int x=0;
		while(temp!=null){
			array[x++]=(String) temp.key;
			temp=temp.next;
		}
		return (K[]) array;
	}

	
	public V getValue(K str) {
		ListNode<K,V> t=start;
		while(t!=null){
			if(t.key.equals(str))
				return t.value;
			t=t.next;
		}
		return null;
	}

	
	public void insert(K key, V value) {
		ListNode<K,V> newNode=new ListNode<K,V>(key,value);
		if(root==null){
			root=newNode;
			start=root;
		}else{
			ListNode<K,V> s=start;
			newNode.next=s;
			start=newNode;
		}
		
	}

	public void remove(K key) {
		ListNode<K,V> t=start;
		ListNode<K,V> temp=start;
		while(!t.key.equals(key)){
			if(t.next==null){
				System.out.println("Element not found");
				break;
			}
			else{
				temp=t;
				t=t.next;
			}
		}
		if(t==root){
			root=root.next;
		}else{
			temp.next=t.next;
		}
	}

}
