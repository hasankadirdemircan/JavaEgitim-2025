package thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFuture01 {
    ExecutorService executor = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
    }

    public void async() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> sayHello("John"), executor);
    }

    public String sayHello(String a) {
        return a;
    }
}
