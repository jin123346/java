package ch19.sec03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	private static ServerSocket serverSocket = null;
	
	public static void startServer() {
		//작업스레드 
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다립 \n");
						
						Socket socket = serverSocket.accept();
						
						//연결된 클라이언트 정보얻기
						
						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println("[서버] "+ isa.getHostString()+"의 연결요청을 수락함");
						
						socket.close();
						System.out.println("[서버] "+isa.getHostString()+"의 연결을 끊음");
					}
				} catch (Exception e) {
					System.out.println("[서버]"+e.getMessage());
				}
			};
		};
		
		thread.start();
		
	}
	
	public static void stopServer()  {
		try {
			
			//serverSocket 을 닫고 port 인바인딩
			serverSocket.close();
			System.out.println("[서버] 종료됨");
			
			
		} catch (IOException e) {
			
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("======================================================");
		System.out.println("===서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요===");
		System.out.println("======================================================");
		
		//tcp 서버 시작
		startServer();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		
				String key = br.readLine();
				if(key.toLowerCase().equals("q")) {
					break;
				}
			
		}
		br.close();
		
		stopServer();
		
		
		
		
		
		
	}

}
