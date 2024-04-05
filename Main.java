public class Main {

    public static void main(String[] args) {
        ShippingCompany sc = new ShippingCompany("RELIABLE-MOVING");
        Transport t1 = new GroundTransportation("FRTULP");
        Transport t2 = new AirTransportation("Ship1", 45);
        Transport t3 = new AirTransportation("Ship2", 52);
        Transport t4 = new Lorry(23,5, "PNMERT");
        Transport t5 = new Van(31,"VCBMPL");

        sc.add(t1);
        sc.add(t2);
        sc.add(t3);
        sc.add(t4);
        sc.add(t5);

        System.out.println(sc.toString());
    }
}
