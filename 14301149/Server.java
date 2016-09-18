import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	public static void main(String args[]) {
		try {
			ServerSocket serverSocket = new ServerSocket(3333);
			Socket socket = null;
			
			int count=0;
			System.out.println("服务器即将起航！");
			while(true){
			socket = serverSocket.accept();
			ThreadServer ts=new ThreadServer(socket);
			ts.start();
			
			count++;
			System.out.println("客户端数量:"+count);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
