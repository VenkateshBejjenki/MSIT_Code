package dictionary;


class MainNode<K extends Comparable<K>,V>{
	K key;
	V value;
	MainNode<K,V> next;
	MainNode(K key,V h){
		this.value=h;
		this.key=key;
		this.next=null;
	}
}

public class MyHashDictionary <K extends Comparable<K>, V> implements DictionaryInterface <K,V>{

	MainNode<K,V>[] array = new MainNode[30];
	int size=0;
	public K[] getKeys() {
		String[] ss=new String[size];
		System.out.println("Size is "+size);
		for (int i = 0,c=0; i < array.length; i++) {
		
		if(array[i]!=null){
				if(array[i].next==null){
					ss[c++]=(String) array[i].key;
				}else{
					MainNode<K,V> temp=array[i];
					while(temp!=null){
						ss[c++]=(String) temp.key;
						temp=temp.next;
					}
				}
			}
		}
		return (K[]) ss;
	}

	
	public V getValue(K str) {
		int k=(((String) str).charAt(0))%array.length;
		V val=(V) " ";
		MainNode<K,V> temp=array[k];
		if(temp.next!=null){
			while(temp!=null){
				if(temp.key.equals(str)){
					val=(V) (val+" | with key-"+temp.key+" and value-"+temp.value);
				}
				temp=temp.next;
			}
		}else{
			val=temp.value;
		}
		return val;
		
	}

	
	public void insert(K key, V value) {
		MainNode<K,V> temp=new MainNode<K,V>(key,value);
		int k=(((String) key).charAt(0))%array.length;
		System.out.println("Key-"+key+" value-"+value+" with index "+k);
		if(array[k]==null){
			array[k]=temp;
			size++;
		}
		else{
			MainNode<K,V> start=array[k];
			while(start.next!=null){
				start=start.next;
			}
			start.next=temp;
			size++;
		}		
	}

	
	public void remove(K key) {
		int k=(((String) key).charAt(0))%array.length;
			if(array[k].next==null){
				array[k]=null;
				size--;
			}else{
				MainNode<K,V> temp=array[k];
				while(temp!=null){
					if(temp.key.equals(key)){
						MainNode<K,V> t;
						t=temp.next;
						temp=t;
						array[k]=temp;
						size--;
						break;
					}
					temp=temp.next;
				}
			}
	}


}
