import java.io.FileInputStream;

class MagicNum {
	String hex1;
	String hex2;
	String hex3;
	String hex4;
	String hex5;
	
	public MagicNum() {
	}
	/*
	public MagicNum(String hex1,String hex2,String hex3,String hex4) {
		this.hex1 = hex1;
		this.hex2 = hex2;
		this.hex3 = hex3;
		this.hex4 = hex4;
	}
	
	public MagicNum(String hex1,String hex2,String hex3,String hex4,String hex5) {
		this.hex1 = hex1;
		this.hex2 = hex2;
		this.hex3 = hex3;
		this.hex4 = hex4;
		this.hex5 = hex5;
	}
	*/
}

public class MainApp {
	public static void main(String[] argv) throws Exception {
		FileInputStream fileIn = new FileInputStream("JPG.jpg");
		//FileInputStream fileIn = new FileInputStream("GIF.gif");
		int len;
	    byte data[] = new byte[16];
	    len = fileIn.read(data);
		for (int j = 0; j < 5; j++) 
		    System.out.printf("%02X ", data[j]);
		
		MagicNum fileX = new MagicNum();
		//fileX.hex1 = String.valueOf("%02X ",data[0]);
		fileX.hex1 =String.format("%02x", Byte.parseByte(data[0]));
		System.out.printf("%02X ",fileX.hex1); 
	}
}
