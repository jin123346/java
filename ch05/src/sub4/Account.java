package sub4;

public class Account {
	//속성
	protected String bank;
	protected String acc;
	protected String name;
	protected int balance;
	
	
	//생성자
	public Account(String bank, String acc, String name, int balance) {
		super();
		this.bank = bank;
		this.acc = acc;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(int plusMoney) {
		this.balance += plusMoney;
		
	}
	
	public void withdraw(int minusMoney) {
		this.balance -= minusMoney;
		
	}
	
	//getter,setter 생성
	
	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void show() {
		System.out.println("----------------------");
		System.out.println("은행명	: "+bank);
		System.out.println("계좌번호	: "+acc);
		System.out.println("입금주	: "+name);
		System.out.println("현재잔액 	: "+balance);
		System.out.println("----------------------");
	}

		
	
	}
