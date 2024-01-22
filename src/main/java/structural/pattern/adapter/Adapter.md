# Adapter Pattern
The Adapter pattern is a design pattern that acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. The main goal for this pattern is to convert an existing interface into another one the client expects

### Types
| SL | Type | Description                                                                                              |
|----|------|----------------------------------------------------------------------------------------------------------|
| 1  |    Object Adapter    | Uses composition to delegate the logic to the Adapter.<br/><br/> Can wrap classes or interfaces, or both |
| 2  |    Class Adapter    | Uses inheritance and can only wrap a class <br/> Can only wrap a class                                   |


Imagine that if we have some legacy code that has some functionality that we want to use
in our current project & have certain inconsistencies between the two data types or
interfaces.
So we want to be able to use a particular interface or particular functionality, but we don't or we
are not able to modify the legacy code that we already have, and that is where the adapter design pattern
comes in.

#### Example:
DisplayDataApadater - Converts our data into 3rd party objects