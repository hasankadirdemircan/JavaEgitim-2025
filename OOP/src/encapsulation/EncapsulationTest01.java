package encapsulation;

public class EncapsulationTest01 {

    public static void main(String[] args) {
        //Constructor ile oluşturduğumuz için Set'leri silebilirsin.
        Person person = new Person("kadir", "demircan", 10, 0);

        Person person1 = new Person();
        person1.setAge(10);
        person1.setFirstName("kadir");
        person1.setLastName("demircan");
        person1.setSalary(1);

        System.out.println("person");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.getSalary());

        System.out.println();
        System.out.println("person1");
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());
        System.out.println(person1.getSalary());
    }
}
