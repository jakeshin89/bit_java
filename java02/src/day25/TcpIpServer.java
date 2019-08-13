package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TcpIpServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		//A server socket waits for requests to come in over the network.
		List<BufferedWriter> clientList = new ArrayList<BufferedWriter>();
		
		try {
			serverSocket = new ServerSocket(7777); //서버쪽 소켓준비
			System.out.println("서버가 준비되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();	
		}

		while (true) {	
			try {
				System.out.println("Client 요청을 기다립니다.");
				Socket socket = serverSocket.accept(); 
				//7777포트를 열어서 클라이언트가 물려 들어오길 기다리고 있음. 승인하면 clinet 정보 가져와야 함. 그게 소켓
				//그럼 어떤 애가 들어왔는지 확인해야
				//근데 얜 왜 객체생성 안하는거지
				//초기값 설정하고 만드는거랑, 바로 만드는거랑 같은 것 같은데 왜 결과가 다르지
				new ServerThread(socket, clientList).start();

				System.out.println(socket.getInetAddress()+"와 연결되었습니다.");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


class ServerThread extends Thread{

	BufferedReader br = null;
	BufferedWriter bw = null;
	Socket socket = null;
	String name = null;
	List<BufferedWriter> clientList = null;
	//Client랑 맞물리는 부분, thread 돌릴 객체 띄우기
	//clientList를 공유해야 하니 파라미터에 넘기기
	
	public ServerThread(Socket socket, List<BufferedWriter> clientList) {
			
		this.socket = socket;
		this.clientList = clientList;
		
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			clientList.add(bw);
			
			name = br.readLine();
			//bw.write("Welcome "+name+" to TWICE World"+"\n");// 한 줄의 끝을 반드시 알려줘야 함
			//bw.flush();
			broadcast("님이 입장하셨습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	@Override
	public void run() {
		String msg = null;
		try {
			while ((msg = br.readLine()) != null) {
				broadcast(msg);
				if(msg.equals("quit")){
					broadcast("님이 퇴장하셨습니다.");
				}
			}
		} catch (Exception e){
			
		} finally {
			try {
				if(br != null) br.close();
				if(bw != null) {
					clientList.remove(bw);
					bw.close();
				}
				if(socket != null) socket.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
	}

	//동기화문제가 생길 수 있음. 스레드 순서 지맘대로.
	private synchronized void broadcast(String msg) {
		clientList.forEach(bw -> {
			try {
				bw.write(name+" : "+msg+"\n");
				bw.flush();				
			} catch (IOException e) {
				//e.printStackTrace();
			}
			
		});
	}
}