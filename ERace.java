package test;
import java.util.HashMap;
import java.util.Map;

public enum ERace{
        Tall(1, "トールマン(人間)"){
        public String printRace() {
			System.out.println("トールマンは北方諸国で一般的な種族です。");
			System.out.println("そこそこの筋力と敏捷性とタフネスを併せ持ちますが、"
			+ "そのどれにも特化していません。");
			System.out.println("また平均的な視力と魔法への耐性を持ちます。");
			return " ";
        }

        public int[] getArray() {
    		 //arraysの総数*2のボーナスを得る
    		 int[] tall_array = {2, 2, 2, 2, 2, 2};
    		 return tall_array;
    	}
        },
        Elf(2, "エルフ"){
        public String printRace() {
        	System.out.println("エルフは非常に長い寿命を持ち、魔法の扱いに長けた種族です。");
        	System.out.println("東方に自分たちだけの国を作っており、短命種とはほとんどかかわりを持ちません。");
        	System.out.println("魔法への高い抵抗力を備え、平均的な筋力とやや高い敏捷、やや低いタフネスを持ちます。");
        	System.out.println("また森の中では視力にボーナスを得ます。");
			return " ";
        		}

        public int[] getArray() {
    		 //arraysの総数*2のボーナスを得る
    		 int[] tall_array = {1, 1, 2, 4, 2, 2};
    		 return tall_array;
    	}
        	},
        Dwarf(3, "ドワーフ"){
            public String printRace() {
            	System.out.println("ドワーフは、冶金や採掘を生業とする種族です。");
            	System.out.println("頑丈な体躯とやや低い身長を持ち、高い筋力を兼ね備えますが、人に好かれやすい性質であはりませｎ");
            	System.out.println("暗闇への強い耐性をもち、洞窟の中で視力にボーナスを得ます。");
    			return " ";
            	}
            public int[] getArray() {
       		 //arraysの総数*2のボーナスを得る
       		 int[] tall_array = {3, 3, 2, 1, 1, 2};
       		 return tall_array;
       	}
            },
        Halffoot(4, "ハーフフット"){
            public String printRace() {
            	System.out.println("ハーフフットは人の子供のような外見をした種族です");
            	System.out.println("その小さな体躯を生かした敏捷性と警戒されにくい外見を持ちます。");
            	System.out.println("罠の知識をもち、封じられた扉を開けることができます。また確率で罠を無効化します。");
    			return " ";
            	}
            public int[] getArray() {
       		 //arraysの総数*2+1のボーナスを得る
       		 int[] tall_array = {1, 1, 4, 2, 2, 2};
       		 return tall_array;
       	}
            },
        Beastman(5, "獣人"){
            	public String printRace() {
            	System.out.println("獣人は人間と獣を魔術的に合成させた種族で、様々な種類が存在します");
            	System.out.println("鋭敏な感覚と高い敏捷性を持ちますが、反面魔術への適性は高くありません");
            	System.out.println("暗闇への耐性と、回避の術を持っていますが、気まぐれで単独行動を好みます。");
    			return " ";
            	}
                public int[] getArray() {
           		 //arraysの総数*2+1のボーナスを得る
           		 int[] tall_array = {1, 2, 3, 2, 1, 3};
           		 return tall_array;
           	}
        	},
        Sahuagin(6, "サフアグン"){
            public String printRace() {
            	System.out.println("サフアグンは、海の邪神を崇める一族です");
            	System.out.println("筋力と魔力がやや高く、やや低い魅力を持ちます");
            	System.out.println("水中での移動にペナルティを受けず、暗闇にも耐性を持ちます");
    			return " ";
            	}

            public int[] getArray() {
       		 //arraysの総数*2+1のボーナスを得る
       		 int[] tall_array = {3, 2, 2, 3, 1, 1};
       		 return tall_array;
       	}
            },
        Warforged(7, "ウォーフォージド"){
                public String printRace() {
                	System.out.println("ウォーフォージドは、最終戦争のために造られた意志を持つ兵器です");
                	System.out.println("非常に高い筋力と耐久力を持ちますが、威圧感を与える外見のため、警戒されることがあります");
                	System.out.println("彼らの皮膚は金属でできており、弱い攻撃を無効化します。代わりに鎧を装備できません。また、生物を対象とする罠・魔法の効果を受けません");
        			return " ";
                	}

                public int[] getArray() {
           		 //arraysの総数*2+1のボーナスを得る
           		 int[] tall_array = {4, 4, 1, 1, 1, 2};
           		 return tall_array;
           	}
                },
    ;
	//holderクラスでMapを生成
        private static final class Holder {
    		private static final Map<Integer, String> lookupMap = new HashMap<>();

    	}
//1
        private int Racenum;
        public int getCode() { return Racenum;}
        
    //§コンストラクタでMapに各要素の定数と日本語種族名をMapに格納
    	private ERace(int Racenum, String... args) {
    		for (String alias : args) {
    			Holder.lookupMap.put(Racenum, alias);
    		}
        	this.Racenum = Racenum;
    	}
    	
    	//§入力した整数値から種族名を逆引き
        public static ERace getByNum(int Racenum) {
        	ERace[] races = values();
        	for(ERace num : races) {
        		if(num.Racenum == Racenum)return num;
        	}
        	        return null;
        }


    //§入力した整数値をもとに日本語種族名を取得
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
    //§抽象メソッドの記述
    	public abstract String printRace();
    	public abstract int[] getArray();
}
    