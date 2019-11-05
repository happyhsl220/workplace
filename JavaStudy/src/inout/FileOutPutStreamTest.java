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
		
		//FileOutputStream�� Byte������ ó���ϴ� �Լ��� �μ��� byte�迭�� ���
		//String�� getBytes�Լ��� ����Ͽ� Byte�迭�� ����
		byte[] data = "Hello java!".getBytes();
		try {
			// ���ϰ�ü�� �Ķ���ͷ� �ؼ� FileOutputStream��ü ����
			FileOutputStream out = new FileOutputStream(file);
			//write�Լ��� �̿��Ͽ� ���Ͽ� ���
			out.write(data);
			//�ݵ�� close�ؾ���
			out.close();
			
			//���Ͽ��� ���� ������ ���� ����Ʈ�迭 ����
			byte[] data2 = new byte[11];
			
			// ���ϰ�ü�� �Ķ���ͷ� �ؼ� FileInputStream��ü ����
			FileInputStream in = new FileInputStream(file);
			//������ �о data2 �迭�� ���
			in.read(data2);
			
			//�迭�� ������ ȭ�鿡 ���
			for(int i=0 ; i<data2.length ; i++) {
				System.out.print((char)data2[i]);
			}
			//�ݵ�� close�ؾ���
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
