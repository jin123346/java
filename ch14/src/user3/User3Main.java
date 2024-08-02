package user3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User3Main {
	public static void main(String[] args) {
		System.out.println("-------------------------------------");
		System.out.println("----------회원 관리 매니저 v1.0---------");
		System.out.println("-------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		User3DAO dao = User3DAO.getInstance();
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택 >>");
			int answer  =  sc.nextInt();
			
			if(answer==0) {
				
				break;
			}else if(answer==1) {
				// 입력 insert 
				User3VO user = new User3VO();
				System.out.print(" 아이디 입력 >> ");
				user.setUid(sc.next());
				System.out.print(" 이름 입력 >> ");
				user.setName(sc.next());
				
				System.out.print(" 생년월일 입력 >> ");
				user.setBirth(sc.next());
				
				System.out.print(" 핸드폰 번호 입력 >> ");
				user.setHp(sc.next());
				
				System.out.print(" 주소 입력 >> ");
				user.setAddr(sc.next());
				
				int result =dao.insertUser(user);
				
				if(result > 0) {
					System.out.println("입력 성공!");
				}else {
					System.out.println("입력에 실패하였습니다.");
				}
				
				
			}else if(answer==2) {
				//조회 select 
				List<User3VO> users = new ArrayList<User3VO>();
				
				users = dao.selectUsers();
				
				for(User3VO vo : users) {
					System.out.println(vo);
				}
				
				
			}else if(answer==3) {
				//검색 select (field)
				User3VO user = new User3VO();
				System.out.print(" 검색할 아이디 입력 >> ");
				String uid= sc.next();
				
				user = dao.selectUser(uid);
				
				if(user !=null) {
				System.out.println(user);
				}else {
					System.out.println("해당하는 아이디가 없습니다.");
				}
				
				
			}else if(answer==4) {
				//수정 update 
				User3VO user = new User3VO();
				System.out.print("수정할 아이디 입력 >> ");
				user.setUid(sc.next());
				System.out.print("이름 입력 >> ");
				user.setName(sc.next());
				
				System.out.print("생년월일 입력 >> ");
				user.setBirth(sc.next());
				
				System.out.print("핸드폰 번호 입력 >> ");
				user.setHp(sc.next());
				
				System.out.print("주소 입력 >> ");
				user.setAddr(sc.next());
				
				int result = dao.UpdateUser(user);
				if(result > 0) {
					System.out.println("업데이트 성공!");
				}else {
					System.out.println("업데이트 실패!");
				}
				
				
			}else if(answer==5) {
				//삭제 delete
				System.out.print("삭제할 아이디 입력 >>");
				String uid= sc.next();
				
				
				int result= dao.deletetUser(uid);
				
				if(result>0) {
					System.out.println(uid + " 삭제 성공!");
				}else {
					System.out.println("삭제 실패ㅜ.ㅜ");
				}
			}
		}
		System.out.println("프로그램 종료");
		
		
	}

}
