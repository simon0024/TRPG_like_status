package test;
import java.util.Scanner;


public class Scanrace {
	public static void main(String[] args){
	}

	private static Scanner scan;
	public static int scanRace(){
	scan = new Scanner(System.in);
	int number;		//scan入力
	int racelength;	//ERaceの長さ
	 outloop: while(true) {
  	number = scan.nextInt();
  	//ERaceの長さを取得して上限までを受け付ける
 	racelength = ERace.getERaceLength();
  	if(number <= racelength && number >= 1) {
  		//§入力した整数値から種族の説明を取得して表示
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
  					System.out.println("1か0で入力してください");
  					continue;
  				}
  						}
  	}else if(number <= racelength ^ number >= 1) {
  		System.out.println("1〜"
  				+ racelength
  				+ "の数字を入力してください");
  		continue;
  		}
  	
	}return number;
	}

	
}
