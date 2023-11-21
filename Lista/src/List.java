public class List<T> {
    Node<T> myRoot;

    public T add(T value) {
        Node<T> node = new Node<>(value);
        if (myRoot == null) {
            myRoot = node;
        } else {
            Node<T> temp = myRoot;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        return value;
    }

    public T get(int index) {
        Node<T> node = myRoot;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return node.Value;
            }
            node = node.next;
        }
        return null;
    }

    public void add(T value, int index) {
        Node<T> temp = myRoot;
        Node<T> currentNode = temp;
        Node<T> newNode = new Node<>(value) ;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                currentNode.next = newNode;
                newNode.next = temp;
            }
            currentNode = temp;
            temp = temp.next;
        }
    }

    public void delete(int index) {
        Node<T> temp = myRoot;
        Node<T> currentNode = temp;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                currentNode.next = temp;
            }

            currentNode = temp;
            temp = temp.next.next;
        }
    }
}
