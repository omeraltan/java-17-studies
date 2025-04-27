package org.basics.ocp17.chapter06;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Example04 {
}

final class Message {
    private final String sender;
    private final String receiver;
    private final String content;
    private final long timestamp;

    public Message(String sender, String receiver, String content, long timestamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getSender() { return sender; }
    public String getReceiver() { return receiver; }
    public String getContent() { return content; }
    public long getTimestamp() { return timestamp; }
}

class MessagingService {
    private final ConcurrentLinkedQueue<Message> messages = new ConcurrentLinkedQueue<>();

    public void sendMessage(String sender, String receiver, String content) {
        Message message = new Message(sender, receiver, content, System.currentTimeMillis());
        messages.add(message);
    }

    public ConcurrentLinkedQueue<Message> getMessages() {
        return messages;
    }
}

class MessagingTest {
    public static void main(String[] args) throws InterruptedException {
        MessagingService service = new MessagingService();

        Runnable sender1 = () -> {
            for (int i = 0; i < 5; i++) {
                service.sendMessage("Alice", "Bob", "Hello " + i);
            }
        };

        Runnable sender2 = () -> {
            for (int i = 0; i < 5; i++) {
                service.sendMessage("Charlie", "Diana", "Hi " + i);
            }
        };

        Thread thread1 = new Thread(sender1);
        Thread thread2 = new Thread(sender2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("All Messages:");
        service.getMessages().forEach(msg ->
            System.out.println(msg.getSender() + " -> " + msg.getReceiver() + ": " + msg.getContent())
        );
    }
}

