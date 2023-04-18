package org.mediator;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Chatroom extends AbstractChatroom{
    // Send the specified message

    @Override
    public void send(AbstractVisitor sender, String to, String message) {
       if (Objects.equals(to, "all")) {
           Set<Map.Entry<String, AbstractVisitor>> entries =  activeVisitors.entrySet();
           for (Map.Entry<String, AbstractVisitor> entry : entries) {
               AbstractVisitor receiver = entry.getValue();
               if (receiver != sender)
                   receiver.receive(sender.getName(),message);
           }
       }
       else {
           if (activeVisitors.containsKey(to)) {
                AbstractVisitor receiver = activeVisitors.get(to);
                receiver.receive(sender.getName(), message);
           }
       }
    }

    // Register the specified visitor...
    @Override
    public void register(AbstractVisitor visitor) {
        activeVisitors.put(visitor.getName(), visitor);
    }

    // Unregister the specified visitor...
    @Override
    public void unregister(AbstractVisitor visitor) {
        activeVisitors.remove(visitor);
    }
}
