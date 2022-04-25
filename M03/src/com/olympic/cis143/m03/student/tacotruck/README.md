# Use Case
For the list labs, you will be extending the order nanagement system for our taco truck.

In short, you will be creating an Order implemenation that uses ArrayList rather than ArrayDeque. You will keep the ArrayDeque implmentation, howevever,
you will need to also create a new file in the list directory called OrderListImpl. The instructions are below.

Note that this must be a FIFO implemeation using an array list.

Note that the test logic on the OrdersTest file will not change, however, you will need to refactor the test to test the OrdersListImpl.
 
# Before You Begin

Please read the following blog post about [using ArrayLists](https://www.baeldung.com/java-arraylist)

# You TODO

1. In the list folder, create a java file called list/OrdersListImpl.java
2. Implement the Orders interface. This interface is already created for you.
3. Add the business logic in the new file using an ArrayList
4. Refactor the OrdersTest file to run the list/OrdersListImpl file as well the queue/OrdersQueueImpl against the same criteria. Note that as both use the same interface, you can test the logic with the same method.