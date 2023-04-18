package org.mediator;

// The abstract visitor class (the colleague).....
public abstract class AbstractVisitor {

    // the current chatroom that the is in (the mediator)
    protected AbstractChatroom currentChatroom = null;

    // the name of the visitor (Colleague)
    protected String name;

    // Send the specified message....
    public void send(String to, String message) {
        System.out.printf("Sending Message From ====>  %s to %s \n", name, to);
        currentChatroom.send( this, to, message);
    }

    // Receive a new message
    public abstract void receive(String from,String message);

    public void enter(AbstractChatroom chatroom) {
        // leave the current chatroom
        if (currentChatroom != null) {
            leave();
        }

        // join the specified chatroom
        chatroom.register(this);
        currentChatroom = chatroom;
    }

    private void leave() {
        if (currentChatroom != null) {
            currentChatroom.unregister(this);
            currentChatroom = null;
        }
    }

    public String getName() {
        return name;
    }
}
