
package com.mycompany.singlylinkedlist;

public class LinkedList 
{
  public static void main(String[] args) 
    {
        SinglyLinkedList sll = new SinglyLinkedList();
        
       
       sll.insertEnd(10);
       sll.insertEnd(20);
       sll.insertBegin(5);
       sll.insertEnd(101);
       sll.insertEnd(1001);
       sll.insertMiddle(15, 3);
       
       sll.display();
    }   
}
