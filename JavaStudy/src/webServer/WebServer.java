package webServer;

import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
	private static final int port = 8080;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("Server Started!!");
			while(true) {
				Socket socket = serverSocket.accept();
				
				RequestHandler handler = new RequestHandler(socket);
				handler.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
