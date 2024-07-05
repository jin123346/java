package sub3;

/*
 * 날짜 : 2024.06.28
 * 이름 : 하진희
 * 제목 : 연산자 실습하기 
 */

public class OperatorTest {
	public static void main(String[] args) {
		//산술연산자
		int num1 = 12;
		int num2 = 23;
		int num3 = 34;
		int num4 = 45;
		
		int result1 = num1 + num2;
		int result2 = num2-num1;
		int result3 = num3*num4;
		int result4 = num4/num1;  //몫
		int result5 = num4%num1;  //나머지 구하는 연산자
		
		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
		System.out.println("result3 : "+ result3);
		System.out.println("result4 : "+ result4);
		System.out.println("result5 : "+ result5);
		
		System.out.println();
		//증감연산자 ++, -- 
		int num =0;
		
		num++;  //1증가
		System.out.println("num : "+num);
		++num;  //1증가
		System.out.println("num : "+num);
		num--;  //1감소
		System.out.println("num : "+num);
		--num;  //1감소
		System.out.println("num : "+num);
		
		
		//복합연산자
		int n1 =1,n2=2,n3=3,n4=4;
		
		n1 +=1;  // n1 = n1 + 1
		n2 -=2;  // n2 = n2 - 2
		n3 *= 3; // n3 = n3 * 3
		n4/=4;   // n4 = n4 / 4
		
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		System.out.println("n3 : "+n3);
		System.out.println("n4 : "+n4);
		
		
		//비교연산자
		int var1 = 1;
		int var2 = 2;
		
		boolean rs1 = var1 > var2;   // var1 이 var2 보다 크다 
		boolean rs2 = var1 < var2;   // var1 이 var2 보다 작다
		boolean rs3 = var1 <= var2;  // var1 이 var2 보다 작거나 같다
		boolean rs4 = var1 >= var2;  // var1 이 var2 보다 크거나 같다
		boolean rs5 = var1 == var2;  // var1 이 var2 와 동일하다
		boolean rs6 = var1 != var2;  // var1 이 var2 와 동일하지않다.
		
		System.out.println("rs1 : "+ rs1);		
		System.out.println("rs2 : "+ rs2);
		System.out.println("rs3 : "+ rs3);
		System.out.println("rs4 : "+ rs4);
		System.out.println("rs5 : "+ rs5);
		System.out.println("rs6 : "+ rs6);
		
		
		//논리연산자
		int var3 = 3; 
		int var4 = 4;
		
		boolean res1 = (var3>3) && (var4>3); // (and)var3가 3보다 크고, var4가 3보다 크다.
		boolean res3 = (var3>2) && (var4>3); // (and)var3가 2보다 크고, var4가 3보다 크다.
		boolean res2 = (var3>3) || (var4>3); // (or)var3가 3보다 크거나, var4가 3보다 크다.
		boolean res4 = (var3>2) || (var4>4); // (or)var3가 2보다 크거나, var4가 4보다 크다.
		boolean res5 = (var3>3) || (var4>4); // (or)var3가 3보다 크거나, var4가 4보다 크다.
		boolean res6 = !(var3>var4);  // var3이 var4보다 크다는 것을 부정함 = var3가 var4보다 크지않다.
		
		System.out.println("res1 : "+res1);
		System.out.println("res2 : "+res2);
		System.out.println("res3 : "+res3);
		System.out.println("res4 : "+res4);
		System.out.println("res5 : "+res5);
		System.out.println("res6 : "+res6);
		
	
	}
}
