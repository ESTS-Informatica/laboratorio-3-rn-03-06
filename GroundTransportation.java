public class GroundTransportation extends Transport{

    private String licensePlate;
    private static final double FEES = 3.0;

    public GroundTransportation(String licensePlate){

        this.licensePlate = licensePlate;
        this.setFees(FEES);
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    @Override
    public String getTransportType(){
        return "Transporte Terrestre";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("%15s: %s\n", "Matrícula", this.licensePlate));

        return super.toString()+sb.toString();
    }
}
