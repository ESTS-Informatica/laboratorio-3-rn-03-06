public class AirTransportation extends Transport{

    private String name;
    private int numberOfContainers;
    private static final double FEES = 4.0;

    public AirTransportation(String name, int numberOfContainers){

        this.name = name;
        this.numberOfContainers = numberOfContainers;
        this.setFees(FEES);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumberOfContainers(){
        return this.numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }

    @Override
    public String getTransportType(){
        return "Transporte Aereo";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("%15s: %s\n", "Nome", this.name));
        sb.append(String.format("%15s: %s\n", "Qt. Contentores", this.numberOfContainers));

        return super.toString()+sb.toString();
    }
}
