package day25_back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		//A server socket waits for requests to come in over the network.
		try {
			serverSocket = new ServerSocket(7777); //서버쪽 소켓준비
			System.out.println("서버가 준비되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();	
		}

		while (true) {
			BufferedReader br = null;
			BufferedWriter bw = null;
			Socket socket = null;

			try {
				System.out.println("Client 요청을 기다립니다.");
				socket = serverSocket.accept(); //7777포트를 열어서 클라이언트가 물려 들어오길 기다리고 있음. 승인하면 clinet 정보 가져와야 함. 그게 소켓
				//그럼 어떤 애가 들어왔는지 확인해야
				//근데 얜 왜 객체생성 안하는거지
				//초기값 설정하고 만드는거랑, 바로 만드는거랑 같은 것 같은데 왜 결과가 다르지
				
				System.out.println(socket.getInetAddress()+"로부터 연결요청이 들어왔습니다.");
				System.out.println(socket.getInetAddress()+"와 연결되었습니다.");

				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));				

				String name = br.readLine();
				System.out.println("Welcome "+name+" to TWICE World!"+"\n");
				bw.write("Welcome "+name+" to TWICE World"+"\n");// 한 줄의 끝을 반드시 알려줘야 함
				bw.flush();

				String msg = null;
				
				while ((msg = br.readLine()) != null) {
					bw.write(name+" : "+msg+"\n");
					bw.flush();
				}	
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(socket != null) socket.close();
					if(br != null) br.close();
					if(bw != null) bw.close();
				} catch (Exception e2) {
					e2.getStackTrace();
				}
			}
			
		}
		
	}

}
