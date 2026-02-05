public class undergoundSA{
    static double LWProd;
    static double LWSum;
    static double avgDepth;

    static double undergoundSA =0;

    static double CalcUndergroundSA(){
        undergoundSA = 2*LWSum*avgDepth + LWProd;

        return undergoundSA;
    }
}