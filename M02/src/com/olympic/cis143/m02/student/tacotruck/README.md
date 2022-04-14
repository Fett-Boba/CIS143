# Use Case
For the queue labs, you will be creating an order management system for our Taco truck.

The premise is simple, the orders are processed in the order they are received. FIFO will apply.

# Before You Begin

Please read the following blog post about [using ArrayDeque as a Queue](https://www.baeldung.com/java-array-deque#2-arraydeque-as-a-queue)

# You TODO

## Part One: Get The Logic Running
This part is to implment the code in the queue/OrdersQueueImpl file. Javadoc should make it clear as to each methods intent.

1. Implement the methods found in the queue/OrdersQueueImpl class in order to make the OrdersTestClass pass all the tests.

## Part Two: Refactoring the interface out.
1. Create an interface, in this directory, called Orders.
2. Take all the public method signatures from queue/OrdersQueueImpl and add them to the Orders interface.
3. Implement the interface in the queue/OrdersQueueImpl file.
4. Update the OrdersTest file to use the Orders interface rather than the queue/OrderQueueImpl implementation
