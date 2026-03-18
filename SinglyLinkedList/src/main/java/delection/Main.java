
package delection;


public class Main {

    
    public static void main(String args[]) 
    {
        DelectionSinglyLinkedList del = new DelectionSinglyLinkedList();
        del.insertEnd(30);
        del.insertEnd(20);
        del.insertEnd(25);
        del.insertEnd(12);
        del.insertEnd(18);
        del.delectionAtBegin();
        del.delectionAtEnd();
        del.delectionAtMiddel(25);
        
        del.display();
    }
}
