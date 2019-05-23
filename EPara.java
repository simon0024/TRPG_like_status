package test;
import java.util.EnumMap;

public enum EPara {
	Str,
	Vit,
	Dex,
	Mag,
	Chr,
	Luc,
	;


    private final static EnumMap<EPara, String> Map;

    static{
        Map = new EnumMap<EPara, String>(EPara.class);
        Map.put(EPara.Str, "�ؗ�");
        Map.put(EPara.Vit, "�ϋv��");
        Map.put(EPara.Dex, "�q����");
        Map.put(EPara.Mag, "����");
        Map.put(EPara.Chr, "����");
        Map.put(EPara.Luc, "�^");
    }

    public static String getEParaMap(EPara para){
        return Map.get(para);
    }
    
    public static int getEParaLength() {
        return EPara.values().length;
    }

}
