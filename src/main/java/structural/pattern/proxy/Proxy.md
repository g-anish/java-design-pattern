# Proxy Pattern
The Proxy Design Pattern allows us to create an intermediary that acts as an interface to another resource, while also hiding the underlying complexity of the component. 
The pattern involves creating a new class, known as the proxy, which acts as an intermediary between a client and the real object. The proxy object controls access to the real object, allowing you to add additional functionality, such as lazy loading, access control, logging, or caching, without changing the actual object’s code.


Consider a heavy Java object (like a JDBC connection or a SessionFactory) that requires some initial configuration. 
We only want such objects to be initialized on demand, and once they are, we’d want to reuse them for all calls. 
We can create a simple interface and the configuration for this object


Comparing facade pattern, the difference is that facade will basically kind of coagulate and make access to a certain functionality easier, we'll provide some interface, whereas the proxy has the same interface.

Comparing to decorator pattern, there's a very subtle difference here, whereas the decorator will basically access the functionality of the underlying object. The proxy will manage the lifecycle of the object so it won't only access the functionality. It will also manage the lifecycle and call whatever underlying functionality it requires.