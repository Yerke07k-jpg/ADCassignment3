import java.util.Random;

public class Main {
    public static void main(String[] args) {
       
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>(100);
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(100000);
            table.put(new MyTestingClass(id, "User" + id), "Student" + i);
        }
        table.printBucketSizes();

        
        BST<Integer, String> tree = new BST<>();
        tree.put(10, "Ten");
        tree.put(5, "Five");
        tree.put(15, "Fifteen");

        for (var elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }
    }
}
