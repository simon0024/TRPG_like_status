package test;
import java.util.HashMap;
import java.util.Map;

public enum ERace{
        Tall(1, "�g�[���}��(�l��)"){
        public String printRace() {
			System.out.println("�g�[���}���͖k�������ň�ʓI�Ȏ푰�ł��B");
			System.out.println("���������̋ؗ͂ƕq�����ƃ^�t�l�X�𕹂������܂����A"
			+ "���̂ǂ�ɂ��������Ă��܂���B");
			System.out.println("�܂����ϓI�Ȏ��͂Ɩ��@�ւ̑ϐ��������܂��B");
			return " ";
        }

        public int[] getArray() {
    		 //arrays�̑���*2�̃{�[�i�X�𓾂�
    		 int[] tall_array = {2, 2, 2, 2, 2, 2};
    		 return tall_array;
    	}
        },
        Elf(2, "�G���t"){
        public String printRace() {
        	System.out.println("�G���t�͔��ɒ��������������A���@�̈����ɒ������푰�ł��B");
        	System.out.println("�����Ɏ������������̍�������Ă���A�Z����Ƃ͂قƂ�ǂ������������܂���B");
        	System.out.println("���@�ւ̍�����R�͂�����A���ϓI�ȋؗ͂Ƃ�⍂���q���A���Ⴂ�^�t�l�X�������܂��B");
        	System.out.println("�܂��X�̒��ł͎��͂Ƀ{�[�i�X�𓾂܂��B");
			return " ";
        		}

        public int[] getArray() {
    		 //arrays�̑���*2�̃{�[�i�X�𓾂�
    		 int[] tall_array = {1, 1, 2, 4, 2, 2};
    		 return tall_array;
    	}
        	},
        Dwarf(3, "�h���[�t"){
            public String printRace() {
            	System.out.println("�h���[�t�́A�����̌@�𐶋ƂƂ���푰�ł��B");
            	System.out.println("���ȑ̋�Ƃ��Ⴂ�g���������A�����ؗ͂����˔����܂����A�l�ɍD����₷�������ł��͂�܂���");
            	System.out.println("�Èłւ̋����ϐ��������A���A�̒��Ŏ��͂Ƀ{�[�i�X�𓾂܂��B");
    			return " ";
            	}
            public int[] getArray() {
       		 //arrays�̑���*2�̃{�[�i�X�𓾂�
       		 int[] tall_array = {3, 3, 2, 1, 1, 2};
       		 return tall_array;
       	}
            },
        Halffoot(4, "�n�[�t�t�b�g"){
            public String printRace() {
            	System.out.println("�n�[�t�t�b�g�͐l�̎q���̂悤�ȊO���������푰�ł�");
            	System.out.println("���̏����ȑ̋�𐶂������q�����ƌx������ɂ����O���������܂��B");
            	System.out.println("㩂̒m���������A������ꂽ�����J���邱�Ƃ��ł��܂��B�܂��m����㩂𖳌������܂��B");
    			return " ";
            	}
            public int[] getArray() {
       		 //arrays�̑���*2+1�̃{�[�i�X�𓾂�
       		 int[] tall_array = {1, 1, 4, 2, 2, 2};
       		 return tall_array;
       	}
            },
        Beastman(5, "�b�l"){
            	public String printRace() {
            	System.out.println("�b�l�͐l�ԂƏb�𖂏p�I�ɍ����������푰�ŁA�l�X�Ȏ�ނ����݂��܂�");
            	System.out.println("�s�q�Ȋ��o�ƍ����q�����������܂����A���ʖ��p�ւ̓K���͍�������܂���");
            	System.out.println("�Èłւ̑ϐ��ƁA����̏p�������Ă��܂����A�C�܂���ŒP�ƍs�����D�݂܂��B");
    			return " ";
            	}
                public int[] getArray() {
           		 //arrays�̑���*2+1�̃{�[�i�X�𓾂�
           		 int[] tall_array = {1, 2, 3, 2, 1, 3};
           		 return tall_array;
           	}
        	},
        Sahuagin(6, "�T�t�A�O��"){
            public String printRace() {
            	System.out.println("�T�t�A�O���́A�C�̎א_�𐒂߂�ꑰ�ł�");
            	System.out.println("�ؗ͂Ɩ��͂���⍂���A���Ⴂ���͂������܂�");
            	System.out.println("�����ł̈ړ��Ƀy�i���e�B���󂯂��A�Èłɂ��ϐ��������܂�");
    			return " ";
            	}

            public int[] getArray() {
       		 //arrays�̑���*2+1�̃{�[�i�X�𓾂�
       		 int[] tall_array = {3, 2, 2, 3, 1, 1};
       		 return tall_array;
       	}
            },
        Warforged(7, "�E�H�[�t�H�[�W�h"){
                public String printRace() {
                	System.out.println("�E�H�[�t�H�[�W�h�́A�ŏI�푈�̂��߂ɑ���ꂽ�ӎu��������ł�");
                	System.out.println("���ɍ����ؗ͂Ƒϋv�͂������܂����A�Ј�����^����O���̂��߁A�x������邱�Ƃ�����܂�");
                	System.out.println("�ނ�̔畆�͋����łł��Ă���A�ア�U���𖳌������܂��B����ɊZ�𑕔��ł��܂���B�܂��A������ΏۂƂ���㩁E���@�̌��ʂ��󂯂܂���");
        			return " ";
                	}

                public int[] getArray() {
           		 //arrays�̑���*2+1�̃{�[�i�X�𓾂�
           		 int[] tall_array = {4, 4, 1, 1, 1, 2};
           		 return tall_array;
           	}
                },
    ;
	//holder�N���X��Map�𐶐�
        private static final class Holder {
    		private static final Map<Integer, String> lookupMap = new HashMap<>();

    	}
//1
        private int Racenum;
        public int getCode() { return Racenum;}
        
    //���R���X�g���N�^��Map�Ɋe�v�f�̒萔�Ɠ��{��푰����Map�Ɋi�[
    	private ERace(int Racenum, String... args) {
    		for (String alias : args) {
    			Holder.lookupMap.put(Racenum, alias);
    		}
        	this.Racenum = Racenum;
    	}
    	
    	//�����͂��������l����푰�����t����
        public static ERace getByNum(int Racenum) {
        	ERace[] races = values();
        	for(ERace num : races) {
        		if(num.Racenum == Racenum)return num;
        	}
        	        return null;
        }


    //�����͂��������l�����Ƃɓ��{��푰�����擾
    	public static String lookup(int s) {
    		return Holder.lookupMap.get(s);
    	}
//        public ERace getEMap(ERace tall){
//            return ERace.lookupMap.get(tall);
//        }
//        
        public static int getERaceLength() {
            return ERace.values().length;
        }
    //�����ۃ��\�b�h�̋L�q
    	public abstract String printRace();
    	public abstract int[] getArray();
}
    