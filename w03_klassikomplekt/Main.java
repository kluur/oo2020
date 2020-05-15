import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Lamp lamp1 = new Lamp("lamp1");
        Lamp lamp2 = new Lamp("lamp2");

        LampList list = new LampList();
        list.add(lamp1);
        print(list);
        list.add(lamp2);
        print(list);

        list.remove(0);
        print(list);

        list.clear();
        print(list);
        
    }

    private static void print(LampList list){
        list.forEach(lamp -> System.out.println(lamp.getNimi()));
    }

    private final static class Lamp{
        private final String nimi;

        public Lamp(String nimi){
            this.nimi = nimi;
        }

        private String getNimi(){
            return nimi;
        }
    }

    private static class LampList extends ArrayList<Lamp>{

    }
    
}