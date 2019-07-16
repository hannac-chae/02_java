package practice.methods.three;

public class DefineMethodsTest {
	
	public static void main(String[] args) {
		
		DefineMethods methods = new DefineMethods();
		
		int[] multiples = methods.makeMultipleNums(30);
		for (int multiple: multiples)
			System.out.println(multiple);
		
		
		String decide = methods.decideSign(4);
		System.out.println(decide);
		
		methods.findMultiple(2);
		
	}
	
}