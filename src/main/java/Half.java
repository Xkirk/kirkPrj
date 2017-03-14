import groovy.ui.SystemOutputInterceptor;
import org.apache.velocity.context.InternalContextAdapter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by kirk on 2017/2/19.
 */
public class Half {
    public static void main(String args[]) {
        Random x = new Random();
       int xxx = x.nextInt(3);
//       System.out.println(xxx);
        List<String> list =generate();
        int xx = binarySearch(list, 1);
        System.out.println(xx);

    }
    public static List<String> generate() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            list.add(String.valueOf(i));
        }
        return list;
    }
    public static boolean Binary(List<String> list,String target){

        boolean flag=true;
        return flag;
    }
    public static int binarySearch(List<String> list,int des){
        //第一个位置.
        int low=0;
        //最高位置.数组长度-1,因为下标是从0开始的.
        int high=list.size()-1;
        //当low"指针"和high不重复的时候.
        while(low<=high){
            //中间位置计算,low+ 最高位置减去最低位置,右移一位,相当于除2.也可以用(high+low)/2
            int middle=low+((high-low)>>1);
            int target = new Integer(list.get(middle));
            //与最中间的数字进行判断,是否相等,相等的话就返回对应的数组下标.
            if(des== target){
                return middle;
                //如果小于的话则移动最高层的"指针"
            }else if(des<target){
                high=middle-1;
                //移动最低的"指针"
            }else{
                low=middle+1;
            }
        }
        return -1;
    }
}
