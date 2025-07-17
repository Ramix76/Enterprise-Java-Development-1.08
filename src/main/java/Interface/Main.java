package Interface;

public class Main {
    public static void main(String[] args) {
        IntList list1 = new IntArrayList();
        IntList list2 = new IntVector();

        for (int i = 0; i < 25; i++) {
            list1.add(i);
            list2.add(i * 2);
        }

        System.out.println("IntArrayList element at index 5: " + list1.get(5));
        System.out.println("IntVector element at index 5: " + list2.get(5));
    }
}

