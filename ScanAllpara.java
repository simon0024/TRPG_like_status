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
		//para��0�`16�Ȃ�c�荇�v�l��������ă����o�ϐ��Ɋi�[
		if(para <= single_para_max && para > 0) {
	  	para_div = para_sum - para;
	  	//EPara����󂯎�����X�e�[�^�X���Ɠ��͒l�A�c�荇�v�l��\��
	  	System.out.println(para_name + para + "�ł�" + " �i�c��" + para_div + "�j");
	  	setPara(para);
	  	return para_div;
		}else if(para > single_para_max) {
			System.out.println(para_name + "�̍ő�l��"
					+ single_para_max
					+ "�ł�");
		 }else if(para == 0) {
			 System.out.println("0�͓��͂ł��܂���");
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
