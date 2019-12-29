class Data<K,V>{
	
	private K key;
	private V value;
	public Data(K key, V value) {
//		super(/);
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	
	
}


public class PracticeGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Data data = new Data("raju",888);
			System.out.println(data);
	}

}
