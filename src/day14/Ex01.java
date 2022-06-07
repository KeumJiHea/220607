package day14;

class DBconnect{
	private static DBconnect db;
	private static int cnt=0;
	private DBconnect() {cnt++;}
	public int getCnt() {return cnt;}
	public void controllDB() {
		System.out.println("DB사용");
	}
	
	public static DBconnect getInstance() { //static -> class 이름으로 접근 가능
		if(db==null)
			db = new DBconnect();
		return db;
	}
}


public class Ex01 {
	public static void main(String[] args) {
//		DBconnect db01 = new DBconnect();
//		DBconnect db02 = new DBconnect();
//		DBconnect db03 = new DBconnect();
//		DBconnect db04 = new DBconnect();
//		DBconnect db05 = new DBconnect();
//		db01.controllDB();
//		System.out.println(db01.getCnt() + "명 연결 되었습니다.");
		
		DBconnect db01 = DBconnect.getInstance();
		DBconnect db02 = DBconnect.getInstance();
		DBconnect db03 = DBconnect.getInstance();
		DBconnect db04 = DBconnect.getInstance();
		System.out.println(db01);
		System.out.println(db02);
		System.out.println(db03);
		System.out.println(db04);
		System.out.println(db01.getCnt() + "명 연결 되었습니다.");

		
	}
}
