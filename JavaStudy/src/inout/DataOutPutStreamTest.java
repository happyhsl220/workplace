package inout;

import java.io.*;

public class DataOutPutStreamTest {

	public static void main(String[] args) {
		
		String dirString = "d:" + File.separator + "source" + File.separator + "test";
		File dir = new File(dirString);
		File file = new File(dir, "DataOutputTest.txt");
		try {
			if(!file.exists()) file.createNewFile();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//DataOutputStream을 이용하여 다양한 변수 타입별로 입출력을 수행
		//int type 저장하기
		int a = 10;
		int b = 20;
		try {
			// 파일객체를 파라미터로 해서 FileOutputStream객체 생성
			FileOutputStream fos = new FileOutputStream(file);
			//FileOutputStream객체를 인수로 해서 DataOutputStream객체 생성
			DataOutputStream out = new DataOutputStream(fos);
			//writeInt함수를 이용하여 파일에 기록. 변수 a, b에 대해 두번 수행
			out.writeInt(a);
			out.writeInt(b);

			//반드시 close해야함
			out.close();
			
			// 파일객체를 파라미터로 해서 FileInputStream객체 생성
			FileInputStream fis = new FileInputStream(file);
			//FileInputStream객체를 인수로 해서 DataInputStream객체 생성
			DataInputStream in = new DataInputStream(fis);
			//파일에서 int값을 읽어온다 파일에 2개의 값이 있기 때문에 2번 읽는다.
			int x = in.readInt();
			int y = in.readInt();

			in.close();
			
			System.out.println("x = " + x);
			System.out.println("y = " + y);

		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
