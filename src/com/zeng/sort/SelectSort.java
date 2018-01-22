package com.zeng.sort;

/**
 * 从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处，第二次找到第二小的值。
 * 具体是如何实现呢？
 * 第一轮是0索引上的数据依次跟后面各个索引上的数据进行比较，直到遇到一个比它小的数据，这时候，
 * 这个小的数据就替换掉0索引上原来的数据，
 * 接着这个替换掉的数据继续跟它原来的索引位置的后面的索引上的数据进行比较也就是说，进行完第一轮后，
 * 0索引上的数据肯定是这个数组上最小的数据
 * 第二轮接着就是1索引上的数据来跟后面的数据进行比较，这个时候参与比较的数据比原来少了一个
 * 第三轮又会少一个，这样循环一轮j的值就会+1，也就是j开始的索引下标+1。
 */
public class SelectSort {
    public static void main(String[] args) {
        int number[] = {49, 38, 65, 97, 76, 13, 27, 14, 10};
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
            for (int j = 0; j < number.length; j++) {
                System.out.print(number[j] + "\t");
            }
            System.out.println("第" + (i + 1) + "次排序后的结果");

        }
    }
}
