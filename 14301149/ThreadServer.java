import java.io.*;
import java.net.Socket;


public class ThreadServer extends Thread{
	Socket socket=null;
	public ThreadServer(Socket socket){
		this.socket=socket;
	}
	public void run(){
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			is=socket.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			StringBuffer sb=new StringBuffer(br.readLine());
			String request=sb.reverse().toString();
			
			System.out.println(request);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				try {
					if(is!=null)
					is.close();
					if(isr!=null)
						isr.close();
					if(br!=null)
						br.close();
					if(socket!=null)
						socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	}
}
