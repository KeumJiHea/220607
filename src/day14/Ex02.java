package day14;
//상속 기능!
class Calc{//부모클래스
	public void display() {
		System.out.println("i'm calc");
	}
}

class Computer extends Calc{//자식클래스
	public void print() {
		System.out.println("i am computer");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		Computer calc = new Computer();
		calc.print(); //우선 자식 클래스인 Computer에 메소드 있는지 봄
		calc.display(); //만약 Computer에 메소드가 없으면 부모 클래스 봄
	}
}
