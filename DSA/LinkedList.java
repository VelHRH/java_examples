class Demo {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addAt(3,4);
        list.delete(6);
        list.print();
    }
}

public class LinkedList {
    Node head;
    public LinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addToStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAt(int index, int data) {
        if ( index < 1) {
            return;
        }

        if (index == 1) {
            addToStart(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 2;
        while (temp.next != null){
            if (i == index) {
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            i++;
            temp = temp.next;
        }
    }

    public void delete(int index) {
        if (index < 1) {
            return;
        }

        if (index == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        int i = 2;
        while (temp.next != null) {
            if (i == index) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
            i++;
        }
    }

    public void print() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
