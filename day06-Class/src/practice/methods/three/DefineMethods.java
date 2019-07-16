package practice.methods.three;

public class DefineMethods {
	
	/**
	 * 1. 정수 x를 입력받아 
	 * x의 절댓값을 리턴 
	 * @param x : int
	 * @return int : x의 절댓값
	 */
	public int absolute(int x) {
		//int absX = (x > 0) ? x : -x;
		// return absX;
		return (x > 0) ? x : -x;
	}
	
	
	/**
	 * 2. 정수 x를 입력받아 입력된 값의
	 * 배수 중 100 이하의 수를 모두 출력 
	 * @param x : int
	 */
	public void findMultiple(int x) {
		
		int count = 0;
		while (count < 100 / x) {
			count++;
			System.out.println(x * count);			
		}
	}
	
	/**
	 * 3. 매개변수로 입력된 정수(x)에 대하여
	 * 0보다 작으면 : "음의 정수"
	 * 0이면        : "정수 0"
	 * 0보다 크면   : "양의 정수"
	 * 와 같이 정수의 부호판별을 하여 판별 내용을
	 * 문자열로 리턴 
	 * @param x : int
	 * @return String : 부호판별 결과 문자열
	 */
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
	
	/**
	 * 4. 문자열(message)과 정수(repeat)를 
	 * 매개변수로 입력받아
	 * repeat 크기의 문자열 배열을 만들고
	 * 생성된 배열의 원소마다 message 를 저장한 뒤
	 * 배열의 내용을 출력
	 * 
	 * @param message : String
	 * @param repeat : int
	 */
	public void repeateMessage(String message, int repeat) {
		
		String[] messages = new String[repeat];
//		String[] array = new String[repeat];
//		String[] a = new String[repeat];
		
		// messages 배열에 값 저장
		for (int idx = 0; idx < messages.length; idx++) {
			messages[idx] = message;
		}
		
		// message 배열의 값 출력
		for (String msg: messages) {
			System.out.println(msg);
		}
	}
	
	/**
	 * 5. 원의 반지름을 매개변수 (r)로 입력받아
	 * 원의 넓이를 구하여 double 로 리턴
	 * 
	 * 원의 넓이 공식 : 3.14 * r * r
	 * 
	 * @param r : int
	 * @return double : 원의 넓이
	 */
	public double calcCircleArea(int r) {
		double circleArae = 3.14 * r * r; 
		return circleArae;
	}
	
	/**
	 * 6. 정수(x) 를 매개변수로 입력받아
	 * 입력된 값의 배수 중 100 이하의 수를
	 * 배열에 저장하고
	 * 그 배열을 리턴
	 * @param x : int
	 * @return int[] : 입력된 x의 100이하 배수가 저장된 배열
	 */
	public int[] makeMultipleNums(int x) {
		
		int[] multiples = new int[100 / x];
		
		for (int idx = 0; idx < multiples.length; idx++) {
			multiples[idx] = x * (idx + 1);
		}
		
		return multiples;
	}
	
}
