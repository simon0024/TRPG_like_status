package test;
import java.util.Scanner;

public class Scanname {
	private static Scanner scan;
	public static void main(String[] args){
		scan = new Scanner(System.in);
		System.out.println("���Ȃ��̖��O����͂��Ă�������");
		String fullname = scan.next();
	   	System.out.println("���Ȃ���" + fullname + "�ł�");
	}
}
