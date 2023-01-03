package Task5;


class Factory <T> {
    T element;
    public enum Types {
        ONE, TWO, THREE
    }

    public Factory factoryMethod(Types types) {
        Factory<T> factory = new Factory<>();
        switch (types) {
            case ONE:
                factory = new Factory1();
                break;
            case TWO:
                factory = new Factory2();
                break;
            case THREE:
                factory = new Factory3();
                break;
        }
        return factory;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void print() {
        System.out.println(element);
    }
}
class Factory1 extends Factory{}
class Factory2 extends Factory{}
class Factory3 extends Factory{}

public class Main {
    public static void main(String[] args) {
        Factory<Integer> factory1 = new Factory<>();
        Factory<String> factory2 = new Factory();
        Factory<Double> factory3 = new Factory();
        factory1.factoryMethod(Factory.Types.ONE);
        factory2.factoryMethod(Factory.Types.TWO);
        factory3.factoryMethod(Factory.Types.THREE);
        factory1.setElement(12);
        factory2.setElement("String");
        factory3.setElement(3.2);
        factory1.print();
        factory2.print();
        factory3.print();

    }
}
