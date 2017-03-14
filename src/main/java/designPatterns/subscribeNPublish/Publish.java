package designPatterns.subscribeNPublish;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kirk on 2017/3/14.
 */
public abstract class Publish  {
    private List<Subscribe> userlist = new ArrayList<Subscribe>();

    public void attach(Subscribe subscribe) {
        userlist.add(subscribe);
    }

    public void detach(Subscribe subscribe) {
        userlist.remove(subscribe);
    }

    public void Notify() {
        for (Subscribe s :
                userlist) {
            s.update();
        }
    }
}
