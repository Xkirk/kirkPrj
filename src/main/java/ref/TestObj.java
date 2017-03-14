package ref;

/**
 * Created by kirk on 2017/3/12.
 */
public class TestObj {
    public static void main(String args[]){
        Obj  o = new Obj();
        Obj newo = changeO(o);
        System.out.println(newo.getA());
    }

    public static Obj changeO(Obj o) {
        Obj b = o ;

        return b;
    }


}
