package final_example;

public class FinalExample01 {
    public static void main(String[] args) {
        int number1 = 10;
        number1 = 20;

        final int number2 = 30;
        //number2 = 1;

        final String program = "Java";
        //Note: Strings are immutable on Heap(memory) layer as well.
        //program = program.concat(" Lesson");
    }

    public final void sayHello() {
        System.out.println("helloo!");
    }
}
