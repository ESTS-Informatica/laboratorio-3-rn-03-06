import java.util.ArrayList;
import java.util.HashSet;

public class ShippingCompany extends HashSet<Transport>{

    private String name;
    private ArrayList<Transport> inService;

    public ShippingCompany(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Transport> getInService(){
        return this.inService;
    }

    public void addInService(Transport transport){
        this.inService.add(transport);
    }

    public String toString(){
        String string = "";
        for(Transport i : this){
            System.out.println(i.toString());
            string.concat(i.toString());
        }
        return string;
    }
}
