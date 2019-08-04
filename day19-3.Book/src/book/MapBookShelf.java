package book;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Map 구조로 구현된 책장 클래스
 * 
 * key   : Book.sequence 필드로 사용
 * value : Book 인스턴스 자체
 * 
 * @author 304
 *
 */
public class MapBookShelf implements BookShelf {
	
	// 1. 멤버변수
	private Map<Integer, Book> books;

	// 2. 생성자
	// (1) 기본생성자
	public MapBookShelf() {
		books = new HashMap<>(); 
	}
	
	// (2) 매개변수 생성자
	public MapBookShelf(Map<Integer, Book> books) {
		this.books = books; 
	}
	
	@Override
	public int add(Book book) {
		int addCnt = 0;
		
		// 키가 존재하지 않는 경우만 신규 추가
		if (!isExists(book)) {
			books.put(book.getSequence(), book);
			addCnt++;
		}
		
		return addCnt;
	}

	@Override
	public int set(Book book) {
		int setCnt = 0;
		
		// 수정할 책의 키가 존재하는 경우만
		if (isExists(book)) {
			books.put(book.getSequence(), book);
			setCnt++;
		}
		
		return setCnt;
	}

	@Override
	public int remove(Book book) {
		int rmCnt = 0;
		
		// 수정할 책의 키가 존재하는 경우만
		if (isExists(book)) {
			books.remove(book.getSequence());
			rmCnt++;
		}
		
		return rmCnt;
	}

	@Override
	public Book get(Book book) {
		Book found = null;
		
		if (isExists(book))	{
			found = books.get(book.getSequence());
		}
		
		return found;
	}

	@Override
	public List<Book> getAllBooks() {
		Collection<Book> collection = books.values();
		Book[] books = collection.toArray(new Book[] {});
		
		return Arrays.asList(books);
	}
	
	// 필요시 private 메소드 추가
	/**
	 * Map 인터페이스가 가지고 있는 
	 * containsKey() 메소드를 사용하여
	 * 키를 넘기며 그 키가 있으면 true, 아니면 false 를 리턴받아
	 * 키 존재 여부를 살피는 메소드
	 * 
	 * @param book
	 * @return
	 */
	private boolean isExists(Book book) {
		return books.containsKey(book.getSequence());
	}

}
