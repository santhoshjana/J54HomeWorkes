
package delection;

public class DelectionSinglyLinkedList 
{
    Node head;
     void insertEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp=head;
            
            while(temp.next!= null)
            {
                temp = temp.next;
            }
            temp.next=newNode;
        }
    }
     
     void delectionAtBegin()
     {
        Node temp = head;
         if(head != null)
         {
            head = head.next;
            temp.next = null;
         }
     }
     
     void delectionAtEnd()
     {
         Node temp = head;
         while(temp.next.next != null)
         {
             temp = temp.next;
         }
         temp.next = null;
     }
     void delectionAtMiddel(int data)
     {
         Node temp = head;
         while(temp.next != null && temp.next.data != data)
         {
             temp = temp.next;
         }
         temp.next = temp.next.next;
         
     }
     void display()
    {
        Node temp=head;
        
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        
    }
    
}
