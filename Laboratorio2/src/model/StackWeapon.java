package model;

import interfaces.Stack;

public class StackWeapon<T> implements Stack<T> {

	private Node<T> firstStack;
	
	public StackWeapon() {
		// TODO Auto-generated constructor stub
		firstStack = null;
	}
	@Override
	public void stackUp(T t) {
		// TODO Auto-generated method stub
		Node<T> node = new Node<T>(t); 
		if(noWeapons()) {
			firstStack = node;
		}else {
			Node<T> current = firstStack;
			
			while(current.giveNext()!= null) {
			current = (Node<T>) current.giveNext();	
			}
				current.changeNext(node);
				node.changePreviuos(current);
				node.changeNext(current);
				
		}
	}

	@Override
	public boolean noWeapons() {
		// TODO Auto-generated method stub
		return firstStack == null;
	}

	@Override
	public T unStack() {
	Node<T> nodeDelected = null;
	int cont = 0;
	Node<T> act = firstStack;
	while(act == null) {
		cont ++;
		act = (Node<T>) act.giveNext();
	}
	if(noWeapons()) {
		if(cont == 1) {
			nodeDelected = firstStack;
			firstStack = null;
			
		}else {
			Node<T> pNodeDelecte = getTop();
			pNodeDelecte.givePrevious().changeNext(null);;
			pNodeDelecte.changePreviuos(null);
			nodeDelected = pNodeDelecte;
		}
	}
	return nodeDelected.getT();
	}

	@Override
	public Node<T> getTop() {
		// TODO Auto-generated method stub
		Node<T> top = null;
		if(noWeapons()) {
		Node<T> current = firstStack;
		while(current.giveNext() != null) {
		current = (Node<T>) current.giveNext();	
		}
		top = current;
		}
		return top;
	}


}
