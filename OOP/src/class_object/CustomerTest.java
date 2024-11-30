package class_object;

public class CustomerTest {

    public static void main(String[] args) {

        int number = 5;
        Customer hasan = new Customer();
        hasan.firstName = "hasan kadir";
        hasan.lastName = "demircan";
        hasan.address = "Ankara";
        hasan.age = 30;
        hasan.id = "1232132132323";
        hasan.bankNumber = "995959595592";
        hasan.salary = 50000;

        Customer ayse = new Customer();
        ayse.firstName = "ayse";
        ayse.lastName = "asdsadsad";
        ayse.address = "Istanbul";
        ayse.age = 29;
        ayse.id = "1232323232323";
        ayse.bankNumber = "7777777777442";
        ayse.salary = 100000;

        System.out.println(ayse.firstName);
        System.out.println(ayse.address);
        System.out.println(ayse.bankNumber);
        System.out.println(ayse.getCreditLimit());

        System.out.println(hasan.firstName);
        System.out.println(hasan.address);
        System.out.println(hasan.bankNumber);
        System.out.println(hasan.getCreditLimit());

    }
}
