import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Divide {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("jagasis.txt"));
        int baskets = Integer.parseInt(reader.readLine());
        int apples = 0;
        int basketCnt = 0;
        int appleCnt = 0;

        for(int i = 0; i < baskets; i++){
            apples += Integer.parseInt(reader.readLine());
        }
        reader.close();

        BufferedReader newReader = new BufferedReader(new FileReader("jagasis.txt"));
        int nextApples = Integer.parseInt(newReader.readLine());
        nextApples = Integer.parseInt(newReader.readLine());;

        while(appleCnt < apples/2 && appleCnt + nextApples < apples){
            appleCnt += nextApples;
            basketCnt++;
            nextApples = Integer.parseInt(newReader.readLine());;
        }
        newReader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("jagaval.txt"));
        writer.write(String.valueOf(basketCnt));
        writer.close();
    }
}