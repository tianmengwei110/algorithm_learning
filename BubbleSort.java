/**
 * All rights Reserved, Designed by www.rongdasoft.com
 *
 * @version: V1.0
 * @Title: BubbleSort.java
 * @Description:
 * @author tianmengwei
 * @date 2019-05-24 13:53
 * @Copyright: 2019-05-24 www.rongdasoft.com Inc. All rights reseved.
 */

package com.learning;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author tianmengwei
 * @ClassName: BubbleSort
 * @Description: 冒泡排序
 * @date 2019-05-24 13:53
 */
public class BubbleSort {


    /**
     * 冒泡排序
     *
     * @param arr
     * @return
     */
    private static int[] bubbleSort(int[] arr) {
        //控制排序的趟数
        for (int i = 0; i < arr.length-1; i++) {
            //控制每次排序的次数
            for (int n = i + 1; n < arr.length; n++) {
                //每次比较将最小的放在前面
                //如果是< 则是倒叙
                if (arr[i] > arr[n]) {
                    int tem = arr[i];
                    arr[i] = arr[n];
                    arr[n] = tem;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 32, 21, 3, 43, 8};
        int[] ints = bubbleSort(arr);
        for (int anInt : ints) {
            System.out.print(anInt+"    ");
        }
    }
}