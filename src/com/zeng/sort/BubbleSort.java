package com.zeng.sort;

/**
 * 基本思想:
 * 在要排序的一组书中，对当前还未拍好序的范围内的数组，自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。
 * 即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 * 第一次比较排序的结果：会把其中最大的数据排到最大的索引处；
 * 第二次比较排序后的结果：因为第一次已经把最大的一个数据放到了最大的索引的地方，所以这次要进行比较的数据比数组里面的元素的数据个数-1个，
 * 而第二大的数据也会排到第二大的索引处；
 * 第三次比较排序的结果：跟第二次差不多，只是这次要进行比较的数据比数组里面的元素的数据个数还少了2个；
 * 第四次：少3个...；
 * 综上所述，要使数组里面的数据按照从小到大排序，总的比较的次数会比数组的长度-1次，而随着比较的次数的增加，每次要进行比较的数据依次减少。
 */
public class BubbleSort {
    public static void main(String[] args) {
        int number[]={49,38,65,97,76,13,27,14,10};
        for (int i = 0; i <number.length ; i++) {
            for (int j = 0; j <number.length-i-1 ; j++) {
                if(number[j]>number[j+1]) {
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
            for (int j = 0; j < number.length; j++) {
                System.out.print(number[j]+"\t");

            }
            System.out.println("排序"+(i+1)+"次后的结果");
        }
    }
}
