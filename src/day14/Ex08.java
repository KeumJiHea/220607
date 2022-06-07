package day14;

class D01{
	public void test() throws InterruptedException {
		Thread.sleep(0);
		//예외전가를 하면 메소드를 호출한 메소드에서도 예외처리를 해주어야함
		// try/catch로 예외처리를 하면 여기서만 처리해주면 됨
	}
}

class D02 extends D01{
	public void test2() throws InterruptedException {
		test();
	}
}

public class Ex08 {
	public static void main(String[] args) throws InterruptedException {
		D02 d = new D02();
		d.test2();
		
		try {
			System.out.println(10/2);
		}catch(Exception e){
			System.out.println("catch 실행");
		}finally {
			System.out.println("finally 실행");
		}
		System.out.println("다음 문장들 실행");
	}
}
