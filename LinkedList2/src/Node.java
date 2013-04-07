
public class Node {
	
	Node next;
	int data;
	
	public Node(int data)
	{
		next=null;
		this.data=data;
	}
	
	public void insert(int data)
	{
		//first make new node
		Node newNode=new Node(data);
		Node n=this;
		
		while(n.next!=null)
		{
			n.next=n.next.next;
		}
		n.next=newNode;
	}
	
	public Node deleteNode(Node head,int data)
	{
		Node n=head;
		
		if(head.data==data)
		{
			return head.next;
		}
		
		//now iterate through the list
		while(n.next!=null)
		{
			if(n.next.data==data)
			{
				n.next=n.next.next;
					return head;	
			}
		}
		
		return head;
	}
	
	

}
