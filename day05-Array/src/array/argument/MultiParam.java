package array.argument;

/**
 * 메소드의 파라미터 갯수를 지정하지 않고
 * 메소드 파라미터를 동적으로 받을 수 있도록 정의하는
 * 멀티 파라미터 기법
 * 
 * @author 601-
 *
 */
public class MultiParam {

	public static void main(String[] args) {
		int sumResult = summary(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.print("summary(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)=");
		System.out.println(sumResult);
		
		System.out.println("========================");
		summary("홍길동", 1, 2, 3, 4, 5);

	}

	// multi parameter 를 사용하는 summary 메소드 정의
	public static int summary(int... input) {
		
		int sum = 0;
		
		for (int idx = 0; idx < input.length; idx++) {
			sum += input[idx];
		}
		
		return sum;
	}
	
	
	
	public static void summary(String name, int... input) {
		
		int sum = summary(input);
		System.out.println(name + "님이 좋아하는 숫자의 합은 " + sum);
	}
}
