public class Van extends GroundTransportation{

    private int packages;

    public Van(int packages, String licensePlate){

        super(licensePlate);
        this.packages = packages;
    }

    public int getPackages() {
        return packages;
    }

    public void setPackages(int packages) {
        this.packages = packages;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("%15s: %s\n", "Qt. Pacotes", this.packages));

        return super.toString()+sb.toString();
    }
}
