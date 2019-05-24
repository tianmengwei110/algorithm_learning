/**
 * All rights Reserved, Designed by www.rongdasoft.com
 *
 * @version: V1.0
 * @Title: BinarySearch.java
 * @Description:
 * @author tianmengwei
 * @date 2019-05-24 15:47
 * @Copyright: 2019-05-24 www.rongdasoft.com Inc. All rights reseved.
 */

package com.learning;

/**
 * @author tianmengwei
 * @ClassName: BinarySearch
 * @Description: 二分法查找
 * @date 2019-05-24 15:47
 */
public class BinarySearch {

    /**
     * 在数组里找出跟指定元素相邻的元素
     * ps:首先确保元素是有序的，此次测试的数组元素是正序的
     *
     * @param arr
     * @return
     */
    private static int binarySearch(int params, int[] arr) {

        int begin = 0;
        int end = arr.length - 1;

        while (begin <= end) {

            if (arr[begin] >= params) {
//                return arr[begin];
                    //此处控制返回比入参小的元素
                return arr[begin-1];
            }
            if (arr[end] <= params) {
                return arr[end];
            }

            int middle = (end - begin) / 2;

            if (middle == 0) {
//                return arr[end - begin];
                //此处控制返回比入参小的元素
                return arr[end - begin-1];
            }

            if (arr[middle] > params) {
                end = end - middle;
            } else if (arr[middle] < params) {
                begin = middle + begin;
            } else {
                return arr[middle];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 9, 12, 43, 56, 81};
        System.out.println(binarySearch(4,arr));
        System.out.println(binarySearch(88,arr));
        System.out.println(binarySearch(56, arr));
        System.out.println(binarySearch(16,arr));
        System.out.println(binarySearch(8,arr));
    }
}