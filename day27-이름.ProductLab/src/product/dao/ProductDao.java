package product.dao;

public class ProductDao {
	
	// (1) 멤버변수 SqlSessionFactory factory 선언
	   
	// (2) 생성자 
	//     factory 변수를 MybatisClient 를 사용하여 초기화 진행
	     
	// (3) 메소드
	//    1)  selectProducts() : List<Product>
	//      조회 쿼리 아이디 : selectAllProducts
	        
	//    2)  selectProduct(PrimaryKey pk) : Product
	//    	조회 쿼리 아이디 : selectProduct
	    	 
	//    3)  insertProduct(Product product) : int
	//    	조회 쿼리 아이디 : insertProduct
	    	 
	//    4)  updateProduct(PrimaryKey pk, Product product) : int
	//    	조회 쿼리 아이디 : updateProduct
	    	
	//    5)  deleteProduct(PrimaryKey pk) : int
	//    	조회 쿼리 아이디 : deleteProduct
	    	
	//    6)  selectProducts(String name) : List<Product>
	//    	조회 쿼리 아이디 : selectByName
	    	
	//    7)  selectProducts(Price price) : List<Product>
	//    	조회 쿼리 아이디 : selectByPrice
	    	
	//    8)  selectProductsByMinPrice(int min) : List<Product>
	//    	조회 쿼리 아이디 : selectExpensiveThan
	    	
	//    9)  selectProductsByMaxPrice(int max) : List<Product>
	//    	조회 쿼리 아이디 : selectCheapThan
	    	
	//    10) selectMostExpensive() : List<Product>
	//    	조회 쿼리 아이디 : selectMostExpensive
	    	
	//    11) selectMostAmount() : List<Product>
	//    	조회 쿼리 아이디 : selectMostQuantity
	
}
