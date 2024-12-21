package recap.package2;

import recap.package1.TestObject01;

public class TestObject02 {

    public static void main(String[] args) {
        System.out.println(TestObject01.multipy(3, 5));

        TestObject01 testObject01 = new TestObject01();
        testObject01.sum(5, 10);

        System.out.println(testObject01.divide(3, 2));
    }
}
