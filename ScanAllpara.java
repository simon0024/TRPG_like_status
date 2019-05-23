package test;
import java.util.Scanner;

public class ScanAllpara {
	private static Scanner scan;
	private static int para_div;
	
	
//	ScanAllpara(String para_name, int para_sum){
//	}
	public static int scanPara(String para_name, int para_sum) {
		 scan = new Scanner(System.in);
		 setPara(0);
		while(true) {
		int para = scan.nextInt();
		int para_max = EPara.getEParaLength() * 4;
	    int para_length = EPara.getEParaLength();
   		int single_para_max = para_max - (para_length - 1);
		//paraが0～16なら残り合計値から引いてメンバ変数に格納
		if(para <= single_para_max && para > 0) {
	  	para_div = para_sum - para;
	  	//EParaから受け取ったステータス名と入力値、残り合計値を表示
	  	System.out.println(para_name + para + "です" + " （残り" + para_div + "）");
	  	setPara(para);
	  	return para_div;
		}else if(para > single_para_max) {
			System.out.println(para_name + "の最大値は"
					+ single_para_max
					+ "です");
		 }else if(para == 0) {
			 System.out.println("0は入力できません");
		 }
		}

	}

	public static int getParadiv() {
		return para_div;
	}
	public static void setPara(int para_sum) {
		para_div = para_sum;
	}
	
}
