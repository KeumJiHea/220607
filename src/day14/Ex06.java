package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06 {
	private Date date;
	private SimpleDateFormat simple;
	
	public Ex06() {	
		simple = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		}
	
	public void timePrint() {
		for(int i=0 ; i<10 ; i++) {
			date = new Date();
			String d = simple.format(date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(d);
		}

	}
	

	
	
	
	
	
}
