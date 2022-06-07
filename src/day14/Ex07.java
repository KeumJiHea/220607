package day14;

import java.util.Scanner;

/*
 * 예외처리: 프로그램에서 예외적인 상황을 처리하는 것
 *		- 프로그램을 종료시키지 않는다
 * 강제예외: throw
 * 예외전가: throws
 * 예외처리: try, catch
 */

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, result=0;
		System.out.println("수 입력");
		try {
			x = input.nextInt();
			y = input.nextInt();
			result = x/y;
		}catch(Exception e) { //모든 오류/예외 상황은 Exception으로 받을 수 있음
			System.out.println("오류 발생!");
		}
		/*catch (java.lang.ArithmeticException e) {
			//System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		} catch(java.util.InputMismatchException e) {
			System.err.print("문자는 입력하실 수 없습니다.");
		}
		*/
		System.out.println(result);
	}
}
