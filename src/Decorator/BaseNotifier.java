package Decorator;

public class BaseNotifier implements Notify {
    @Override
    public void send() {
        System.out.println("this is the initialization for sending the messages");
    }
}
