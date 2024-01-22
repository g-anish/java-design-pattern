# Facade Design pattern
The facade design pattern is a structural pattern that provides a simplified interface to a complex system of classes, subsystems, or libraries. 
It encapsulates the complexity of the system behind a simple interface and makes the subsystem easy to use. 
The client can use the facade to interact with the subsystem without knowing the details of the subsystem classes.

In Java, we can create a facade class that provides a simple method that internally calls the methods of the other classes to process the order. For example, suppose we have a complex system that handles online orders, which involves multiple classes such as Order, Payment, Inventory, Shipping, etc. We can create a facade class called OrderFacade that provides a simple method called placeOrder() that internally calls the methods of the other classes to process the order.

`
public class OrderFacade {
private Order order;
private Payment payment;
private Inventory inventory;
private Shipping shipping;
    public OrderFacade() {
        order = new Order();
        payment = new Payment();
        inventory = new Inventory();
        shipping = new Shipping();
    }
    public void placeOrder(String product, String cardNumber, String address) {
        order.createOrder(product);
        payment.processPayment(cardNumber);
        inventory.updateInventory(product);
        shipping.shipOrder(address);
        System.out.println("Order placed successfully");
    }
}
`
In this example, the facade class (OrderFacade) encapsulates the logic and interactions of the subsystem classes (Order, Payment, Inventory, Shipping) and exposes a single method (placeOrder) to the client. 
The client class only needs to create an instance of the facade class and call the facade method with the required parameters. 
The client does not need to know or care about the details of the subsystem classes.