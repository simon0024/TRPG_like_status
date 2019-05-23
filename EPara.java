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
        Map.put(EPara.Str, "‹Ø—Í");
        Map.put(EPara.Vit, "‘Ï‹v—Í");
        Map.put(EPara.Dex, "•q·«");
        Map.put(EPara.Mag, "–‚—Í");
        Map.put(EPara.Chr, "–£—Í");
        Map.put(EPara.Luc, "‰^");
    }

    public static String getEParaMap(EPara para){
        return Map.get(para);
    }
    
    public static int getEParaLength() {
        return EPara.values().length;
    }

}
