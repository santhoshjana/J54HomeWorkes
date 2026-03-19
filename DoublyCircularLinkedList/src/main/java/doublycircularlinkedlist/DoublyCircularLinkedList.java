

package doublycircularlinkedlist;

public class DoublyCircularLinkedList {

    public static void main(String[] args) {
         DoublyLinkedList list = new DoublyLinkedList();

        // Insert operations
        list.insertBeginning(20);
        list.insertBeginning(10);
        list.insertEnd(30);
        list.insertEnd(40);

        // Display
        System.out.println("Forward Display:");
        list.displayForward();

        System.out.println("Backward Display:");
        list.displayBackward();

        // Delete from beginning
        list.deleteBeginning();
        System.out.println("\nAfter Deleting from Beginning:");
        list.displayForward();

        // Delete from end
        list.deleteEnd();
        System.out.println("\nAfter Deleting from End:");
        list.displayForward();
    }
}
