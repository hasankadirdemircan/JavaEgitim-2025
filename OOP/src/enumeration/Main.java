package enumeration;

public class Main {
    public static void main(String[] args) {
        Size pizzaSize = Size.SMALL;

        switch (pizzaSize) {
            case SMALL -> System.out.println("I ordered a small pizza.");
            case MEDIUM -> System.out.println("I ordered a medium pizza.");
            case LARGE -> System.out.println("I ordered a large pizza.");
            case EXTRA_LARGE -> System.out.println("I ordered a extra large pizza.");
        }

        System.out.println(Size.SMALL.ordinal());
        System.out.println(Size.MEDIUM.ordinal());
        System.out.println(Size.LARGE.ordinal());
        System.out.println(Size.EXTRA_LARGE.ordinal());

        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM.toString());
        System.out.println(Size.LARGE.toString());
        System.out.println(Size.EXTRA_LARGE);

        System.out.println(Size.LARGE.name());

        System.out.println(Size.valueOf("MEDIUM"));

        System.out.println(Size.LARGE.name().equals("LARGE"));
        System.out.println(Size.LARGE.equals("LARGE"));

        System.out.println("values---");
        for(Size size : Size.values()) {
            System.out.println(size.name());
        }
/*
old version
        switch (pizzaSize) {
            case SMALL:
                System.out.println("I ordered a small pizza.");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium pizza.");
                break;
            case LARGE:
                System.out.println("I ordered a large pizza.");
                break;
            case EXTRA_LARGE:
                System.out.println("I ordered a extra large pizza.");
                break;
        }*/
    }
}
