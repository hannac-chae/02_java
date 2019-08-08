package book.dao;

import static book.dao.ConnectionInfo.DRIVER;

import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

public class JdbcBookShelf implements BookShelf {

	// 커넥션 정보 : ConnnectionInfo 의 static 필드로 사용
	
	// 2. 생성자 
	public JdbcBookShelf() {
		// 1. 드라이버 로드
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 오류!" 
		                      + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Override
	public int add(Book book) throws DuplicateException {
		// INSERT 필요 객체 선언
		
		// 2. 커넥션 맺기
		
		// 3. 쿼리 준비
		
		// 4. 쿼리 실행
		
		// 5. 결과 처리
		
		// 6. 자원 해제
		return 0;
	}

	@Override
	public int set(Book book) throws NotFoundException {
		// UPDATE 필요 객체 선언
		
		// 2. 커넥션 맺기
		
		// 3. 쿼리 준비
		
		// 4. 쿼리 실행
		
		// 5. 결과 처리
		
		// 6. 자원 해제
		return 0;
	}

	@Override
	public int remove(Book book) throws NotFoundException {
		// DELETE 필요 객체 선언
		
		// 2. 커넥션 맺기
		
		// 3. 쿼리 준비
		
		// 4. 쿼리 실행
		
		// 5. 결과 처리
		
		// 6. 자원 해제
		return 0;
	}

	@Override
	public Book get(Book book) throws NotFoundException {
		// SELECT 1건 필요 객체 선언
		
		// 2. 커넥션 맺기
		
		// 3. 쿼리 준비
		
		// 4. 쿼리 실행
		
		// 5. 결과 처리
		
		// 6. 자원 해제
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		// SELECT 전체행 필요 객체 선언
		
		// 2. 커넥션 맺기
		
		// 3. 쿼리 준비
		
		// 4. 쿼리 실행
		
		// 5. 결과 처리
		
		// 6. 자원 해제
		return null;
	}
	
	
	private boolean isExists(Book book) {
		boolean exists = false;
		// SELECT 1건 필요 객체 선언
		
		// 2. 커넥션 맺기
		
		// 3. 쿼리 준비
		
		// 4. 쿼리 실행
		
		// 5. 결과 처리
		
		// 6. 자원 해제
		return exists;
	}

	@Override
	public List<Book> getBooksByTitle(String title) {
		// SELECT title 포함된 
		// 책목록 조회 필요 객체 선언
		
		// 2. 커넥션 맺기
		
		// 3. 쿼리 준비
		
		// 4. 쿼리 실행
		
		// 5. 결과 처리
		
		// 6. 자원 해제
		return null;
	}

	@Override
	public List<Book> getBooksByPrice(int min, int max) {
		// SELECT price min ~ max 사이인 
		// min, max 값 포함 책목록 조회 
		// 필요 객체 선언
		
		// 2. 커넥션 맺기
		
		// 3. 쿼리 준비
		
		// 4. 쿼리 실행
		
		// 5. 결과 처리
		
		// 6. 자원 해제
		return null;
	}

}



