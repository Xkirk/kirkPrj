package dataStructure.chain;

/**
 * Created by kirk on 2017/2/21.
 */
public class Chain<Integer> {
    private Integer value;

    private Chain next;

    public Integer getValue() {
        return value;
    }

    public Chain getNext() {
        return next;
    }

    public Chain(Integer value) {
        this.value = value;
        this.next = null;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setNext(Chain next) {
        this.next = next;
    }
}

