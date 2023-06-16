package week04.gen;

public class Generic<T> {

    private  T t;

    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        Generic<Integer> generic = new Generic<>();
        generic.set(5);
        Integer integer = generic.get();
        System.out.println("integer = " + integer);
    }
}
