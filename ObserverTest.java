public class ObserverTest {
    
    public static void main(String[] args) {

        // create the subject
		Product product = new Product();
		
		// create the observers
		Observer obj1 = new ProductSubscriber("John");
		Observer obj2 = new ProductSubscriber("David");
		Observer obj3 = new ProductSubscriber("Steven");
		
		// register the observers to the subject
		product.register(obj1);
		product.register(obj2);
		product.register(obj3);
		
		// attach the observer to the subject
		obj1.setSubject(product);
		obj2.setSubject(product);
		obj3.setSubject(product);
		
		// check if any update is available
		obj1.update();
		
		// send message to subject
		product.postMessage("New Product Update!");

    }
}
