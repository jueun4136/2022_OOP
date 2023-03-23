package assingment.chap2;

import java.io.FileInputStream;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws Exception {
		byte[] array=new byte[3];
		FileInputStream fis=new FileInputStream("./text.txt");
		
		int n=fis.read(array);
		System.out.println("읽은 바이트갯수:"+ n); // 3
		for(byte b : array) System.out.print((char)b+"    "); // a a b
		System.out.println();
	
		
		n=fis.read(array);
		System.out.println("읽은 바이트갯수:"+ n); // 3
		for(byte b : array) System.out.print((char)b+"    "); // b c c 
		System.out.println();
		
		
		n=fis.read(array);
		System.out.println("읽은 바이트갯수:"+ n); // 3
		for(byte b : array) System.out.print((char)b+"    "); //13 10 d
		System.out.println();
		
		
		n=fis.read(array);
		System.out.println("읽은 바이트갯수:"+ n); // 2
		for(byte b : array) System.out.print((char)b+"    "); //d e d
		System.out.println();

	}
}
