package generics;


public class GenericClassTest02 {

    public static void main(String[] args) {

        //ODEV: aynı şekilde bir adet Generic class ve method oluşturunuz ve bu class parametre olarak List<T> veriniz. ve datalar ekleyiniz sonra ekranda gösteriniz.
        Box<String> stringBox = new Box<>();
        stringBox.addItem("box1");
        stringBox.addItem("box2");

        System.out.println(stringBox.getItem());

        Box<Integer> integerBox = new Box<>();
        integerBox.addItem(5);
        System.out.println(integerBox.getItem());
    }
}
