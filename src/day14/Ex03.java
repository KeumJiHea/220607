package day14;

class A02{ //부모 클래스
	public A02(String n){
		System.out.println(n + " A02 생성자 실행");
	}
	
	public void t() {
		System.out.println("부모");
	}
}

class A01 extends A02{ //자식 클래스
	public A01() {
		super("부모 클래스에 전달할 값");
		System.out.println("A01 생성자 실행");
		super.t(); // super <- 부모 클래스의 메소드 적용
		this.t(); // this <- 자기 자신의 메소드 적용
	}
	public void t() {
		System.out.println("자식");
	}
	
	public A01(String s) { //메서드 오버로딩을 통해서도 처리 가능
		super(s);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		A01 a01 = new A01();
		//부모 클래스의 생성자가 자식 클래스보다 먼저 생성됨
		// 자기 자신을 먼저 찾아간 다음 만약 상속 받았으면 부모 클래스로 감
		// A01 class -> A02 class -> A02() -> A01()
		
		A01 a02 = new A01("받아주는 값");
		
		
	}
}
