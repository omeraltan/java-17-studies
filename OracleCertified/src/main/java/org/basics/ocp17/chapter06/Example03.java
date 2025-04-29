package org.basics.ocp17.chapter06;

public class Example03 {
}

class MutableMessage2 {
    private String message;

    public MutableMessage2(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

final class ImmutableMessage2 {
    private final String message;

    public ImmutableMessage2(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public ImmutableMessage2 updateMessage(String newMessage) {
        return new ImmutableMessage2(newMessage);
    }
}


class Mutable2ThreadTest {

    public static void main(String[] args) {
        MutableMessage2 message = new MutableMessage2("Hello");

        Runnable writer = () -> {
            for (int i = 0; i < 5; i++) {
                message.setMessage("Hi " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable reader = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Reader sees: " + message.getMessage());
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread writerThread = new Thread(writer);
        Thread readerThread = new Thread(reader);

        writerThread.start();
        readerThread.start();
    }
}

class Immutable2ThreadTest {
    public static void main(String[] args) {
        final ImmutableMessage2[] message = { new ImmutableMessage2("Hello") };

        Runnable writer = () -> {
            for (int i = 0; i < 5; i++) {
                message[0] = message[0].updateMessage("Hi " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable reader = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Reader sees: " + message[0].getMessage());
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread writerThread = new Thread(writer);
        Thread readerThread = new Thread(reader);

        writerThread.start();
        readerThread.start();
    }
}


