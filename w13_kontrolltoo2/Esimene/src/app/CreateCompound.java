package app;

public class CreateCompound implements Compound{

    private String name;
    private double molecularMass;
  

    public CreateCompound(String name, double molecularMass) {
        this.name = name;
        this.molecularMass = molecularMass;
    }

    @Override
    public String getName(Ion ion1, Ion ion2) {
        
        if(ion1.getCharge() + ion2.getCharge() == 0) {
            if(ion1.getCharge() > 0) {
                name = ion1.getName() + ion2.getName();
            }
        } else {
            name = ion2.getName() + ion1.getName();
        }
        return name;
    }

    @Override
    public double getMolecularMass(Ion ion1, Ion ion2) {
        if(ion1.getCharge() + ion2.getCharge() == 0) {
            molecularMass = ion1.getAtomicMass() + ion2.getAtomicMass();
        }
        return molecularMass;
    }


    
}