package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 날짜 : 2024/07/24
* 이름 : 하진희
* 내용 : 소켓 통신 실습하기
*/
public class SocketServer {
	public static void main(String[] args) {
		
		System.out.println("[Server]");
		
		ServerSocket serverSocket =  null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1",50001));
			
			System.out.println("연결 대기...");
			
			Socket socket= serverSocket.accept();
			
			System.out.println("연결 수립...");
//			데이터 수신(Client-> server )
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			
			int readBytes = is.read(bytes);
			
			String message = new String(bytes, 0,readBytes,"UTF-8");
			System.out.println(message);
			
			System.out.println("데이터 수신완료");
			
//			데이터 송신( client <- server) 
			
			OutputStream os = socket.getOutputStream();
			String sendMessage = "Hello client";
			byte[] sendBytes= sendMessage.getBytes();
			
			os.write(sendBytes);
			os.flush();
			System.out.println("데이터 송신 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("서버 종료....");
	}
}
