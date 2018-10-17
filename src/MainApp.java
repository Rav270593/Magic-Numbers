import java.io.File;
import java.io.FileInputStream;

public class MainApp {
	public static void main(String[] argv) throws Exception {
		FileInputStream fileIn = new FileInputStream("JPG.jpg");
		//FileInputStream fileIn = new FileInputStream("GIF.gif");
		int len;
	    byte data[] = new byte[16];
	    len = fileIn.read(data);
		for (int j = 0; j < 5; j++)
		    System.out.printf("%02X ", data[j]);		      	
	}
}
