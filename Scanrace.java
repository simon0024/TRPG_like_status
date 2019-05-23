package test;
import java.util.Scanner;


public class Scanrace {
	public static void main(String[] args){
	}

	private static Scanner scan;
	public static int scanRace(){
	scan = new Scanner(System.in);
	int number;		//scan“ü—Í
	int racelength;	//ERace‚Ì’·‚³
	 outloop: while(true) {
  	number = scan.nextInt();
  	//ERace‚Ì’·‚³‚ğæ“¾‚µ‚ÄãŒÀ‚Ü‚Å‚ğó‚¯•t‚¯‚é
 	racelength = ERace.getERaceLength();
  	if(number <= racelength && number >= 1) {
  		//˜“ü—Í‚µ‚½®”’l‚©‚çí‘°‚Ìà–¾‚ğæ“¾‚µ‚Ä•\¦
   		ERace c = ERace.getByNum(number);
   		System.out.println(c.printRace());
  		test.Race_explain.printName(number);
  			while(true) {
  				int yn = scan.nextInt();
  				if(yn == 1) {
  					break outloop;
  				}else if(yn == 0) {
  					test.Race_explain.printData();
  					continue outloop;
  				}else if(yn != 1 && yn != 0) {
  					System.out.println("1‚©0‚Å“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
  					continue;
  				}
  						}
  	}else if(number <= racelength ^ number >= 1) {
  		System.out.println("1`"
  				+ racelength
  				+ "‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
  		continue;
  		}
  	
	}return number;
	}

	
}
