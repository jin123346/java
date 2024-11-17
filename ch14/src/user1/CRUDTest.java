package user1;

import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 2024/07/30
 * 이름 : 하진희
 * 내용 : CRUD 테스트
 */
public class CRUDTest {
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------");
		System.out.println("----------회원 관리 매니저 v1.0---------");
		System.out.println("-------------------------------------");
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택 >>");
			int answer  =  sc.nextInt();
			String sql=null;
			if(answer ==0) {
				
				break;
			}else if(answer ==1) {
				System.out.print("id 입력 >> ");
				String uid= sc.next();
				System.out.print("이름 입력 >> ");
				String name= sc.next();
				System.out.print("생년월일 입력 >> ");
				String birth= sc.next();
				System.out.print("휴대폰 입력 >> ");
				String hp= sc.next();
				System.out.print("나이 입력 >>");
				int age= sc.nextInt();
				UserDAO dao = UserDAO.getinstance();

				User1VO user = new User1VO(uid, name, birth, hp, age);
				
				
				dao.insertUser(user);
				System.out.println("입력 완료");
				System.out.println("-----------------------------------------");

				
			}else if(answer ==2) {
				UserDAO dao = UserDAO.getinstance();

			
				List<User1VO> users = dao.selectUsers();
				for(User1VO user : users) {
					System.out.println(user);
				}
				
				System.out.println("-----------------------------------------");

			
			}else if(answer ==3) {
				
				System.out.print("id 입력 >> ");
				String Searchuid= sc.next();
				
				UserDAO dao = UserDAO.getinstance();

				User1VO user = dao.selectUser(Searchuid);
				
				System.out.println(user);
			
				
			}else if(answer ==4) {
				User1VO user = new User1VO();
				System.out.print("수정 회원 아이디 입력 >> ");
				user.setUid(sc.next());
				System.out.print("수정 회원 이름 입력 >> ");
				user.setName(sc.next());
				System.out.print("수정 회원 생년월일 입력 >> ");
				user.setBirth(sc.next());
				System.out.print("수정 회원 휴대폰 입력 >> ");
				user.setHp(sc.next());
				System.out.print("수정 회원 나이 입력 >> ");
				user.setAge(sc.nextInt());


				int result = UserDAO.getinstance().updateUser(user);
				
				if(result > 0) {
					System.out.println("업데이트된 갯수 : "+result);
					System.out.println("업데이트 완료! ");
				}else {
					System.out.println("수정 할 회원 아이디가 없습니다.");
				}
				
				System.out.println("-----------------------------------------");

			}else if(answer ==5) {
				System.out.print("삭제 회원 아이디 입력 : ");
				String uid = sc.next();
				
				int result = UserDAO.getinstance().deleteUser(uid);
				
				if(result > 0) {
					System.out.println("삭제 완료!");
					
				}else {
					System.out.println("삭제할 아이디가 없습니다.");
				}
				
				System.out.println("-----------------------------------------");

			}	
			
		}
		System.out.println("프로그램 종료");

		
		sc.close();
	}
}
