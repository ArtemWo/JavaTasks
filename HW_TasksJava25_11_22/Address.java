package HW_TasksJava.HW_TasksJava25_11_22;

public class Address {
    private String address;
    private  int numHaus;

    public Address(String address, int numHaus) {
        this.address = address;
        this.numHaus = numHaus;
    }

    public String getAddress() {
        return address;
    }

    public int getNumHaus() {
        return numHaus;
    }

    @Override
    public String toString() {
        return "| Address = " +   address +
                "  numHaus = " + numHaus+" | ";
    }
}
