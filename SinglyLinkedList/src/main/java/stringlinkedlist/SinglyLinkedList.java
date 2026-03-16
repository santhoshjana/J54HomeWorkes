
package stringlinkedlist;


public class SinglyLinkedList 
{
  Node head;

    // Insert at Beginning
    void insertBeginning(String data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    void insertEnd(String data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at Middle (specific position)
    void insertMiddle(String data, int position) {

        Node newNode = new Node(data);

        if (position == 1) {
            insertBeginning(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display list
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }   
}
