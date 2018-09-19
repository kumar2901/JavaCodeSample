import java.util.*;

class ListNode
{
    int data;
	ListNode next;
	
	public ListNode(int data)
	{
	  this.data=data;
	  
	}
	public void setData(int data)
	{
	   this.data=data;
	}
	public int getData()
	{
	    return data;
	}
	public void setNext(ListNode next)
	{
	  this.next=next;
	}
	public ListNode getNext(ListNode next)
	{
	  return this.next;
	}

}