import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class TestClinet {

	public static void main(String[] args) {
		int port = 5000;
		System.out.println("Client On");
		
		try {
			String message;
			
			Socket socket = new Socket("127.0.0.1", 5000);
			OutputStream outputStream = socket.getOutputStream();
			message = "0x5001|홍길동|22";
			outputStream.write(message.getBytes());
			socket.close();
			
			Socket socket2 = new Socket("127.0.0.1", 5000);
			OutputStream outputStream2 = socket2.getOutputStream();
			message = "0x6001|hong|aaa|홍길동|22|남성";
			outputStream2.write(message.getBytes());
			socket2.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
