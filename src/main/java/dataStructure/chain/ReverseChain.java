package dataStructure.chain;

/**
 * This class is test how to reverse a chain
 * Created by kirk on 2017/3/12.
 */
public class ReverseChain {
    public static void main(String args[]){
        Chain chain = new Chain(1);
        chain.setNext(new Chain(2));
        chain.getNext().setNext(new Chain(3));
        Chain newchain = reverse(chain);
        while (newchain!=null) {
            System.out.println(newchain.getValue());
            newchain = newchain.getNext();
        }
    }
    /**
     * pre
     *  ↑
     * cur
     * tmp
     *
     */
    public static Chain reverse(Chain chain){
        Chain pre = chain;//当前节点的前节点
        Chain cur = chain.getNext();//当前节点
        chain.setNext(null);
        Chain tmp ;
        while (cur!=null){
            tmp = cur.getNext(); //记录当前节点的后继节点
            cur.setNext(pre); //使当前节点指向它的前节点
            pre = cur;//节点后移
            cur = tmp;//节点后移
        }
        //此时chain为新链表的末尾节点,将它的后继设置为null,pre引用了chain所以改变chain的属性 pre也随之改变
        return  pre;
    }
}
