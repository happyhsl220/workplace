package inout;

import java.io.*;

public class CharStreamTest {

	public static void main(String[] args) {
		String dirString = "d:" + File.separator + "source" + File.separator + "test";
		File dir = new File(dirString);
		File file = new File(dir, "CharStreamTest.txt");
		try {
			if(!file.exists()) file.createNewFile();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			// �ѱ�, �Ͼ� �� ���� PrintWriter���
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			out.println("�ȳ��ϼ���?");
			out.println("���ļ��Դϴ�.");
			out.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			while(true) {
				String data = in.readLine();
				if(data == null) break;
				System.out.println(data);
			}
			in.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}		
		
	}

}
