package enumeration;

public class BagSizeMain {

    public static void main(String[] args) {
        BagSize bagSize = BagSize.MEDIUM;

        System.out.println(bagSize.name() + " bag is");
        System.out.println(bagSize.getPrice() + "$");
    }

}
