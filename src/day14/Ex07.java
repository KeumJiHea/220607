package day14;

import java.util.Scanner;

/*
 * ����ó��: ���α׷����� �������� ��Ȳ�� ó���ϴ� ��
 *		- ���α׷��� �����Ű�� �ʴ´�
 * ��������: throw
 * ��������: throws
 * ����ó��: try, catch
 */

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, result=0;
		System.out.println("�� �Է�");
		try {
			x = input.nextInt();
			y = input.nextInt();
			result = x/y;
		}catch(Exception e) { //��� ����/���� ��Ȳ�� Exception���� ���� �� ����
			System.out.println("���� �߻�!");
		}
		/*catch (java.lang.ArithmeticException e) {
			//System.out.println("0���� ���� �� �����ϴ�.");
			e.printStackTrace();
		} catch(java.util.InputMismatchException e) {
			System.err.print("���ڴ� �Է��Ͻ� �� �����ϴ�.");
		}
		*/
		System.out.println(result);
	}
}
