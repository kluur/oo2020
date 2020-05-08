package app;

public class IonInfo implements Ion {

    private String name;
    private double atomicMass;
    private int charge;

    public IonInfo(String name, double atomicMass, int charge) {
        this.name = name;
        this.atomicMass = atomicMass;
        this.charge = charge;
    }

    @Override
    public String getName() {
        return name;

    }

    @Override
    public double getAtomicMass() {
        return atomicMass;

    }

    @Override
    public int getCharge() {
        return charge;

    }
}