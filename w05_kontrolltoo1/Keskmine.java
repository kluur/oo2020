import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
 * Keskmine
 */
public class Keskmine {

    //funktsioon, mille sisendiks on kahe kilomeetripikkuse lõigu
    //kiirused (km/h), väljundiks nende läbimise keskmine kiirus kahe koma kohaga.

    public static double keskmineKiirus(double x, double y) {
        double keskmine = (x + y)/2;
        return Math.round(keskmine*100.0)/100.0;
    }

    //funktsioon, millele antakse kilomeetripikkuste lõikude kiirused (km/h) kogumina,
    //väljundiks kogu teekonna keskmine kiirus kahe koma kohaga.

    public static double keskmineKiirus2(double[] kiirused) {
        double kokku = 0.0;
        double keskmine = 0.0; 
        for (int i = 0; i < kiirused.length; i++) {
            kokku += kiirused[i];
            keskmine = kokku / kiirused.length;
        }
		return Math.round(keskmine*100.0)/100.0;
    }

    //meetod loeb failist kiirused.txt kilomeetripikkuse lõigu keskmised kiirused (km/h),
    //arvutab nende põhjal keskmise kiiruse kahe koma kohaga ja kirjutab tulemuse faili keskmine_kiirus.txt.

    public static void keskmineKiirus3() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("kiirused.txt"));
        List<String> lines = new ArrayList<>();
        String line = reader.readLine();
        while(line != null){
            lines.add(line);
            line = reader.readLine();
        }
        reader.close();

        double kokku = 0.0;
        double keskmine = 0.0;
        for(String string : lines){
            kokku += Double.parseDouble(string);
        }
        keskmine = kokku / lines.size();
        BufferedWriter writer = new BufferedWriter(new FileWriter("keskmine_kiirus.txt"));
        writer.write("Keskmine kiirus on: " + Double.toString(Math.round(keskmine*100.0)/100.0) + "km/h");
        writer.close();
    }

    //kutsun kõik kolm meetodit esile.
    public static void main(String[] args) throws IOException {
        System.out.println("Esimese ülesande keskmine kiirus: " + keskmineKiirus(12.0, 16.5) + "km/h");
        double[] kiirused = {4.4, 6.3, 8.9, 10.1};
        System.out.println("Teise ülesande keskmine kiirus: " + keskmineKiirus2(kiirused) + "km/h");
        keskmineKiirus3();
    }
}