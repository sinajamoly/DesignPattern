package Decorator;

public class FacebookNotifier extends NotifierDecorator {
    public FacebookNotifier(Notify notify) {
        super(notify);
    }

    @Override
    public void send() {
        this.notify.send();

        System.out.println("this message is coming from facebook");
    }
}
