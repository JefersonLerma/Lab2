package model;

import interfaces.NodeGeneric;
// last to enter, first out
public class Node<T> implements NodeGeneric<T> {

	private Node<T> objectNext;
	private Node<T> objectPrevious;
	private T object;
	
	public Node(T pObjet) {
		// TODO Auto-generated constructor stub
		object = pObjet;
		objectNext = null;
		objectPrevious = null;
	}
	
	
	@Override
	public NodeGeneric<T> giveNext() {
		// TODO Auto-generated method stub
		return objectNext;
	}

	@Override
	public NodeGeneric<T> givePrevious() {
		// TODO Auto-generated method stub
		return objectPrevious;
	}

	@Override
	public void changeNext(Node<T> node) {
		// TODO Auto-generated method stub
		objectNext = node;
		
	}

	@Override
	public void changePreviuos(Node<T> node) {
		// TODO Auto-generated method stub
		objectPrevious = node;
	}
	
	public T getT() {
		return object;
	}

}
