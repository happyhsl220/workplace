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
		
		//DataOutputStream�� �̿��Ͽ� �پ��� ���� Ÿ�Ժ��� ������� ����
		//int type �����ϱ�
		int a = 10;
		int b = 20;
		try {
			// ���ϰ�ü�� �Ķ���ͷ� �ؼ� FileOutputStream��ü ����
			FileOutputStream fos = new FileOutputStream(file);
			//FileOutputStream��ü�� �μ��� �ؼ� DataOutputStream��ü ����
			DataOutputStream out = new DataOutputStream(fos);
			//writeInt�Լ��� �̿��Ͽ� ���Ͽ� ���. ���� a, b�� ���� �ι� ����
			out.writeInt(a);
			out.writeInt(b);

			//�ݵ�� close�ؾ���
			out.close();
			
			// ���ϰ�ü�� �Ķ���ͷ� �ؼ� FileInputStream��ü ����
			FileInputStream fis = new FileInputStream(file);
			//FileInputStream��ü�� �μ��� �ؼ� DataInputStream��ü ����
			DataInputStream in = new DataInputStream(fis);
			//���Ͽ��� int���� �о�´� ���Ͽ� 2���� ���� �ֱ� ������ 2�� �д´�.
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
