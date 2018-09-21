package interfaces;
import model.*;

public interface Stack<T> {
	
	//Apilar
	public void stackUp(T t);
	
	public boolean noWeapons();
	
	//desapilar
	public T unStack();
	
	public Node<T> getTop();

}
