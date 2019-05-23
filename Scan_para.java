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
   	System.out.println("能力値を割り振ります");
   	//EParaの長さを取得して各ステータスに4まで割り振れるよう最大値を決定
    int para_length = EPara.getEParaLength();
    int para_max = para_length * 4;
    //

   	   	while(para_sum <= para_max) {
   	   		para_sum = para_max;
   	   		//EParaの日本語要素名を取得して表示
   	   		int i = 0;
   	   		for(EPara p : EPara.values()){
   	   		String pp = EPara.getEParaMap(p);
   	   		System.out.print(pp);
   	   		if(i < para_length - 1) {
   	   		System.out.print("、");
   	   		i++;
   	   		}
   	   		else if(i == para_length) {
   	   			break;
   	   		}
   	   		}
   	   		//EParaのlengthからステータス当たりの最大値を計算して表示
   	System.out.println("の"
   			+ para_length
   			+ "つの能力値の合計が"
   			+ para_max
   			+ "になるよう割り振ってください");
   		int single_para_max = para_max - (para_length - 1);
   		
   	   	//EParaから取り出した各ステータス名と残り数値を順番にscanpara()に代入して表示
   		for(EPara p : EPara.values()) {
   		String paraname = EPara.getEParaMap(p);
   	   	System.out.println(paraname + "を決定してください（最大値"
   	   			+ single_para_max
   	   			+ "）");
   		ScanAllpara.scanPara(paraname, para_sum);
   		//§各ステータス名と入力したステータス値をmapに格納
   		map.put(p, ScanAllpara.getParadiv());
   		//§残り合計から入力値を引いて再定義
   		calcParasum();
   		}
   		//§残りがちょうど0になったらループを抜ける
   		if(para_sum == 0) {
   		//§最終確認
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
		System.out.println("入力が完了しました。この能力値でよろしいですか？(1or0)");
		while(true) {
				int yn = scan.nextInt();
				if(yn == 1) {
					break;
				}else if(yn == 0) {
					printPara();
					break;
				}else if(yn != 1 && yn != 0) {
					System.out.println("1/0で入力してください");
					continue;
				}
			}
	}//endofpromptPara
}
