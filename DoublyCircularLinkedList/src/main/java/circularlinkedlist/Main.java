
package circularlinkedlist;


public class Main {

    public static void main(String args[]) 
    {
        CircularLinkedList list = new CircularLinkedList();

        // Insert operations
        list.insertBeginning(20);
        list.insertBeginning(10);
        list.insertEnd(30);
        list.insertEnd(40);

        // Display
        System.out.println("Circular Linked List:");
        list.display();

        // Delete from beginning
        list.deleteBeginning();
        System.out.println("\nAfter Deleting from Beginning:");
        list.display();

        // Delete from end
        list.deleteEnd();
        System.out.println("\nAfter Deleting from End:");
        list.display();
    }
}
