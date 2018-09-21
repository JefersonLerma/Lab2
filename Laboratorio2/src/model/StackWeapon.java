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
	return null;
	
	}

	@Override
	public Node<T> getTop() {
		// TODO Auto-generated method stub
		return null;
	}


}
