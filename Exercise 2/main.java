import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class main{

    static String memebers[] = new String[10];
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter member names: ");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("members.txt"));
            for(int i = 0; i < memebers.length; i++){
                memebers[i] = sc.nextLine();
                bw.write(memebers[i]);
                bw.write("\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
