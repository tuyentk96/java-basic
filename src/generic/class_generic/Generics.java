package generic.class_generic;

public class Generics<T> {
    T information;

    void add(T information) {
        this.information = information;
    }

    public T getInformation() {
        return information;
    }
}
