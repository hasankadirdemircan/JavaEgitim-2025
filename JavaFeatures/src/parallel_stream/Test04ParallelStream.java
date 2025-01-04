package parallel_stream;

import java.util.ArrayList;
import java.util.List;

class WhaleDataCalculator {

    int processRecord(int input) {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            // Handle interrupted exception
        }
        return input + 1;
    }

    public void processAllData(List<Integer> data) {
        data.stream().map(a -> processRecord(a)).forEach(System.out::println);
    }

    public void processAllDataParallel(List<Integer> data) {
        data.parallelStream().map(a -> processRecord(a)).forEach(System.out::println);
    }
}

public class Test04ParallelStream {

    public static void main(String[] args) {
        //
        WhaleDataCalculator calculator = new WhaleDataCalculator();
        // Define the data
        List<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < 4000; i++)
            data.add(i);
        // Process the data
        long start = System.currentTimeMillis();
        calculator.processAllDataParallel(data);

        //Even better, the results scale with the number of processors.
        //calculator.processAllDataParallel(data);
        System.out.println("start time : " + start);
        System.out.println("end time  :  " + System.currentTimeMillis());
        double time = (System.currentTimeMillis() - start) / 1000.0;
        // Report results
        System.out.println("\nTasks completed in: " + time + " seconds");
    }
}
