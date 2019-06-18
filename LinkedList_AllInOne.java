package LinkedList;

import java.awt.List;

import org.w3c.dom.NodeList;
//main class

public class LinkedList_AllInOne {
	
	//instance variable 
	
	static ListNode head;
	
	//Node class
	static class ListNode {
		int data;
		ListNode next;
		
		ListNode(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	//display function
	public void display(ListNode head) {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	//length function
	public int length(ListNode head) {
		ListNode current=head;
		if(head==null) {
			return 0;
		}
		else {
		int count=0;
		while(current!=null) {
			count++;
			current=current.next;
			
		}
		return count;
		}
	}
	
	//add Node in the beginning 
	public void addInFront(int data) {
		ListNode newNode=new ListNode(data);
		if(head==null) {
			head=newNode;
			return;
		}
		else {
			
			newNode.next=head;
			head=newNode;
		}
	}
	
	//add Node in the last
	public void addInLast(int data) {
		ListNode newNode=new ListNode(data);
		if(head==null) {
			head=newNode;
			return;
		}
		else {
				ListNode current=head;
				while(current.next!=null) {
					current=current.next;
				}
				current.next=newNode;
				
		}		
		
	}
	
	//search element is present or not
	public boolean findElement(int data) {
		int searchkey=data;
		
		ListNode current=head;
		while(current.next!=null) {
			if(current.data==searchkey) {
				return true;
				}
			else {
				current=current.next;
			}
		}
		
		
		
		return false;
	}
	
	//to reverse linked list
	public ListNode reverse() {
		ListNode current=head;
		ListNode next=null;
		ListNode previous=null;
		
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
		}
	
	public ListNode fromLast(int n) {
		ListNode refPtr=head;
		ListNode origPtr=head;
		int count=0;
		while(count<n) {
			refPtr=refPtr.next;
			count++;
		}
		
		while(refPtr!=null) {
			refPtr=refPtr.next;
			origPtr=origPtr.next;
		}
		
		return origPtr;
	}
	
	
	//main function
	public static void main(String args[]) {
		
		LinkedList_AllInOne li=new LinkedList_AllInOne();
		
		//creating different nodes
		li.head=new ListNode(5);
		ListNode second=new ListNode(6);
		ListNode third=new ListNode(75);
		ListNode fourth=new ListNode(64);
		
		//connecting different nodes
		li.head.next=second;
		second.next=third;
		third.next=fourth;
		
		//adding two nodes in front
		li.addInFront(53);
		li.addInFront(253);
		
		//adding two nodes in last
		li.addInLast(8);
		li.addInLast(81);
		
	
		//display linked list
		li.display(head);
		System.out.println("Length is:" +li.length(head));
		
		
		//reversing the linked list
		/*ListNode reverseHead=li.reverse();
		li.display(reverseHead);*/
		
		
		//checking if element is present or not
		System.out.println("Element present is true/false: "+li.findElement(823));
		
		
		System.out.println("Element from last is: " + li.fromLast(6).data);
		
		
		
	}

	

}
