package test04;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	public Book(String title, String author, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd=false;
	}
	
	public void borrowBook() {
		if(isBorrowd) {
			System.out.println(title+" 이미 대출됨");
		}else {
			isBorrowd=true;
			System.out.println("도서대출 : "+ title);
		}
	}
	
	public void returnBook() {
		if(isBorrowd) {
			isBorrowd=false;
			System.out.println("도서반납 : "+title);
		}
	}
	public void getBookInfo() {
		System.out.println("제 목	: "+title);
		System.out.println("저 자	: "+author);
		System.out.println("ISBN	: "+isbn);
		System.out.printf("대출 여부	: %s\n",isBorrowd?"불가능":"가능");
	}

	public String getTitle() {
		return title;
	}

	public boolean isBorrowd() {
		return isBorrowd;
	}

	public void setBorrowd(boolean isBorrowd) {
		this.isBorrowd = isBorrowd;
	}
	
	
	
	
	
	
	

}
