
package circularlinkedlist;

public class CircularLinkedList 
{
     Node head, tail;

    // Insert at Beginning
    void insertBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head; // circular link
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // maintain circular link
        }
    }

    // Insert at End
    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // circular link
        }
    }

    // Delete from Beginning
    void deleteBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head; // maintain circular link
        }
    }

    // Delete from End
    void deleteEnd() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = head;
            tail = temp;
        }
    }

    // Display Circular List
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }
}
