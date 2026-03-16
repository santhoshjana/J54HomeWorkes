

package com.mycompany.singlylinkedlist;


public class SinglyLinkedList {

   
        Node head;
    
    void insertBegin(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }
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
    
    void insertMiddle(int data, int position)
    {
        Node newNode = new Node(data);

        if(position == 1)
        {
            insertBegin(data);
            return;
        }

        Node temp = head;

        for(int i = 1; i < position - 1 && temp != null; i++)
        {
            temp = temp.next;
        }

        if(temp == null)
        {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
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
