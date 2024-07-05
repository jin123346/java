package sub1;



/*
 * 날짜 : 2024/07/02
 * 이름 : 하진희
 * 내용 : Java 배열 실습하기
 */

public class ArrayTest {
	public static void main(String[] args) {
		//배열
		int[] arr1 = {1, 2, 3, 4, 5};
        char[] arr2 = {'A','B','C'};
		String[] arr3 = {"서울","대전","대구","부산","광주"};
		
		//배열 원소 : 배열의 인덱스로 배열 값 참조
		System.out.println("arr1 1번째 원소 :"+arr1[0]);
		System.out.println("arr1 2번째 원소 :"+arr1[1]);
		System.out.println("arr1 3번째 원소 :"+arr1[2]);
		
		System.out.println("arr2 1번째 원소 :"+arr2[0]);
		System.out.println("arr2 2번째 원소 :"+arr2[1]);
		
		System.out.println("arr3 1번째 원소 :"+arr3[0]);
		System.out.println("arr3 2번째 원소 :"+arr3[1]);
		

		//배열 길이  - 배열 원소 갯수 
		System.out.println("arr1 배열 길이 :"+arr1.length);
		System.out.println("arr2 배열 길이 :"+arr2.length);
		System.out.println("arr3 배열 길이 :"+arr3.length);

		
		//배열 반복문
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		//배열 전용 반복문 => 해당 배열의 데이터 타입을 새롭게 지정함
		// arr2배열이 char ch에 대입됨 
		// for each 문 
		/*
		 * for ( type 변수명 : 객체 )

			ex) int[] a = {1,2,3};
			for(int i : a) { ...
		 */
		for(char ch : arr2) {
			System.out.print(ch+" ");
		}
		
		System.out.println();
		for(int i : arr1) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(String str : arr3) {
			System.out.print(str+" ");
		}
		
		System.out.println();
		//1차원 배열
		
		
		int[] scores = {80,60,78,62,92};
		
		int total = 0;
		
		for(int score : scores) {
			total +=score;
		}
		System.out.println("total : "+total);
		
		//2차원 배열  
		
		int[][] arr2d = {{1,2,3,4},
						 {5,6,7,8},
						 {9,10,11,12}};
		// [3][4]
		
		System.out.println(arr2d[0][0]);
		
		for(int a=0;a<arr2d.length;a++) {
			for(int b=0; b<arr2d[a].length;b++) {
				System.out.printf("arr2d[%d][%d] : %d\n",a,b,arr2d[a][b]);
			}
		}
		
		
		
		//3차원 배열 {{{}, {}, {}}, {{}, {}, {}}, {{}, {}, {}}}
		int[][][] arr3d = {
						   {{1,2,3},
							{4,5,6,},
							{7,8,9,}},
						   {{10,11,12},
						    {13,14,15},
						    {16,17,18}},
						   {{19,20,21},
						    {22,23,24},
						    {25,26,27}}
						   };
		
		System.out.println(arr3d[0][1][1]);
		System.out.println(arr3d[1][2][1]);
		System.out.println(arr3d[2][1][2]);
		

		for(int i=0;i<arr3d.length;i++) {
			for(int j=0;j<arr3d[i].length;j++) {
				for(int k=0;k<arr3d[i][j].length;k++) {
					System.out.printf("arr[%d][%d][%d] : %d\n",i,j,k,arr3d[i][j][k]);
				}
			}
		}
		
		
		
		
	}

}
