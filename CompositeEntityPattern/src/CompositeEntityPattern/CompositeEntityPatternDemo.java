package CompositeEntityPattern;

public class CompositeEntityPatternDemo {
	public static void main(String[] args) {
		
		Client client = new Client();
		client.setData("Test 1", "Data1");
		client.printData();
		client.setData("Test 2", "Data2");
		client.printData();
	}
}


