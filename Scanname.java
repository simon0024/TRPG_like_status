package test;
import java.util.Scanner;

public class Scanname {
	private static Scanner scan;
	public static void main(String[] args){
		scan = new Scanner(System.in);
		System.out.println("あなたの名前を入力してください");
		String fullname = scan.next();
	   	System.out.println("あなたは" + fullname + "です");
	}
}
