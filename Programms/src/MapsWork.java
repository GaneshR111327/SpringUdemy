
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapsWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> data = new HashMap();
		data.put(99,"world");
		data.put(3, "pingFunction");
		data.put(34,"ghdsoh");
		
		
		
		data.put(2331,"Helloworld");
		data.put(999, "pingFunction");
		data.put(2,"[hami");
		
//		for(Map.Entry<Integer,String> entry: data.entrySet()) {
//			
//			
//			
//			System.out.println(entry.getKey()+":"+entry.getValue());
//			
//		}
		Iterator<Entry<Integer,String>> entry = data.entrySet().iterator();
		
		while(entry.hasNext()) {
			
			System.out.println(entry.next());
		}
		

	}

}
