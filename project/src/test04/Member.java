package test04;

public class Member {
	private String name;
	private String memberId;
	private Book borrowedBook;
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
	}

	public void borrowBook(Book book) {
		if(book.isBorrowd()) {
			System.out.println(book.getTitle()+" 이미 대출됨");
		}else {
			book.borrowBook();
			this.borrowedBook= book;
		
		}
		
	}
	
	public void returnBook(Book book) {
		if(book.isBorrowd()) {
			this.borrowedBook=null;
			book.returnBook();
			
		}
		
	}
	public void getMemberInfo() {
		System.out.println("회원 이름	: "+name);
		System.out.println("회원 ID	: "+memberId);
		System.out.printf("대출한 도서 : %s\n",borrowedBook ==null?"없음":borrowedBook.getTitle());
	}
	
	
	

}
