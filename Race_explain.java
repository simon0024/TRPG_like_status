package test;


public class Race_explain {
	//ERace������{��푰�����擾����for�ł��ׂĕ\��
	public static void printData(){
    	System.out.println("���Ȃ��̎푰�𐔎��œ��͂��Ă�������");
    	int i = 1;
    	   for(@SuppressWarnings("unused") ERace race : ERace.values()) {
               System.out.println(i + "�F" + ERace.lookup(i));          
               i++;
         }
	}
	//�����͂��������l��ERace������{��푰�����t�������ĕ\��
	public static String printName(int number){
		String Racename = ERace.lookup(number);
		System.out.println("�{����" + Racename + "�ł�낵���ł����H�iYes�Ȃ�1�ANo�Ȃ�0����͂��Ă��������j");
		return Racename;
	}//endofprintName

	//racename���󂯎����EPara�ɕۑ������X�e�[�^�X�l��for�ŕ\��
	public static void printExplain(String racename, int scannum){
		System.out.println("���Ȃ���" + racename + "�̖`���҂ł�");
		//ERace���琮���l�ŋt����
   		ERace c = ERace.getByNum(scannum);
   		//���I�����ꂽ�푰�̌ŗL�z����擾
   		int[] a = c.getArray();
   		int i = 0;
   		//for�ŏ��ԂɃX�e�[�^�X��\��
 	   for(EPara para : EPara.values()) {
           System.out.print(para + "�F" + Scan_para.getStatusMap(para) + " + ");
           //���z��Ɋi�[�����푰�ŗL�l�����[�v�񐔂ŏ��Ԃɕ\��
           System.out.print(a[i]);
           //�����v��\��
           int last_para = Scan_para.getStatusMap(para) + a[i];
           System.out.println(" = " + "( " + last_para + " )");
           i++;
 	   }
		System.out.println("���Ȃ��͐��܂�̋��𗷗����A�`���ɏo�����܂���");
	}//endoofprinttExplain

//public static String getRacename() {
//	return Racename;
//}

}
