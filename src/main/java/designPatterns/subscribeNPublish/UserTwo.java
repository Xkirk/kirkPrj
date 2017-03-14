package designPatterns.subscribeNPublish;

/**
 * Created by kirk on 2017/3/14.
 */
public class UserTwo implements Subscribe {
    public void update() {
        System.out.println("UserTow Recive!");
    }
}
