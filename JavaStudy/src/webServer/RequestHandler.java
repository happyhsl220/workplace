package webServer;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class RequestHandler extends Thread {
	private Socket socket;
	
	public RequestHandler(Socket socket) {
		this.socket = socket;	
	}
	
	public void run() {
		try {
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			DataOutputStream dos = new DataOutputStream(out);
		
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			System.out.println("processing start!! " );

			String line = br.readLine();
			String action = line.substring(line.indexOf("/")+1, line.lastIndexOf("/")-5);
			System.out.println(line);
			System.out.println(action);
			while(!line.equals("")){			
				line = br.readLine();
				System.out.println(line);		
			}
			File file = new File(".");
			String filePath =  file.getAbsolutePath(); 
			File file2 = new File(filePath + File.separator + action );
			FileInputStream fis = new FileInputStream(file2);
			
			byte[] body = new byte[1000];
			fis.read(body);
//			byte[] body = "Hello World".getBytes();
			response200Header(dos, body.length);
			responseBody(dos, body);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
    private void response200Header(DataOutputStream dos, int lengthOfBodyContent) {
        try {
            dos.writeBytes("HTTP/1.1 200 OK \r\n");
            dos.writeBytes("Content-Type: text/html;charset=utf-8\r\n");
            dos.writeBytes("Content-Length: " + lengthOfBodyContent + "\r\n");
            dos.writeBytes("\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void responseBody(DataOutputStream dos, byte[] body) {
        try {
            dos.write(body, 0, body.length);
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
