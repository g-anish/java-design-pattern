# The Liskov Substitution Principle (LSP)

Ensure usage of Inheritance properly 

**The LSP states that if class A is a subtype of class B,
then objects of type B may be replaced with objects of type A without altering any of the desirable properties of the program.**

To understand the LSP, we must first understand the Open/Closed Principle (OCP), which is the “O” in SOLID. 
The OCP encourages us to design our software so that we add new features only by adding new code. 
When this is possible, we have loosely coupled, and thus easily maintainable applications.

Let’s consider an example to understand the LSP better. Suppose we have a banking application that supports two account types - “current” and “savings” 1. These are represented by the classes CurrentAccount and SavingsAccount, respectively 1. The BankingAppWithdrawalService serves the withdrawal functionality to its users 1. Unfortunately, there is a problem with extending this design. The BankingAppWithdrawalService is aware of the two concrete implementations of account. Therefore, the BankingAppWithdrawalService would need to be changed every time a new account type is introduced 1.

To make the code extensible, we can introduce a new abstract Account class that CurrentAccount and SavingsAccount extend 1. The BankingAppWithdrawalService no longer depends on concrete account classes. Because it now depends only on the abstract class, it need not be changed when a new account type is introduced 1. Consequently, the BankingAppWithdrawalService is open for the extension with new account types, but closed for modification, in that the new types don’t require it to change in order to integrate 1.

### Refer:
https://www.baeldung.com/java-liskov-substitution-principle


##### Example Explained :
1. Before LSP
   - square is a special type of rectangle,  if we make width and height of a rectangle of same value, then we will get a square.  
   - we translate that idea into our Java code (code in before_lsp)
   - 

`   private static void useRectangle(Rectangle rectangle) {
   rectangle.setHeight(20);
   rectangle.setWidth(30);
   assert rectangle.getHeight() == 20 : "Height Not equal to 20";
   assert rectangle.getWidth() == 30 : "Width Not equal to 30";
   }`

So we are asserting that when we set our rectangle height to 20, we are going to get that 20 back.

When we are say saying setting the width of a rectangle to 30.

We are going to get the same value back.

This is a simple test case as you can see, but if we run this test, you will see that our square fails

this particular test.


when we overrode or when we extended from that class and overrode these two methods, we violated

that defined behavior.


2. After LSP

mathematically it makes sense, that square is a rectangle when it comes to object oriented programming,

that relationship is not really valid because it violates our contract of set height and set width method

of rectangle class.

So in order to solve this problem, what we can do is we can create an interface called as shape.


So this is how now we have two classes rectangle and square that do not have a direct relationship,

but they both implement same interface called as shape.

And this is how we can avoid violating the liskov substitution principle.
We can write another test case that test the square separately.
Because we we are now making sure that anyone who is using our square is not under impression that he

is using a special type of rectangle.

He is going to know that only thing that is guaranteed by square is that it will have a compute area

method.
We are not making any promises.