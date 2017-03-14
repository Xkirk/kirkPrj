package algorithms;

import java.util.Random;

public class Quick {
    public static void main(String args[]) {
        int[] arrays = new int[8];
        for (int i = 0; i < 8; i++) {
            Random r = new Random();
            arrays[i] = r.nextInt(100);
            System.out.print(arrays[i] + ",");
        }
        quick_sort(arrays, 0, arrays.length - 1);
        System.out.println("\n");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + ",");
        }
    }

    static int AdjustArray(int s[], int l, int r) //返回调整后基准数的位置
    {
        int i = l, j = r;
        int x = s[l]; //s[l]即s[i]就是第一个坑
        while (i < j) {
            // 从右向左找小于x的数来填s[i]
            while (i < j && s[j] >= x)
                j--;
            if (i < j) {
                s[i] = s[j]; //将s[j]填到s[i]中，s[j]就形成了一个新的坑
                i++;
            }

            // 从左向右找大于或等于x的数来填s[j]
            while (i < j && s[i] < x)
                i++;
            if (i < j) {
                s[j] = s[i]; //将s[i]填到s[j]中，s[i]就形成了一个新的坑
                j--;
            }
        }
        //退出时，i等于j。将x填到这个坑中。
        s[i] = x;

        return i;
    }

    static void quick_sort(int s[], int l, int r) {
        if (l < r) {
            int i = Quicksort.OneQuicksort(s, l, r);//先成挖坑填数法调整s[]
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }
}