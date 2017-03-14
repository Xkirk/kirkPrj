package algorithms;

import java.util.Random;

/**
 * Created by kirk on 2017/3/13.
 */
public class Quicksort {
    public static void main(String args[]) {
        int[] arrays= new int[8];
        for (int i = 0; i < 8; i++) {
            Random r = new Random();
            arrays[i]= r.nextInt(100);
            System.out.print(arrays[i]+",");
        }
        quick_sort(arrays,0,arrays.length-1);
        System.out.println("\n");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+",");
        }
    }
   static void quick_sort(int s[], int l, int r)
    {
        if (l < r)
        {
            //每一次快速排序后,目标应在的位置(目标左边全部比目标小,右边全部比目标大)
            int i = Quicksort.OneQuicksort(s, l, r);
            quick_sort(s, l, i-1); // 递归调用
            quick_sort(s, i+1, r);
        }
    }

    //一次快速排序
    public static int OneQuicksort(int[] array,int left,int right) {
        int l = left;
        int r = right;
        int target = array[l];
        while (l < r) {
            //从右向左寻找比目标值小的位置.当r=l时跳出
            // array[r] >= target表示如果数组最右值大于等于目标,则不作处理,继续循环 r--向左寻找
            while (l < r && array[r] >= target) {
                r--;
            }
                if (l<r) {//此处判断意义:当l=r时发生的循环结束,其实是并未找到比目标值大的位置.因此不执行if中的操作
                    int tmp = array[r];
                    array[r] = array[l];
                    array[l] = tmp;
                    l++;
                }
            //从左向右寻找比目标值大的位置.当l=r时跳出
            while (l < r&&array[l] <= target) {
                l++;
            }
                if (l<r) {//此处判断意义:当l=r时发生的循环结束,其实是并未找到比目标值大的位置.因此不执行if中的操作
                    int tmp = array[r];
                    array[r] = array[l];
                    array[l] = tmp;
                    r--;
                }
        }
        //返回目标最终应在的位置.
        return l;
    }
}
