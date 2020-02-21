/**
 * Aircraft
 */
public class Aircraft {

    private String name;            //aircraft name
    private int passengers;         //number of passengers
    private int crewSize;           //crew size
    private int approachSpeed;      //knots
    private int wingSpan;           //meters
    private double fuelCapacity;    //litres
    private double fuelBurnRate;    //litres per hour

    public Aircraft(String name, int passengers, int crewSize, int approachSpeed, int wingSpan, double fuelCapacity, double fuelBurnRate){
        this.name = name;
        this.passengers = passengers;
        this.crewSize = crewSize;
        this.approachSpeed = approachSpeed;
        this.wingSpan = wingSpan;
        this.fuelCapacity = fuelCapacity;
        this.fuelBurnRate = fuelBurnRate;
    
    }

    public String getName(){
        return name;
    }

    public int getPassengers(){
        return passengers;
    }

    public int getCrewSize(){
        return crewSize;
    }

    public int getApproachSpeed(){
        return approachSpeed;
    }

    public int getWingSpan(){
        return wingSpan;
    }

    public double getFuelCapacity(){
        return fuelCapacity;
    }

    public double getFuelBurnRate(){
        return fuelBurnRate;
    }

    public void designGroup(){
        System.out.println(name);
        if(wingSpan < 15){
            System.out.println("Airplane Design Group: A");
        }else if(wingSpan >= 15 & wingSpan < 24){
            System.out.println("Airplane Design Group: B");
        }else if(wingSpan >= 24 & wingSpan < 36){
            System.out.println("Airplane Design Group: C");
        }else if(wingSpan >= 36 & wingSpan < 52){
            System.out.println("Airplane Design Group: D");
        }else if(wingSpan >= 52 & wingSpan < 65){
            System.out.println("Airplane Design Group: E");
        }else if(wingSpan >= 65 & wingSpan <= 80){
            System.out.println("Airplane Design Group: F");
        }
    }

    public void approachCategory(){
        if(approachSpeed <= 90){
            System.out.println("Approach Category (FAA): A");
        }else if(approachSpeed > 90 & approachSpeed < 120){
            System.out.println("Approach Category (FAA): B");
        }else if(approachSpeed >= 120 & approachSpeed < 140){
            System.out.println("Approach Category (FAA): C");
        }else if(approachSpeed >= 140 & approachSpeed < 165){
            System.out.println("Approach Category (FAA): C");
        }else if(approachSpeed >= 165){
            System.out.println("Approach Category (FAA): E");
        }
    }

    public void range(){
        System.out.println("Maximum range in hours: " + Math.round(fuelCapacity/fuelBurnRate));
    }

    public void maxSouls(){
        System.out.println("Maximum souls on-board: " + (passengers + crewSize));
    }

}
