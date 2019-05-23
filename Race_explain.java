package test;


public class Race_explain {
	//ERaceから日本語種族名を取得してforですべて表示
	public static void printData(){
    	System.out.println("あなたの種族を数字で入力してください");
    	int i = 1;
    	   for(@SuppressWarnings("unused") ERace race : ERace.values()) {
               System.out.println(i + "：" + ERace.lookup(i));          
               i++;
         }
	}
	//§入力した整数値でERaceから日本語種族名を逆引きして表示
	public static String printName(int number){
		String Racename = ERace.lookup(number);
		System.out.println("本当に" + Racename + "でよろしいですか？（Yesなら1、Noなら0を入力してください）");
		return Racename;
	}//endofprintName

	//racenameを受け取ってEParaに保存したステータス値をforで表示
	public static void printExplain(String racename, int scannum){
		System.out.println("あなたは" + racename + "の冒険者です");
		//ERaceから整数値で逆引き
   		ERace c = ERace.getByNum(scannum);
   		//§選択された種族の固有配列を取得
   		int[] a = c.getArray();
   		int i = 0;
   		//forで順番にステータスを表示
 	   for(EPara para : EPara.values()) {
           System.out.print(para + "：" + Scan_para.getStatusMap(para) + " + ");
           //§配列に格納した種族固有値をループ回数で順番に表示
           System.out.print(a[i]);
           //§合計を表示
           int last_para = Scan_para.getStatusMap(para) + a[i];
           System.out.println(" = " + "( " + last_para + " )");
           i++;
 	   }
		System.out.println("あなたは生まれ故郷を旅立ち、冒険に出かけました");
	}//endoofprinttExplain

//public static String getRacename() {
//	return Racename;
//}

}
