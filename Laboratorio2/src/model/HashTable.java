package model;
//K = key  T = value
public class HashTable<K, T> {

	private K key;
	private T object;
	private int amountBays;
	
private Object[] list;
	
	public HashTable(int pAmountBays){
	    list = new Object[pAmountBays];
	}
	
	public int add(K key, T objetc){
		int position =hashFuntion(key);
		list[position]=objetc;
		return position;
	}

	//Esto me da l Numero de la Bahia en la que se va a agregar
	public int hashFuntion(K key){
		int r= key.hashCode();
		int result = (r%list.length);
		return result;
	}	

}
