package day14;

class D01{
	public void test() throws InterruptedException {
		Thread.sleep(0);
		//���������� �ϸ� �޼ҵ带 ȣ���� �޼ҵ忡���� ����ó���� ���־����
		// try/catch�� ����ó���� �ϸ� ���⼭�� ó�����ָ� ��
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
			System.out.println("catch ����");
		}finally {
			System.out.println("finally ����");
		}
		System.out.println("���� ����� ����");
	}
}
