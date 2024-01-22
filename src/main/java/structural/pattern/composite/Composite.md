# Composite
The Composite Pattern is a design pattern that allows you to treat a group of objects in the same way as a single instance of the same type of object. 
It is used to represent part-whole hierarchies by composing objects into tree structures. 
The pattern is useful when dealing with tree-structured data, where programmers often have to discriminate between a leaf-node and a branch. 
The solution is an interface that allows treating complex and primitive objects uniformly. In object-oriented programming, a composite is an object designed as a composition of one-or-more similar objects, all exhibiting similar functionality. 
This is known as a “has-a” relationship between objects. 
The key concept is that you can manipulate a single instance of the object just as you would manipulate a group of them. 
The operations you can perform on all the composite objects often have a least common denominator relationship.

In Java, the Composite Pattern can be implemented using the following participants:

Component: Declares the interface for objects in the composition and for accessing and managing its child components. 
It also implements default behavior for the interface common to all classes as appropriate.
Leaf: Defines behavior for primitive objects in the composition. It represents leaf objects in the composition.
Composite: Stores child components and implements child related operations in the component interface.
Client: Manipulates the objects in the composition through the component interface. 
Client use the component class interface to interact with objects in the composition structure. 
If recipient is a leaf then request is handled directly. If recipient is a composite, then it usually forwards request to its child components, possibly performing additional operations before and after forwarding.