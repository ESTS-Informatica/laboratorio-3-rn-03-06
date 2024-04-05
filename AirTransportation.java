public class AirTransportation extends Transport{

    private String name;
    private int numberOfContainers;
    private static final double Fees = 4.0;

    public AirTransportation(String name, int numberOfContainers){

        this.name = name;
        this.numberOfContainers = numberOfContainers;
        this.setFees(Fees);
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

}
