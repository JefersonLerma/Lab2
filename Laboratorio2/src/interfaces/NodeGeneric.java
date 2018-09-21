package interfaces;
import model.*;

public interface NodeGeneric<T> {
	
	
	public NodeGeneric<T> giveNext();
	public NodeGeneric<T> givePrevious();
    public void changeNext(Node<T> node);
    public void changePreviuos(Node<T> node);
}
