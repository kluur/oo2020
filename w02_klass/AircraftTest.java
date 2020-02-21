/**
 * AircraftTest
 */
public class AircraftTest {

    public static void main(String[] args) {
        
        Aircraft airbusA380 = new Aircraft("Airbus A380-800", 868, 24, 140, 80, 315292, 16000);
        Aircraft cessna172 = new Aircraft("Cessa 172", 4, 2, 61, 11, 212, 35);
        Aircraft boeing777 = new Aircraft("Boeing 777", 550, 12, 150, 65, 171176, 8300);
        Aircraft saab340 = new Aircraft("Saab 340", 36, 2, 112, 21, 3220, 420);
        cessna172.designGroup();
        cessna172.range();
        cessna172.approachCategory();
        cessna172.maxSouls();
        System.out.println();
        airbusA380.designGroup();
        airbusA380.range();
        airbusA380.approachCategory();
        airbusA380.maxSouls();
        System.out.println();
        boeing777.designGroup();
        boeing777.range();
        boeing777.approachCategory();
        boeing777.maxSouls();
        System.out.println();
        saab340.designGroup();
        saab340.range();
        saab340.approachCategory();
        saab340.maxSouls();
    }
}