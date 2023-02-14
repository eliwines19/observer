public interface Subject {

	// register and unregister observers
	public void register(Observer obj);
	public void unregister(Observer obj);

    // notify observers of change
	public void notifyObservers();

    // get updates from subject
	public Object getUpdate(Observer obj);
}