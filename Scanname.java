package test;
import java.util.Scanner;

public class Scanname {
	private static Scanner scan;
	public static void main(String[] args){
		scan = new Scanner(System.in);
		System.out.println("‚ ‚È‚½‚Ì–¼‘O‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		String fullname = scan.next();
	   	System.out.println("‚ ‚È‚½‚Í" + fullname + "‚Å‚·");
	}
}
