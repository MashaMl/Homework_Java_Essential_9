package Task5;


class MyClass <T> {
    T element;
    public enum Types {
        ONE, TWO, THREE
    }

    public MyClass factoryMethod(Types types) {
        MyClass<T> factory = new MyClass<>();
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
class Factory1 extends MyClass{}
class Factory2 extends MyClass{}
class Factory3 extends MyClass{}

public class Main {
    public static void main(String[] args) {
        MyClass<Integer> factory1 = new MyClass<>();
        MyClass<String> factory2 = new MyClass<>();
        MyClass<Double> factory3 = new MyClass<>();
        factory1.factoryMethod(MyClass.Types.ONE);
        factory2.factoryMethod(MyClass.Types.TWO);
        factory3.factoryMethod(MyClass.Types.THREE);
        factory1.setElement(12);
        factory2.setElement("String");
        factory3.setElement(3.2);
        factory1.print();
        factory2.print();
        factory3.print();

    }
}
