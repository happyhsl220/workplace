package inout;

import java.io.*;

public class PrintStreamTest {

	public static void main(String[] args) {
		String dirString = "d:" + File.separator + "source" + File.separator + "test";
		File dir = new File(dirString);
		File file = new File(dir, "PrintStreamTest.txt");
		try {
			if(!file.exists()) file.createNewFile();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream(file)));
			out.println("hello");
			out.println("thank you.");
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
			while(true) {
				int ch = in.read();
				if(ch < 0) break;
				System.out.print((char)ch);
			}
			in.close();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
