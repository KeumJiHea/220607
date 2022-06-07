package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05 {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		System.out.println(t);
		
		SimpleDateFormat fo =
				new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss�� -----");
		
		String s = fo.format(t);
		System.out.println(s);
		
		Date date = new Date();
		System.out.println(date);
		
		String r = fo.format(date);
		System.out.println(r);
		
		for(int i=0 ; i<10 ; i++) {
			try {
				Thread.sleep(1000); // 1�� ���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
				
	}
}
