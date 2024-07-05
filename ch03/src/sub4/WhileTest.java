package sub4;

public class WhileTest {
	public static void main(String[] args) {
		//1부터 10까지 합
		int sum =0;
		int k=1;
		
		while (k<=10) {
			sum += k;
			k++;
		}
		System.out.println("1부터 10까지 합 : "+sum);
		//do ~while
		
		int total = 0;
		int j=1;
		
		do {
			if(j%2==0) {
			total += j;
			}
			j++;
		}while(j <= 10);
		
		System.out.println("1부터 10까지 짝수 합 : "+total);
		
		//break => while문 탈출
		int num=1;
		while(true) {
			if(num%5==0 && num%7==0) {
				break;
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수 : "+num);
		//continue => 그 지점에서 다시 처음으로  
		int tot = 0;
		int i=0;
		
		while(i<=10) {
			i++;
			if(i%2==1) {
				continue; // 반복문 처음으로 이동
			}
			tot += i ;
			
		}
		
		System.out.println("1부터 10까지 짝수 합 : "+ tot);
		
	}

}
