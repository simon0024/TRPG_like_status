package test;
import java.util.Scanner;


public class Scanrace {
	public static void main(String[] args){
	}

	private static Scanner scan;
	public static int scanRace(){
	scan = new Scanner(System.in);
	int number;		//scan����
	int racelength;	//ERace�̒���
	 outloop: while(true) {
  	number = scan.nextInt();
  	//ERace�̒������擾���ď���܂ł��󂯕t����
 	racelength = ERace.getERaceLength();
  	if(number <= racelength && number >= 1) {
  		//�����͂��������l����푰�̐������擾���ĕ\��
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
  					System.out.println("1��0�œ��͂��Ă�������");
  					continue;
  				}
  						}
  	}else if(number <= racelength ^ number >= 1) {
  		System.out.println("1�`"
  				+ racelength
  				+ "�̐�������͂��Ă�������");
  		continue;
  		}
  	
	}return number;
	}

	
}
