package test;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Scan_para {
	private static Scanner scan;
	static int para_sum = 20;
	private static final Map<EPara, Integer> map = new HashMap<>();
	public static void main(String[] args){
	}

public static void printPara() {
   	System.out.println("�\�͒l������U��܂�");
   	//EPara�̒������擾���Ċe�X�e�[�^�X��4�܂Ŋ���U���悤�ő�l������
    int para_length = EPara.getEParaLength();
    int para_max = para_length * 4;
    //

   	   	while(para_sum <= para_max) {
   	   		para_sum = para_max;
   	   		//EPara�̓��{��v�f�����擾���ĕ\��
   	   		int i = 0;
   	   		for(EPara p : EPara.values()){
   	   		String pp = EPara.getEParaMap(p);
   	   		System.out.print(pp);
   	   		if(i < para_length - 1) {
   	   		System.out.print("�A");
   	   		i++;
   	   		}
   	   		else if(i == para_length) {
   	   			break;
   	   		}
   	   		}
   	   		//EPara��length����X�e�[�^�X������̍ő�l���v�Z���ĕ\��
   	System.out.println("��"
   			+ para_length
   			+ "�̔\�͒l�̍��v��"
   			+ para_max
   			+ "�ɂȂ�悤����U���Ă�������");
   		int single_para_max = para_max - (para_length - 1);
   		
   	   	//EPara������o�����e�X�e�[�^�X���Ǝc�萔�l�����Ԃ�scanpara()�ɑ�����ĕ\��
   		for(EPara p : EPara.values()) {
   		String paraname = EPara.getEParaMap(p);
   	   	System.out.println(paraname + "�����肵�Ă��������i�ő�l"
   	   			+ single_para_max
   	   			+ "�j");
   		ScanAllpara.scanPara(paraname, para_sum);
   		//���e�X�e�[�^�X���Ɠ��͂����X�e�[�^�X�l��map�Ɋi�[
   		map.put(p, ScanAllpara.getParadiv());
   		//���c�荇�v������͒l�������čĒ�`
   		calcParasum();
   		}
   		//���c�肪���傤��0�ɂȂ����烋�[�v�𔲂���
   		if(para_sum == 0) {
   		//���ŏI�m�F
   		promptPara();
   			break;
   			}else if(para_sum  < 0) {
   			continue;
   			}

   	   	}
}//endofprintPara

public static void calcParasum() {
		para_sum = para_sum - ScanAllpara.getParadiv();
}

public static Integer getStatusMap(EPara s) {
	return map.get(s);
}

public static void promptPara(){
	scan = new Scanner(System.in);
		System.out.println("���͂��������܂����B���̔\�͒l�ł�낵���ł����H(1or0)");
		while(true) {
				int yn = scan.nextInt();
				if(yn == 1) {
					break;
				}else if(yn == 0) {
					printPara();
					break;
				}else if(yn != 1 && yn != 0) {
					System.out.println("1/0�œ��͂��Ă�������");
					continue;
				}
			}
	}//endofpromptPara
}
