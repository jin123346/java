package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/19
 * #백준 : 2720번 진법 변화
 */

class Money{
	int q=0;
	int d=0;
	int n=0;
	int p=0;
	
	public Money(int q, int d, int n, int p) {
		this.q = q;
		this.d = d;
		this.n = n;
		this.p = p;
	}
	@Override
	public String toString() {
		return  q + " " + d + " " + n + " " + p + " ";
	}
	
	

}
public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		final int quarter = 25;
		final int dime=10;
		final int nickel = 5;
		
		List<Money> lists = new ArrayList<>();
		
		for(int i=0;i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int money = Integer.parseInt(st.nextToken());
			int q=0,d=0,n=0,p=0;
			while(money!=0) {
				q = money/quarter;
				money %= quarter;
				d = money/dime;
				money %= dime;
				n = money/nickel;
				money =  money%nickel;
				p = money;
				money -= p;
			}
			
			lists.add(new Money(q, d, n, p));
		}
		
		lists.stream().forEach(t -> System.out.println(t));
	
	}

}
