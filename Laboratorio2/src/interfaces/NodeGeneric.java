package interfaces;

public interface NodeGeneric<T> {
	
	
	public NodeGeneric<T> giveNext();
	public NodeGeneric<T> givePrevious();
    public void changeNext(NodeGeneric<T> node);
    public void changePreviuos(NodeGeneric<T> node);
}
