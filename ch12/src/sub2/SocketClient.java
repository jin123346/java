package sub2;
/*
* 날짜 : 2024/07/24
* 이름 : 하진희
* 내용 : 소켓 통신 실습하기
*/

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketClient {
	public static void main(String[] args) {
		System.out.println("[Client]");
		
		//선언과 생성을 분리 
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("연결 요청");
			
			//소켓 연결 (ip 주소와,  포트번호) 127.0.0.1 -> 시스템주소(loopback) 
			//socket.connect(new InetSocketAddress("localhost",50001));

			socket.connect(new InetSocketAddress("127.0.0.1",50001));
			System.out.println("연결 성공");
			
			
//			데이터 송신(client -> server)
			OutputStream os = socket.getOutputStream();
			String message = "Hello Server";
			
			byte[] messageByte = message.getBytes();
			
			os.write(messageByte);
			os.flush();
			System.out.println("데이터 송신 완료");
	

//			데이터 수신 (client <- Server)
			
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			
			int readBytes = is.read(bytes);
			
			String receiveMessage = new String(bytes, 0,readBytes,"UTF-8");
			System.out.println(receiveMessage);
			
			System.out.println("데이터 수신완료");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Client 종료...");
	}
}
