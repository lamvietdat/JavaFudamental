package suatsac2;

public class MotorVehicle extends Vehicle{
    private String fueltype;

    public MotorVehicle(String brand, int year, String fueltype) {
        super(brand, year);
        this.fueltype = fueltype;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Fuel Type: "+fueltype);
    }
}
