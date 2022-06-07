package day14;

class C01{
	protected String n; //상속 받은 자식 또는 같은 패키지에서는 접근 가능
}

class C02 extends C01{
	public void test() {
		n = "안녕하세요";
		print();
	}
	
	public void print() {
		System.out.println(n);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		C02 c = new C02();
		c.test();
	}
}
