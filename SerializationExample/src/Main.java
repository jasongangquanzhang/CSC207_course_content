import java.io.*;

/**
 * A node in a linked list of integers
 */
class Node implements Serializable {
    int value;
    Node next;

    Node(int i) {
        this.value = i;
    }
}


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Hello world!");
        Node front = buildList();
        writeListToFile(front);
        Node f = readLinkedList();
        System.out.println(f.value + " " + f.next.value + " " + f.next.next.value);
    }

    private static Node readLinkedList() throws IOException, ClassNotFoundException {
        FileInputStream fileReader = new FileInputStream("moogah.ser");
        ObjectInputStream in = new ObjectInputStream(fileReader);
        Node f = (Node) in.readObject();
        return f;
    }

    private static void writeListToFile(Node front) throws IOException {
        FileOutputStream fileWriter = new FileOutputStream("moogah.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileWriter);
        out.writeObject(front);
        out.close();
        fileWriter.close();
    }

    private static Node buildList() {
        Node front = new Node(1);
        front.next = new Node(2);
        front.next.next = new Node(3);
        return front;
    }


}