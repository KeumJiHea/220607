package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05 {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		System.out.println(t);
		
		SimpleDateFormat fo =
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 -----");
		
		String s = fo.format(t);
		System.out.println(s);
		
		Date date = new Date();
		System.out.println(date);
		
		String r = fo.format(date);
		System.out.println(r);
		
		for(int i=0 ; i<10 ; i++) {
			try {
				Thread.sleep(1000); // 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
				
	}
}
