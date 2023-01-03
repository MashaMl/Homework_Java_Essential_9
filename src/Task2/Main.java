package Task2;

import java.util.ArrayList;

class MyList <T> {
    private final int DEFAULT_SIZE = 3;
    private Object[] objects = new Object[DEFAULT_SIZE];
    private int elements = 0;

    public void add(T obj) {

        if(elements == objects.length - 1) {
            Object[] buf = new Object[objects.length * 2];
            System.arraycopy(objects, 0, buf, 0, objects.length);
            objects = new Object[objects.length * 2];
            System.arraycopy(buf, 0, objects, 0, buf.length);
        }
        objects[elements++] = obj;
    }
    public void add(T obj, int index) {
        if(elements == objects.length - 1) {
            Object[] buf = new Object[objects.length * 2];
            System.arraycopy(objects, 0, buf, 0, objects.length);
            objects = new Object[objects.length * 2];
            System.arraycopy(buf, 0, objects, 0, buf.length);
        }
        Object[] buf = new Object[elements];
        System.arraycopy(objects, index, buf, 0, elements - index);
        objects[index] = obj;
        elements++;
        if(elements == objects.length - 1) {
            Object[] buf2 = new Object[objects.length * 2];
            System.arraycopy(objects, 0, buf2, 0, objects.length);
            objects = new Object[objects.length * 2];
            System.arraycopy(buf2, 0, objects, 0, buf2.length);
        }
        System.arraycopy(buf, 0, objects, index+1, buf.length);
    }
    public T get(int index) {
        return (T) objects[index];
    }
    public void size() {
        System.out.println(elements);
    }
    public void print() {
        for(int i = 0; i < elements; ++ i) {
            System.out.println(objects[i]);
        }
    }

}

public class Main {
    public static void main(String[] args) {

        MyList <String> myList = new MyList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.print();
        System.out.println();
        myList.add("E", 2);
        myList.print();
        System.out.println();
        System.out.println(myList.get(3));
        myList.size();
    }
}
