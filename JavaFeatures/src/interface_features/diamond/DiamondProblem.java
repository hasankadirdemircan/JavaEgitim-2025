package interface_features.diamond;

public class DiamondProblem implements MyInterface1, MyInterface2{

    @Override
    public void defaultMethod() {
        System.out.println("DiamondProblem class");
    }

    @Override
    public void test() {
        System.out.println("abstract method overrided");
    }
}
