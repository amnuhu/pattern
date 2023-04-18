package org.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// he abstract chatroom class (the mediator)...
public abstract class AbstractChatroom {
    // the list of al current visitors

    protected Map<String, AbstractVisitor> activeVisitors = new HashMap<>();

    // Send the specified message
    public abstract void send(AbstractVisitor sender,  String to, String message);

    // Register the specified visitor...
    public abstract void register(AbstractVisitor visitor);

    // Unregister the specified visitor...
    public abstract void unregister(AbstractVisitor visitor);

}