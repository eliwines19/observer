public class ProductSubscriber implements Observer {
    
    private String name;
    private Subject product;

    public ProductSubscriber(String n) {
        this.name = n;
    }

    @Override
    public void update() {
        String msg = (String) product.getUpdate(this);
        if (msg == null) {
            System.out.println(name + ": no new message!");
        } else {
            System.out.println(name + " - Receiving Message: " + msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.product = sub;
    }
}
