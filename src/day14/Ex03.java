package day14;

class A02{ //�θ� Ŭ����
	public A02(String n){
		System.out.println(n + " A02 ������ ����");
	}
	
	public void t() {
		System.out.println("�θ�");
	}
}

class A01 extends A02{ //�ڽ� Ŭ����
	public A01() {
		super("�θ� Ŭ������ ������ ��");
		System.out.println("A01 ������ ����");
		super.t(); // super <- �θ� Ŭ������ �޼ҵ� ����
		this.t(); // this <- �ڱ� �ڽ��� �޼ҵ� ����
	}
	public void t() {
		System.out.println("�ڽ�");
	}
	
	public A01(String s) { //�޼��� �����ε��� ���ؼ��� ó�� ����
		super(s);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		A01 a01 = new A01();
		//�θ� Ŭ������ �����ڰ� �ڽ� Ŭ�������� ���� ������
		// �ڱ� �ڽ��� ���� ã�ư� ���� ���� ��� �޾����� �θ� Ŭ������ ��
		// A01 class -> A02 class -> A02() -> A01()
		
		A01 a02 = new A01("�޾��ִ� ��");
		
		
	}
}
