package dictionary;

import java.util.Hashtable;
import java.util.Set;

public class HashDictionary <K extends Comparable<K>, V> implements DictionaryInterface <K,V>{

	Hashtable<K, V> hash=new Hashtable<K, V>();
	public K[] getKeys() {
		int i=0;
		String[] sy=new String[hash.size()];
		Set<String> keys = (Set<String>) hash.keySet();
        for(String key: keys){
            sy[i++]=key;
        }
		return (K[]) sy;
	}

	
	public V getValue(K str) {
		return hash.get(str);
	}

	public void insert(K key, V value) {
		hash.put(key, value);
	}
	
	public void remove(K key) {
		hash.remove(key);
	}

}
