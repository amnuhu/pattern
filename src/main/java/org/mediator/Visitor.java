package org.mediator;

// The visitor class (the concrete colleague)....
public class Visitor extends AbstractVisitor{

    // Initializes a new instance of the Visitor ....
    public Visitor(String name) {
        this.name = name;
    }

    // Receive a new message....
    @Override
    public void receive(String from, String message) {
        System.out.printf("New Text  from %s  to  %s :  %s \n", from, name, message);
    }
}