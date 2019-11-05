package inout;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		//file 경로 : d:\source\test.text01.txt
		//파일경로 표시방법
		//window : 역슬래쉬 2개로 표시 d:\\source\\test.text01.txt
		//unix : 슬래쉬 하나로 표시 :  d:/source/test.text01.txt
		//가장 좋은 방법은 File.separator를 사용
		String dirString = "d:" + File.separator + "source" + File.separator + "test";
		
		//디렉토리 객체생성
		File file_dir = new File(dirString);
		
		//실제 디렉토리가 없으면 생성
		if(!file_dir.exists()) {
			file_dir.mkdir();
		}
		
		//파일객체 생성
		File file01 = new File(file_dir, "text01.txt");
		
		//파일이 없으면 생성
		if (!file01.exists()) {
			try {
				file01.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		//해당 디렉토리의 파일 리스트 출력
		String list[] = file_dir.list();
		for(int i=0; i<list.length ; i++) {
			System.out.print(list[i]);
		}
	}

}
