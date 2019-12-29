
public class GenericSample<B> {
	
	private B data;
	
	public GenericSample(B data) {
//		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "GenericSample [data=" + data + "]";
	}

	public B getData() {
		return data;
	}
	

}

class Demo{
	
	GenericSample<String> gendata = new GenericSample<String>("gahilsnvlsnv");
	String hello = gendata.getData();
	
}
