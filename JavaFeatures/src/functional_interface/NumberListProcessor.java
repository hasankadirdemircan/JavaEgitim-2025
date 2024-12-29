package functional_interface;

import java.util.List;

@FunctionalInterface
public interface NumberListProcessor {
    int process(List<Integer> numbers);
}
