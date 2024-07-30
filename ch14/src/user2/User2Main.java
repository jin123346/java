package user2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import user1.User1VO;

public class User2Main {
	public static void main(String[] args) {
		System.out.println("-------------------------------------");
		System.out.println("----------회원 관리 매니저 v1.0---------");
		System.out.println("-------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택 >>");
			int answer  =  sc.nextInt();
			if(answer==0) {
				break;
			}else if(answer ==1 ) {
				//입력
				User2VO vo = new User2VO();
				System.out.println("    << 새로운 user 생성>>   ");
				System.out.print("ID 입력 >> ");
				vo.setUid(sc.next());
				System.out.print("이름 입력 >> ");
				vo.setName(sc.next());
				System.out.print("생년월일 입력(0000-00-00)>> ");
				vo.setBirth(sc.next());
				System.out.print("주소 입력 >> ");
				vo.setAddr(sc.next());
				
				int result = User2DAO.getinstance().insertUSer(vo);
				
				
				if(result > 0) {
					System.out.println("입력 완료!");
				}else {
					System.out.println("중복되는 id가 존재합니다.");
					System.out.println("다시 입력하세요.");
				}
				
				System.out.println("-------------------------------------");

				
			}else if(answer ==2 ) {
				//조회
				User2DAO dao = User2DAO.getinstance();
				List<User2VO> users = dao.selectUSers();
				
				for(User2VO user : users) {
					System.out.println(user);
				}
				
				
				
				
			}else if(answer ==3 ) {
				//검색
				User2DAO dao = User2DAO.getinstance();
				System.out.print("검색할 id 입력 >> ");
				User2VO user = dao.selectUSer(sc.next());
				
				System.out.println(user);
				
				
				
			}else if(answer ==4 ) {
				//수정
				User2VO user = new User2VO();
				System.out.print("수정 회원 아이디 입력 >> ");
				user.setUid(sc.next());
				System.out.print("수정 회원 이름 입력 >> ");
				user.setName(sc.next());
				System.out.print("수정 회원 생년월일 입력 >> ");
				user.setBirth(sc.next());
				System.out.print("수정 회원 주소 입력 >> ");
				user.setAddr(sc.next());
				 
				int result = User2DAO.getinstance().updateUSer(user);
				
				if(result >0) {
					System.out.println("update 완료! ");
				}else {
					System.out.println("해당하는 아이디가 없습니다.");
				}
				
				
			}else if(answer ==5 ) {
				//삭제
				
				System.out.print("삭제할 아이디 입력 >>");
				String uid= sc.next();
				
				int result = User2DAO.getinstance().deleteUSer(uid);
				
				if(result >0 ) {
					System.out.println("\""+uid+"\""+ " 삭제 완료 !");
				}else {
					System.out.println("해당하는 아이디가 없습니다. ");
				}
				
			}
			
			
		}
		
		System.out.println("프로그램 종료!");
		sc.close();
	}

}
