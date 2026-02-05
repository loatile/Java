import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        perimeter pr = new perimeter();
        volume v = new volume();
        undergoundSA usa = new undergoundSA();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter avgerage depth: ");
        double avgDepth = sc.nextDouble();

        double LWSum = width + length;
        double LWProd = width*length;

// Perimter argument 

        pr.LWSum = LWSum;

// Volume argument

        v.LWProd = LWProd;
        v.avgDepth = avgDepth;

//Underground surface area argument

        usa.LWProd = LWProd;
        usa.LWSum = LWSum;
        usa.avgDepth = avgDepth;

        System.out.println(pr.CalcPerimeter());
        System.out.println(v.CalcVolume());
        System.out.println(usa.CalcUndergroundSA());
    }
}