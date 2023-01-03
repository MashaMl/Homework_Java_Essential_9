package Task3;

class MyDictionary <TYPE1, TYPE2> {
    final int DEFAULT_CAPACITY = 20;
    Object[] firstElement= new Object[DEFAULT_CAPACITY];
    Object[] secondElement = new Object[DEFAULT_CAPACITY];
    int elements;

    public void add(TYPE1 obj1, TYPE2 obj2) {
        if(elements == firstElement.length - 1) {
            Object[] buf = new Object[firstElement.length * 2];
            System.arraycopy(firstElement, 0, buf, 0, firstElement.length);
            firstElement = new Object[firstElement.length * 2];
            System.arraycopy(buf, 0, firstElement, 0, buf.length);
            buf = new Object[secondElement.length * 2];
            System.arraycopy(secondElement, 0, buf, 0, secondElement.length);
            secondElement = new Object[secondElement.length * 2];
            System.arraycopy(buf, 0, secondElement, 0, buf.length);
        }
        firstElement[elements] = obj1;
        secondElement[elements++] = obj2;
    }
    public TYPE1 getFirstElement(int index) {
        return (TYPE1) firstElement[index];
    }
    public TYPE2 getSecondElement(int index) {
        return (TYPE2) secondElement[index];
    }
    public void size() {
        System.out.println(elements);
    }
    public void print() {
        for(int i = 0; i < elements; ++i) {
            System.out.println(firstElement[i] + " - " + secondElement[i]);
        }
    }


}

public class Main {
    public static void main(String[] args) {
     MyDictionary<String, String> myDictionary = new MyDictionary<>();
     myDictionary.add("Hello", "Привет");
     myDictionary.add("World", "Мир");
     myDictionary.add("I", "Я");
     myDictionary.add("Want", "Хочу");
     myDictionary.add("Tangerines", "Мандаринки");
     myDictionary.print();
     System.out.println();
     myDictionary.size();
     System.out.println();
     System.out.println(myDictionary.getFirstElement(1));
     System.out.println(myDictionary.getSecondElement(1));
    }
}
