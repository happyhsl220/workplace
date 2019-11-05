package inout;

import java.io.*;

public class FileOutPutStreamTest {

	public static void main(String[] args) {
		
		String dirString = "d:" + File.separator + "source" + File.separator + "test";
		File dir = new File(dirString);
		File file = new File(dir, "byteTest.txt");
		try {
			if(!file.exists()) file.createNewFile();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//FileOutputStream은 Byte단위로 처리하는 함수로 인수로 byte배열을 사용
		//String의 getBytes함수를 사용하여 Byte배열을 생성
		byte[] data = "Hello java!".getBytes();
		try {
			// 파일객체를 파라미터로 해서 FileOutputStream객체 생성
			FileOutputStream out = new FileOutputStream(file);
			//write함수를 이용하여 파일에 기록
			out.write(data);
			//반드시 close해야함
			out.close();
			
			//파일에서 읽은 내용을 담을 바이트배열 선언
			byte[] data2 = new byte[11];
			
			// 파일객체를 파라미터로 해서 FileInputStream객체 생성
			FileInputStream in = new FileInputStream(file);
			//파일을 읽어서 data2 배열에 기록
			in.read(data2);
			
			//배열의 내용을 화면에 출력
			for(int i=0 ; i<data2.length ; i++) {
				System.out.print((char)data2[i]);
			}
			//반드시 close해야함
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
