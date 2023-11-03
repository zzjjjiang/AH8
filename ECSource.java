import java.util.ArrayList;

class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    ArrayList<T> list = new ArrayList<>();
    while(head != null) {
      list.add(head.val);
      head = head.next;
    }
    try {
      return list.get(index);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
  
  public static void main(String[] args) {
    Node<String> node1 = new Node<>("banana");
    Node<String> node2 = new Node<>("mango");
    Node<String> node3 = new Node<>("kiwi");

    node1.next = node2;
    node2.next = node3;

    // banana -> mango -> kiwi

    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");

    a.next = b;
    b.next = c;
    c.next = d;

// a -> b -> c -> d

    System.out.println(ECSource.getNodeValue(a, 7)); // null

    System.out.println(ECSource.getNodeValue(node1, 1));
  }
}