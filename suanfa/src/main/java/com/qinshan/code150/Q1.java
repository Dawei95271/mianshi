package com.qinshan.code150;

import java.lang.reflect.Array;
import java.util.Arrays;


/**
 * https://leetcode.cn/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 * 88. 合并两个有序数组
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * <p>
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * <p>
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，
 * 其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */
public class Q1 {

    public static void main(String[] args) {


    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, t = 0; i < m + n; i++, t++) {
            nums1[i] = nums2[t];
        }

        Arrays.sort(nums1);

//        for (int i = 0; i < nums1.length; i++) {
//            int index = 0;
//            for (int j = 0; j < nums1.length - i; j++) {
//                if (nums1[index] < nums1[j]) {
//                    index = j;
//                }
//            }
//            swap(nums1, index, nums1.length - i - 1);
//        }

    }

    private void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }


}
