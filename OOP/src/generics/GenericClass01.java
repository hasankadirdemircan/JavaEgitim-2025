package generics;

public class GenericClass01<T> {

    private T data;

    public GenericClass01(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
