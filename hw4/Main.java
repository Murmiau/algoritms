package hw4;

public class Main {
    public static void main(String[] args) {
        decision<Integer> tree = new decision<>();

        tree.add(2);
        tree.add(1);
        tree.add(6);
        tree.add(7);
        tree.add(9);
        tree.add(10);
        tree.add(3);
        tree.add(4);
        tree.add(11);
        tree.add(12);
        tree.add(5);
        tree.add(8);

        tree.print();
    }
}
