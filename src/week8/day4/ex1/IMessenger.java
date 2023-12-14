package week8.day4.ex1;

/*
    Interface - is an abstract type that is used to group related abstract methods.
    We use interfaces mostly to achieve abstraction(also for the same reason we can use abstract classes).
    Also with interfaces we can achieve MULTIPLE INHERITANCE!!!

    All methods in interface are by default public and abstract.
    We use "extends" for classes only. But for interfaces we use "implements" keyword.

    Difference between abstract classes and interface.
    Abstract class can have normal fields, constructors, abstract and non-abstract.
 */
public interface IMessenger {
    void sendMessage(String contact, String message);

    // default methods came from Java version 8
    default void receiveMessage() {
        System.out.println("received a message");
    }
}

// class, enum, interface(is a collection of abstract methods)
