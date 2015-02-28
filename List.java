public class List<E>
{
	private class Node<E>
	{
		private E element;
		private int ENo;
		private Node<E> next;
		
		//Defining constructor
		public Node(E e,Node<E> n ,int nomber_of_element)
		{
			element = e;
			ENo = nomber_of_element;
			next = n;
		}
		
		//Methodes
		public E getElement()
		{
			return element;
		}
		public Node<E> getNext()
		{
			return next;
		}
		public int getENo()
		{
			return ENo;
		}
		public void setNext(Node<E> n)
		{
			next = n;
		}
	}
	
	private Node<E> root;
	private Node<E> temp;
	//Adding an element
	
	//Search Method
	private Node<E> search(Node<E> nodeInstance)
	{
		
		if(nodeInstance.getENo() < temp.getENo())
		{
			temp = nodeInstance;
		}
		if(nodeInstance != null)
			return search(temp);
		return temp;
	}
	
}
