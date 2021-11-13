package linklists;

public class LinkLists {

    public static void main(String[] args) {
        SingleLinkList sll = new SingleLinkList();
        sll.insertAt(0, 0);
        sll.insertAt(1, 1);
        sll.insertAt(2,2);
        sll.print();

    }

}

class SingleLinkList {

    Node head;

    private class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {   //will insert at end
        Node newNode = new Node(data);
        newNode.next = null;
        if (this.head == null) {      //linkList in empty
            this.head = newNode;
        } else {                     //list is not empty then find last node
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void insertAt(int f, int d) {  //will insert data next after given node data found 
      
        Node newNode = new Node(d);
        if (this.head == null) {      //linkList in empty
            this.head = newNode;
           
        }
        else {
            Node s = this.getNodeByPosition(f - 1);
            newNode.next = s.next;
            s.next = newNode;
        }

    }

    public void deleteAt(int i) {                //delete by positon
        Node c = this.getNodeByPosition(i);   //get position of node
        if (c == null) {
            System.out.println("Position doesnt exist i.e linklist is shorter than the given index");
        } else {
            Node prev = this.getNodeByPosition(i - 1);
            if (prev != null) {
                prev.next = c.next;
            }
            this.head = c.next;
            c.next = null;
        }

    }

    public int findPosition(int d) {
        Node x = this.head;
        int i = 0;
        while (x.next != null) {
            if (x.data == d) {
                return i;
            }
            x = x.next;
            i++;
        }

        return -1;
    }

    public Node getNodeByPosition(int ri) {

        Node x = this.head;
        int i = 0;
        if (x == null) {
            return null;
        }
        if (i == ri) {
            return x;
        }
        while (x.next != null) {

            x = x.next;
            i++;

            if (i == ri) {
                return x;
            }

        }

        return null;
    }

    public Node search(int d) {
        Node i = this.head;
        do {
            if (i.data == d) {
                return i;

            }
            if (i.next == null) {
                return null;
            }
            i = i.next;
        } while (i.next != null);

        return null;
    }

    public void print() {
        Node x;
        x = this.head;
        while (x.next != null) {
            System.out.println(x.data);
            x = x.next;
        }
        System.out.println(x.data);

    }

}
