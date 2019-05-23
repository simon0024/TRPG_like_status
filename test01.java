package test;

public class test01 {
	public static void main(String[] args){
		//§種族一覧を表示
			Race_explain.printData();
		//§入力した種族numberを格納
			int scannum = Scanrace.scanRace();
		//§名前を入力
  			Scanname.main(args);
  		//§パラメータを表示
  		   	Scan_para.printPara();
  		//§入力した種族numberから日本語種族名を取得して表示
  		   	String racename = ERace.lookup(scannum);
		   	Race_explain.printExplain(racename, scannum);
		   	System.out.println("処理終了");
		   	//TODO
		   	//1_Scan_paraの各メソッドに変数を入れて生成する[ν]
		   		//1.1_各メソッド固有の変数をenumリストから動的に生成する[ν]
		   		//1.2_mapに格納したString[]を取り出してparanameを表示する[ν]
		   		//1.3_各raceのメソッドをenumのメソッドで実現する[ν]
		   	//2_numberのgetterとsetterを作ってprintする[ν]
		   		//2.1_Enumに数値を持たせてnumberの入力から逆引きしてRacenameを取得[ν]
		   	//3_入力した能力値をマップに保存する[ν]
		   		//3.1入力した能力値と種族値を合成して表示する[ν]
		   	//4_入力の例外処理をtryで囲む
		   	//5_fullnameメソッドを改善
		   	//6_ERaceの長さを取得して、scanraceの上限を変数にする[ν]
		   		//6.1_EParaの長さの計算をクラスにする
		   		//6.1EParaの長さを取得して、メッセージと数値を変数に置き換える
		   	//6_コメントを追加[ν]
		   	//7_ステータス表示をわかりやすくする
    	}

    	}




    
