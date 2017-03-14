import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by kirk on 2017/2/21.
 */
public class Test {
    public Person p = new Person();
    Integer i = 129;

    public Integer getI() {

        return i;
    }

    public Person p1 = new Person();
    public  void met(Person p1){
        Person x = p;
        x.setAge("1");
        x.setName("b");
        Integer ii = i;
        ii.valueOf(126);
        System.out.println(ii);
        x= p1;
        ConcurrentHashMap hashMap;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public Person getP() {

        return p;
    }

    public static void main(String args[]) {
        Test t = new Test();
        t.met(new Person());
        System.out.println(t.getP().getAge());
        System.out.println(t.getI());
        System.out.println(1+(1<<1));
    }

}
