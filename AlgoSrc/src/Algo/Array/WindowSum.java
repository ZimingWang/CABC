package Algo.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangziming on 10/16/16.
 */
class A{}
public class WindowSum {
    public A[] tt(){
        return null;
    }
    public static void main(String[] arr){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(getSum(a,2));


    }
    public static List<Integer> getSum(List<Integer> a, int k){
        if (a == null || a.size() == 0 || k <= 0){
            return new ArrayList<>();
        }
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < a.size(); i++){
            count++;
            if (count >= k){
                int res = 0;
                for (int j = i; j >= i - k + 1; j--){
                    res += a.get(j);
                }
                result.add(res);
            }
        }
        return result;
    }


    //注意(arraylist == null || arraylist.size() == 0)
    // 要return一个已经初始化的arrayList而不是null，否则会有一个test case过不去



}
/*
* public static List<Integer> GetSum(List<Integer> A, int k) {
        ArrayList<Integer> result  = new ArrayList<>();
        if (A == null || A.size() == 0 || k <= 0) return result;
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            count++;
            if (count >= k) {
                int sum = 0;
                for (int j = i; j >= i - k + 1; j--) {
                    sum += A.get(j);
                }
                result.add(sum);
            }
        }
        return result;
    }
*
*
* */
/*
*  public static List<Integer> GetSum(List<Integer> A, int k) {
        ArrayList<Integer> result  = new ArrayList<>();
        if (A == null || A.size() == 0 || k <= 0) return result;
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            count++;
            if (count >= k) {
                int sum = 0;
                for (int j = i; j >= i - k + 1; j--) {
                    sum += A.get(j);
                }
                result.add(sum);
            }
        }
        return result;
    }

*
*
*
* */

/*
* public class SumOfWindow {
        public int[] Solution(int[] array, int k) {
            if (array == null || array.length < k || k <= 0)    return null;
            int[] rvalue = new int[array.length - k + 1];
            for (int i = 0; i < k; i++)
                rvalue[0] += array[i];
            for (int i = 1; i < rvalue.length; i++) {
                rvalue[i] = rvalue[i-1] - array[i-1] + array[i+k-1];
            }
            return rvalue;
        }
    }
*
*
* */

