import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	public static void main(String args[]) {
		try {
			ServerSocket serverSocket = new ServerSocket(3333);
			Socket socket = null;
			
			int count=0;
			System.out.println("�����������𺽣�");
			while(true){
			socket = serverSocket.accept();
			ThreadServer ts=new ThreadServer(socket);
			ts.start();
			
			count++;
			System.out.println("�ͻ�������:"+count);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
