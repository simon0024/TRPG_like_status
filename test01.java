package test;

public class test01 {
	public static void main(String[] args){
		//���푰�ꗗ��\��
			Race_explain.printData();
		//�����͂����푰number���i�[
			int scannum = Scanrace.scanRace();
		//�����O�����
  			Scanname.main(args);
  		//���p�����[�^��\��
  		   	Scan_para.printPara();
  		//�����͂����푰number������{��푰�����擾���ĕ\��
  		   	String racename = ERace.lookup(scannum);
		   	Race_explain.printExplain(racename, scannum);
		   	System.out.println("�����I��");
		   	//TODO
		   	//1_Scan_para�̊e���\�b�h�ɕϐ������Đ�������[��]
		   		//1.1_�e���\�b�h�ŗL�̕ϐ���enum���X�g���瓮�I�ɐ�������[��]
		   		//1.2_map�Ɋi�[����String[]�����o����paraname��\������[��]
		   		//1.3_�erace�̃��\�b�h��enum�̃��\�b�h�Ŏ�������[��]
		   	//2_number��getter��setter�������print����[��]
		   		//2.1_Enum�ɐ��l����������number�̓��͂���t��������Racename���擾[��]
		   	//3_���͂����\�͒l���}�b�v�ɕۑ�����[��]
		   		//3.1���͂����\�͒l�Ǝ푰�l���������ĕ\������[��]
		   	//4_���̗͂�O������try�ň͂�
		   	//5_fullname���\�b�h�����P
		   	//6_ERace�̒������擾���āAscanrace�̏����ϐ��ɂ���[��]
		   		//6.1_EPara�̒����̌v�Z���N���X�ɂ���
		   		//6.1EPara�̒������擾���āA���b�Z�[�W�Ɛ��l��ϐ��ɒu��������
		   	//6_�R�����g��ǉ�[��]
		   	//7_�X�e�[�^�X�\�����킩��₷������
    	}

    	}




    
