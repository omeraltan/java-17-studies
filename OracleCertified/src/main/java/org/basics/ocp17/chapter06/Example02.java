package org.basics.ocp17.chapter06;

public class Example02 {
}

class MutableMessage {
    private String message;

    public MutableMessage(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

final class ImmutableMessage {
    private final String message;

    public ImmutableMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public ImmutableMessage updateMessage(String newMessage) {
        return new ImmutableMessage(newMessage);
    }
}

class MutableTest {
    public static void main(String[] args) {
        MutableMessage message = new MutableMessage("Hello");

        System.out.println("Before: " + message.getMessage());

        message.setMessage("Hi!");

        System.out.println("After: " + message.getMessage());
    }
}

class ImmutableTest {
    public static void main(String[] args) {
        ImmutableMessage message = new ImmutableMessage("Hello");

        System.out.println("Before: " + message.getMessage());

        // Yeni bir nesne oluşturuluyor
        ImmutableMessage newMessage = message.updateMessage("Hi!");

        System.out.println("Original: " + message.getMessage());
        System.out.println("New: " + newMessage.getMessage());
    }
}


