package day14;
//��� ���!
class Calc{//�θ�Ŭ����
	public void display() {
		System.out.println("i'm calc");
	}
}

class Computer extends Calc{//�ڽ�Ŭ����
	public void print() {
		System.out.println("i am computer");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		Computer calc = new Computer();
		calc.print(); //�켱 �ڽ� Ŭ������ Computer�� �޼ҵ� �ִ��� ��
		calc.display(); //���� Computer�� �޼ҵ尡 ������ �θ� Ŭ���� ��
	}
}
