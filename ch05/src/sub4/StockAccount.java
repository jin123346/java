package sub4;

public class StockAccount extends Account {
	private String stock;
	private int amount;
	private int price;
	
	public StockAccount(String bank, String acc, String name, int balance,String stock,int amount,int price) {
		super(bank, acc, name, balance);
		this.stock = stock;
		this.amount=amount;
		this.price = price;
		
	}
	
	public void buy(int amount,int price) {
		if(this.balance >= amount*price) {
			this.amount+= amount;
			this.price = price;
			this.balance -= amount*price;
		}else {
			System.out.println("잔고가 모자랍니다.");
		}
		
	}
	
	public void sell(int amount, int price) {
		if(this.amount >=amount) {
			this.amount-=amount;
			this.balance += amount*price; 
			this.price = price;
		}else {
			System.out.println("판매수량이 초과했습니다.");
		}
	}
	
	public void show() {
		System.out.println("------------------------------");
		System.out.println("증권사	: "+this.bank );
		System.out.println("계좌번호  : "+this.acc );
		System.out.println("예금주   	: "+this.name );
		System.out.println("현재잔액  : "+this.balance );
		System.out.println("주식종목  : "+this.stock );
		System.out.println("주식수량  : "+this.amount );
		System.out.println("현재가격  : "+this.price );
		System.out.println("------------------------------");
	}
	

}
