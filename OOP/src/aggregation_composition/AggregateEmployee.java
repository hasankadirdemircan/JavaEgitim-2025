package aggregation_composition;

public class AggregateEmployee {
    private int id;
    private String name;
    private Address address;

    public AggregateEmployee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "AggregateEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
