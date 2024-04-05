public class GroundTransportation extends Transport{

    private String licensePlate;
    private static final double Fees = 3.0;

    public GroundTransportation(String licensePlate){

        this.licensePlate = licensePlate;
        this.setFees(Fees);
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

}
