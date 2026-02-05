public class volume{
    static double LWProd;
    static double avgDepth;
    static double volume = 0;

    static double CalcVolume(){
        volume = LWProd*avgDepth;
        return  volume;
    }
}