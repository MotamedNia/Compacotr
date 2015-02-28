import java.lang.Boolean;
public class Tree<E>
{
	//Class Node defenition as nested class
	private class Node<E>
	{
		Node<E> RightChild;
		Node<E> LeftChild;
		E element;
		//Constructor defenition
		public Node()
		{
			RightChild = null;
			LeftChild =null;
		}
		public Node<E> getRightChild()
		{
			return RightChild;
		}
		public Node<E> getLeftChild()
		{
			return LeftChild;
		}
	}
	
	//Feilds of tree
	private Node<E> root;
	private Node<E> temp;
	//Methods of tree
	//Constructor defenition
	public Tree()
	{
		root = null;
		temp= root;
	}
	
	//public Boolean Add();
	

}
