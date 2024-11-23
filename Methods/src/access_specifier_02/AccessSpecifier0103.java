package access_specifier_02;

import access_specifier.AccessSpecifier01;

public class AccessSpecifier0103 {
    public static void main(String[] args) {
        AccessSpecifier01 accessSpecifier01 = new AccessSpecifier01();
        accessSpecifier01.sum(3,8);
        accessSpecifier01.sayHello();
        /*
         : Bir değişkene ya da methoda aynı package içerisinde
farklı class içerisinden erişim sağlanabilir.
        accessSpecifier01.sum2(3,8);
        accessSpecifier01.sayHello02();

         */


    }
}
