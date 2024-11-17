package shop;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import shop.dao.CustomerDAO;
import shop.dao.OrderDAO;
import shop.dao.ProductDAO;
import shop.vo.CustomerVo;
import shop.vo.OrderVO;
import shop.vo.ProductVO;

/*
 * 날짜 : 2024/07/31
 * 이름 : 하진희
 * 내용 : shop 미니 프로젝트 실습하기
 */
public class ShopMain {
	public static void main(String[] args) {
		System.out.println("--------------------------------------------------");
		System.out.println("-------------쇼핑몰에 오신것을 환영합니다!---------------");
		System.out.println("--------------------------------------------------");
		
		
		Scanner sc = new Scanner(System.in);
		CustomerDAO customerDAO = CustomerDAO.getInstnace();
		CustomerVo loginedCustomer =null;
		ProductDAO productDAO = ProductDAO.getInstance();
		OrderDAO orderDAO = OrderDAO.getinstance();
		
		
		
		while(true) {
			
			if(loginedCustomer ==null) {
				System.out.println("종료:0 | 로그인:1 | 회원가입:2 | 상품목록:3 | 주문하기:4 ");
			}else {
				System.out.println("종료:0 | 로그아웃:1 | 주문현황:2 | 상품목록:3 | 주문하기:4 ");
			}
			
			int answer = -1;
			 while (answer == -1) {
	                System.out.print("선택 > ");
	                try {
	                    answer = sc.nextInt();
	                } catch (InputMismatchException e) {
	                    System.out.println("숫자를 입력해주세요.");
	                    sc.next(); // 잘못된 입력을 버퍼에서 제거
	                }
	            }
			
			
			
			
			if(answer == 0 ) {
				break;
			}else if(answer ==1) {
				//로그인
				
				if(loginedCustomer == null) {

					System.out.print("아이디 입력 : ");
					String custId = sc.next();
					
					loginedCustomer = customerDAO.selectCustomer(custId);
					
					if(loginedCustomer != null) {
						System.out.println(loginedCustomer.getName() + "님 어서오세요!");
					}else {
						System.out.println("일치하는 회원이 없습니다.");
					}
				}else {
					//로그아웃
					System.out.println(loginedCustomer.getName()+"님 안녕히 가세요.");
					loginedCustomer=null;
				}
				
				
				
				
			}else if(answer ==2) {
				//회원가입
				CustomerVo customervo = new CustomerVo();
				if(loginedCustomer ==null) {
					 System.out.print("아이디 입력 : ");
					 String custId = sc.next();
					 
					//동일한 아이디 확인
					 if(customerDAO.selectCustomer(custId) !=null) {
						 System.out.println("동일한 id가 존재합니다.");
						 System.out.println("다시 시도해주세요.");
						 continue;
					 }
					 
					 customervo.setCustId(custId);
					  
					 System.out.print("이름 입력 : ");
					 customervo.setName(sc.next());
					 
					 System.out.print("휴대폰 입력 : ");
					 customervo.setHp(sc.next());
					 
					 System.out.print("주소 입력 : ");
					 customervo.setAddr(sc.next());
					 
				
					 int result = customerDAO.insertCustomer(customervo);
					 
					 if(result>0) {
						 System.out.println("회원가입을 축하합니다.");
					 }else {
						 System.out.println("회원가입에 실패했습니다.");
					 }
				}else {
					//주문현황
					// 주문현황(주문번호, 상품번호, 상품명, 주문수량, 주문자이름, 주문일자)
					
					String orderId = loginedCustomer.getCustId();
					
					List<OrderVO> orders =orderDAO.selectOrders(orderId);
					
					System.out.println("------------------------주문 목록--------------------");
					
					for(OrderVO order : orders) {
						System.out.println("주문번호 : "+order.getOrderNo()
									+"	| 상품번호 : "+order.getOrderProduct()
									+"	| 상품명 : "+order.getProdName()
									+"	| 주문수량 : "+order.getOrderCount() 
									+"	| 주문자 이름 : "+order.getOrderer()
									+"	| 주문 일자 : "+order.getOrderDate());
					}
					System.out.println("--------------------------------------------------");

				}
				
				
				 
				 
				 
				 
				 
				 
			}else if(answer ==3) {
				//상품목록
				
				List<ProductVO> products = productDAO.selectProducts();
				System.out.println("---------------상품목록-----------------");
				products.stream().forEach(System.out::println);
				System.out.println("--------------------------------------");
				
			}else if(answer ==4){
				//주문하기
				if(loginedCustomer ==null) {
					System.out.println("로그인이 필요합니다.");
					continue;
				}
				
				OrderVO orderVO = new OrderVO();
				orderVO.setOrderId(loginedCustomer.getCustId());
				System.out.print("주문 상품번호 입력 : ");
				int prodNo = sc.nextInt();
				orderVO.setOrderProduct(prodNo);
					
				System.out.print("주문 상품수량 입력 : ");
				int orderCount = sc.nextInt();
				orderVO.setOrderCount(orderCount);
					
				int ordercount = orderDAO.insertOrder(orderVO, prodNo, orderCount);
				
				if(ordercount > 0 ) {
					System.out.println("주문 성공!");
				}else {
					System.out.println("주문이 실패하였습니다.");
					continue;
				}
				
				
			}
			
		
		}
		sc.close();
		System.out.println("안녕히 가십시오.");
		
		
	}

}
