package Decorator;

public abstract class NotifierDecorator implements Notify{
    protected Notify notify;

    public NotifierDecorator(Notify notify)
    {
        this.notify = notify;
    }

    @Override
    public void send() {
        this.notify.send();
    }
}
