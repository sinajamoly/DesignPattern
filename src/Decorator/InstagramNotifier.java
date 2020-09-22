package Decorator;

public class InstagramNotifier extends NotifierDecorator {
    public InstagramNotifier(Notify notify) {
        super(notify);
    }

    @Override
    public void send() {
        this.notify.send();

        System.out.println("this message is coming from Instagram");
    }
}
