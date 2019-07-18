package method.test.three;

public class MethodDeclareTest {

	public static void main(String[] args) {

		MethodDeclare method = new MethodDeclare();
		
		method.convertStringToCharArray("안녕하세요, 자바!");
		// 출력 결과 : "안녕하세요, 자바!"
		
		method.sortLetters("Hello, World!");
		method.sortLetters("안녕하세요, 자바!");
		// 출력 결과 : " !,HWdellloor", " !,녕바세안요자하" 
	}

}
