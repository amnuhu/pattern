package org.mediator;

public class Main {
    public static void main(String[] args) {
        // Instantiate three visitors
        var john = new Visitor("John Smith");
        var bob = new Visitor("Uncle Bob");
        var doe = new Visitor("Doe");

//        // have all three visitors join one room
        var chatroom = new Chatroom();
        john.enter(chatroom);
        bob.enter(chatroom);
        doe.enter(chatroom);

        // Sending private messages
        john.send("Doe","Hi Doe");
        doe.send("John Smith", "yeah John");

        // John sends a greeting
        john.send("all","Hello everyone");
        // Bob sends a reply
        bob.send("all","Welcome to the chatroom Smith");
        // Doe sends a reply
        doe.send("all","Hi Smith, nice to meet you");
    }
}