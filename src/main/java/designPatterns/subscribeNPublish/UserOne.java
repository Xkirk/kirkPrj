package designPatterns.subscribeNPublish;

/**
 * Created by kirk on 2017/3/14.
 */
public class UserOne implements Subscribe {
    public void update() {
        System.out.println("UserOne Recive!");
    }
}
