package exception_handling;

public class SuppressedException01 {
    public static void main(String[] args) {

        try (Computer computer = new Computer()) {
            System.out.println("try block!!");
            int number = 1 / 0; //1.exception
        } catch (Exception e) {
            System.out.println("catch block!");
            for(Throwable t : e.getSuppressed()) {
                System.out.println(t.getMessage());
            }
            System.out.println(e.getMessage());
        }
    }
}
class Computer implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Shut down...");
        throw new IllegalStateException("Exception in close!"); //2.exception (suprressed)
    }
}