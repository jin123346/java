package sub2;

public class Book {
	private String title;
	private String author;
	private String	isbn;
	private int availableCopies;
	public Book(String title, String author, String isbn, int availableCopies) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = availableCopies;
	}
	
	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public int getAvailableCopies() {
		return availableCopies;
	}



	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}



	public boolean borrowBook() {
		if(availableCopies>0) {
			this.availableCopies--; 
			System.out.println("대출 성공");
			System.out.println("'"+this.title+"'의 남은 도서 수 : "+ this.availableCopies);
			System.out.println();
			return true;
		}else {
			System.out.println("대출 실패");
			System.out.println();
			return false;
		}
	}
	
	public void returnBook() {
		this.availableCopies+=1;
		System.out.println("반납완료 되었습니다.");
		System.out.println("'"+this.title+"'의 남은 도서 수 : "+ this.availableCopies);

	}
	
	public void show() {
		System.out.println("--------------------------------------------");
		System.out.println("책 제목  		  : "+this.title);
		System.out.println("책 저자 		  : "+this.author);
		System.out.println("책 ISBN 	  : "+this.isbn);
		System.out.println("이용 가능한 수 : "+this.availableCopies );
		System.out.println("--------------------------------------------");

	}
}
