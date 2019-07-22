package method.test.three;


public class MethodDeclare {

	/**
	 * 1. 한 개의 문자열(input) 을 매개변수로 입력 받아 
	 * 매소드 내에서 입력된 문자열의 길이와 같은 크기의  
	 * char 배열 letters 에 for 구문을 사용하여 
	 * 매개변수로 입력된 문자열의 문자를 한 개씩 순서대로 저장하고, 
	 * 이렇게 글자가 한 개씩 저장된 char 배열의 내용을 
	 * foreach 로 출력하는 메소드 convertStringToCharArray 를 작성하시오.
	 * 
	 * 참고 : 어떤 문자열의 길이는 
	 *        해당 문자열에 length() 메소드를 호출한 
	 *        리턴값으로 얻을 수 있음.
	 *        
	 *        어떤 문자열의 몇번째 index 의 글자 한 개는
	 *        해당 문자열에 charAt(index) 메소드를 호출한
	 *        리턴값으로 얻을 수 있음.
	 */
	public void convertStringToCharArray(String input) {
		char[] letters = new char[input.length()];
		
		for (int idx = 0; idx < letters.length; idx++) {
			letters[idx] = input.charAt(idx);
		}
		
		for (char letter: letters) {
			System.out.print(letter);
		}
		
		System.out.println();
	}
		

	/**
	 * 2. 1번과 같이 한 개의 문자열(input) 을 매개변수로 입력받아 
	 * 메소드 내에서 입력된 문자열의 길이와 같은 크기의 
	 * char 배열 letters 에 for 구문을 사용하여 
	 * 매개변수로 입력된 문자열의 문자를 한 개씩 순서대로 저장한 뒤, 
	 * for 구문을 사용하여 letters 배열 안에 저장된 글자를 
	 * 오름차순으로 정렬하여 정렬된 내용을 foreach 로 출력하고
	 * 정렬된 배열을 리턴하는 메소드 sortLetters 를 작성하시오.
	 * 
	 * 참고 : 두 변수의 값을 뒤바꿀 때(swap)는 임시변수를 하나 선언하여 활용한다.
	 *  예) int x = 10;
	 *      int y = 20; // 일 때, x <-- 20 을 y <-- 10 을 저장하려면
	 *      
	 *      int temp; 를 선언하여 
	 *      temp = x; // x 의 값을 먼저 temp에 옮긴 뒤
	 *      x = y;    // x 에 y 값을 저장하고
	 *      y = temp; // temp 에 옮겨졌던 원래의 x값을 y에 저장한다.
	 *      
	 */
	public char[] sortLetters(String input) {
		char[] letters = new char[input.length()];
		
		// 입력된 문자열을 char 배열에 넣기
		for (int idx = 0; idx < letters.length; idx++) {
			letters[idx] = input.charAt(idx);
		}

		// char 배열 정렬
		for (int idx = 0; idx < letters.length - 1; idx++) {
			for (int ind = idx + 1; ind < letters.length; ind++) {
				if (letters[idx] > letters[ind]) {
					char temp = letters[idx];
					letters[idx] = letters[ind];
					letters[ind] = temp;
				}
			}
		}
		
		for (char letter: letters) {
			System.out.print(letter);
		}
		System.out.println();
		
		return letters;
	}



}






