package practice.methods.three;

public class DefineMethods {
	
	// 1.
	public int absolute(int x) {
		return (x > 0) ? x : -x;
	}
	
	
	// 2. 
	public void findMultiple(int x) {
		
		int count = 0;
		while (count < 100 / x ) {
			count++;
			System.out.println(x * count);			
		}
	}
	
	// 3. 
	public String decideSign(int x) {
		String result;
		if (x < 0) {
			result = "음의 정수";
		} else if (x == 0) {
			result = "정수 0";
		} else {
			result = "양의 정수";
		}
		
		return result;
	}
	
	// 4.
	public void repeateMessage(String message, int repeat) {
		
		String[] messages = new String[repeat];
		
		for (int idx = 0; idx < messages.length; idx++) {
			
			messages[idx] = message;
		}
		
		for (String msg: messages) {
			System.out.println(message);
		}
	}
	
	// 5.
	public double calcCircleArea(int r) {
		return 3.14 * r * r;
	}
	
	// 6.
	public int[] makeMultipleNums(int x) {
		
		int[] multiples = new int[100 / x];
		
		for (int idx = 0; idx < multiples.length; idx++) {
			multiples[idx] = x * (idx + 1);
		}
		
		return multiples;
	}
	
}
