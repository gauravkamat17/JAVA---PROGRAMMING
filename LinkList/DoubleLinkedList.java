import java.util.*;
class Node2{
    int data;
    Node2 next;
    Node2 prev;
    Node2(int num)
    {
        data=num;
        next=null;
        prev=null;
    }
}
public class DoubleLinkedList{
    static void display(Node2 head)
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else{
            Node2 temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("null");
        }
    }
    static Node2 insertAtBeg(int num,Node2 head)
    {
        Node2 newnode=new Node2(num);
        if (head!=null)
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
        return head;
    }
    static Node2 insertAtEnd(int num,Node2 head)
    {
        Node2 newnode=new Node2(num);
        if(head==null)
        {
            newnode.next=head;
            head=newnode;
        }
        else{
            Node2 temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
        return head;
    }
    static Node2 deleteAtBeg(Node2 head)
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else{
            System.out.println("The deleted element is: "+head.data);
            Node2 temp=head;
            head=head.next;
            temp.next=null;
            if(head!=null)
                head.prev=null;
        }
        return head;
    }
    static Node2 deleteAtEnd(Node2 head)
    {
        //empty list 
        if(head==null)
        {
            System.out.println("list is empty");
        }
        //1 element in the list 
        else if(head.next==null)
        {
            System.out.println("the deleted element is "+head.data);
            head=null;  
        }
        else{
            Node2 last=head;
            
            while(last.next!=null)
            {
                last=last.next;
            }
            System.out.println("The deleted element is "+last.data);
            last.prev.next=null;
        }
        return head;
    }
    static Node2 deleteAtPos(int pos,Node2 head)
    {
        if(head==null)//for empty list
        {
            System.out.println("List is Empty");
        }
        else if(pos<=0)//negative or 0 position
        {
            System.out.println("Invalid position");
        }
        else if (pos==1)
        {
        	System.out.println("The deleted element id"+head.data);
        	head=head.next;
            head.prev=null;
        }
        else{
            Node2 last=head;
            for(int i=1;i<=pos-1;i++)//3<=4
            {
                last=last.next;//last=3
                if(last==null)
                {
                    System.out.println("position beyond the list");
                    return head;
                }
            }
            
            System.out.print("the deleted element is"+last.data);
            if(last.next != null){
                last.next.prev=null;
            }  
                last.prev.next=last.next;
                last.prev=null;             
        }
        return head;
    }
    static Node2 insertAtPos(int num,int pos,Node2 head) {
    	Node2 newnode=new Node2(num);
    	if(pos<=0)
    	{
    		System.out.println("Invalid postion");
    	}
    	else if(pos==1 || head==null)
    	{
            if(head!=null)
                head.prev=newnode;
    		newnode.next=head;
    		head=newnode;
    	}
    	else {
    		Node2 temp=head;
    		for(int i=1;i<=pos-2;i++)
    		{
    			temp=temp.next;
    			if(temp==null)
    			{
    				System.out.println("postion beyond the list");
    				return head;
    			}
    		}
            newnode.next=temp.next;
            temp.next=newnode;
            if(temp.next!=null)
            {
                newnode.next=temp.next;
          
            }
            temp.next=newnode;
    	}
    	return head;	
    }
    public static void main(String[] args)
    {
        Node2 head=null;
        while(true)
        {
            System.out.print("\n1.insertAtBeg\n2.insertAtEnd");
            System.out.print("\n3.display\n4.deleteAtBeg");
            System.out.print("\n5.deleteAtEnd\n6.InsertAtPos\n"
            		+ "\n7.deleteAtPos\n0.exit\n");
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your choice:");
            int choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter a number into the list:");
                int num=sc.nextInt();
                head=insertAtBeg(num,head);
            }
            else if(choice==2)
            {
                System.out.println("Enter a number into the list:");
                int num=sc.nextInt();
                head=insertAtEnd(num,head);
            }
            else if(choice==3)
            {
                display(head);
            }
            else if(choice==4)
            {
                head=deleteAtBeg(head);
            }
            else if(choice ==0)
            {
                break;
            }
            else if(choice==5)
            {
                head=deleteAtEnd(head);
            }
            else if(choice==6)
            {
            	System.out.print("Enter number into the list");
            	int num=sc.nextInt();
            	System.out.print("Enter position");
            	int pos=sc.nextInt();
                head=insertAtPos(num,pos,head);
            }
            else if(choice==7)
            {
            	System.out.print("Enter position");
            	int pos=sc.nextInt();
                head=deleteAtPos(pos,head);
            }
            else{
                System.out.println("Enter a valid choice");
            }
        }
    }
}