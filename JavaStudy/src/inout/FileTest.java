package inout;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		//file ��� : d:\source\test.text01.txt
		//���ϰ�� ǥ�ù��
		//window : �������� 2���� ǥ�� d:\\source\\test.text01.txt
		//unix : ������ �ϳ��� ǥ�� :  d:/source/test.text01.txt
		//���� ���� ����� File.separator�� ���
		String dirString = "d:" + File.separator + "source" + File.separator + "test";
		
		//���丮 ��ü����
		File file_dir = new File(dirString);
		
		//���� ���丮�� ������ ����
		if(!file_dir.exists()) {
			file_dir.mkdir();
		}
		
		//���ϰ�ü ����
		File file01 = new File(file_dir, "text01.txt");
		
		//������ ������ ����
		if (!file01.exists()) {
			try {
				file01.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		//�ش� ���丮�� ���� ����Ʈ ���
		String list[] = file_dir.list();
		for(int i=0; i<list.length ; i++) {
			System.out.print(list[i]);
		}
	}

}
