package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpClient {

	public static void main(String[] args) {
		
		String serverIp = "127.0.0.1"; //127.0.0.1은 '나'를 의미함
		//String serverIp = "192.168.0.135"; //소켓이 연결되었다가 끊김. 연결이 지속적이지 않음

		BufferedReader br = null;
		BufferedWriter bw = null;
		Socket socket = null; //Client Socket을 Socket이라 함
		Scanner keyboard = null;

		try {
			System.out.println(serverIp+"에 연결중입니다.");
			socket = new Socket(serverIp, 7777); //(아이피주소, 포트)
			//server의 7777로 연결시도
			System.out.println("서버에 연결되었습니다.");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//소켓에 연결해서 stream을 만들어줌
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//대화 주고받아야 하니 양쪽에 Reader/Writer 

			new ClientThread(br).start();
			
			keyboard = new Scanner(System.in);

			System.out.println("이름을 입력하세요");
			bw.write(keyboard.nextLine()+"\n"); //뒤에 \n을 해줘야 readline 입장에선 '아 문장 하나가 끝나서 들여쓰기 했구나'라고 문장 끝난걸로 인식
			bw.flush();
			
			System.out.println(br.readLine()); //reads a line of text \n, \r이 있어야 문장이 끝난걸로 인식
					
			while (true) {
				System.out.println("\n메세지를 입력하세요.");
				String msg = keyboard.nextLine(); //nextline이니까 line 붙어있겠지
				
				bw.write(msg+"\n");
				bw.flush();

				//System.out.println(br.readLine());
				//이제 얘가 안 받고 thread가 받을거야

				if(msg.equals("quit")) break;
			}
				
		} catch (Exception e){
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

//본인이 치지 않아도 다른애들이 칮 내용을 받아들이는 스레드 필요함

class ClientThread extends Thread {
	
	BufferedReader br = null;
	
	public ClientThread(BufferedReader br) {
		this.br = br;
	}

	@Override
	public void run() {
		String msg = null;
		try {
			while(msg != br.readLine()) {
				System.out.println(msg);
			}
			
		} catch (Exception e) {
			//System.out.println(br.readLine());
		}
	}
}
