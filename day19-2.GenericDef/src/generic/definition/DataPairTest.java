package generic.definition;


/**
 * Generic 을 사용하여 
 * 사용자 정의한 클래스인
 * DataPair 를 테스트
 * 
 * @author 304
 *
 */
public class DataPairTest {

	public static void main(String[] args) {

		// 1. 선언
		DataPair<Integer, String> isDataPair;
		DataPair<String, String> ssDataPair;
		DataPair<Integer, Book> ibDataPair; 
		
		// 2. 초기화
		isDataPair = new DataPair<>(1, "one");
		ssDataPair = new DataPair<>("two", "둘");
		ibDataPair = new DataPair<>(1, new Book(1));
		
		// 3. 사용
		System.out.printf("%d:%s%n"
				, isDataPair.getKey(), isDataPair.getValue());
		System.out.printf("%s:%s%n"
				, ssDataPair.getKey(), ssDataPair.getValue());
		System.out.printf("%d:%s%n"
				, ibDataPair.getKey(), ibDataPair.getValue());
		
		
		
	}

}


