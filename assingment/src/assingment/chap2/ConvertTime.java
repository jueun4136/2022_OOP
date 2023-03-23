package assingment.chap2;

import java.util.*;
public class ConvertTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sencond = 100000;
		
		int day = sencond/(60*60*24);
		int hour = (sencond%(60*60*24))/(60*60);
		int minuts = ((sencond%(60*60*24))% (60*60))/60;
		int seconds = ((sencond%(60*60*24))% (60*60)) % 60;
		
		System.out.println(day);
		System.out.println(hour);
		System.out.println(minuts);
		System.out.println(seconds);
	}
}

