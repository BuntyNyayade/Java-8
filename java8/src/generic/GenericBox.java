package generic;

public class GenericBox<T> {

    T container;

    public GenericBox(T container) {
        this.container = container;
    }

    public T getContainer() {
        return container;
    }

    public void setContainer(T container) {
        this.container = container;
    }

    public int checkType () {
        if (this.container instanceof String) {
            return ((String) this.container).length();
        } else {
            return (int)this.container;
        }
    }
}
