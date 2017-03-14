package designPatterns.subscribeNPublish;

/**
 * Created by kirk on 2017/3/14.
 */
public class Test {
    public static void main(String args[]) {
        TopicOne to = new TopicOne();
        UserTwo ut = new UserTwo();
        to.attach(new UserOne());
        to.attach(ut);
        to.detach(ut);
        to.Notify();
    }
}
