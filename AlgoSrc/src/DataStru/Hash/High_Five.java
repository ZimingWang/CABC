package DataStru.Hash;//https://segmentfault.com/a/1190000007065492
//http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=203052
import java.util.*;
class Result{
    int id;
    int value;
    public Result(int id, int value){
        this.id = id;
        this.value = value;
    }
}
public class High_Five {
    public static Map<Integer, Double> getHighFive(Result[] results){
        Map<Integer, Double> map = new HashMap<>();
        //这里pValue的命名,就是每个person都有哪些value。
        Map<Integer, ArrayList<Integer>> pValue = new HashMap<>();
        //对照着ID把成绩塞给对应的人。
        for (Result res : results){
            int id = res.id;
            if (pValue.containsKey(id)){
                //这里curL表示current List
                ArrayList<Integer> curL = pValue.get(id);
                curL.add(res.value);
                pValue.put(id, curL);
            }
            else {
                ArrayList<Integer> curL = new ArrayList<>();
                curL.add(res.value);
                pValue.put(id, curL);
            }
        }
        for (Integer id : pValue.keySet()){
            ArrayList<Integer> list = pValue.get(id);
            //这里写法有些风骚了,就是懒的重写comparator
            Collections.sort(list);
            Collections.reverse(list);
            double value = 0;
            for (int k = 0; k < 5; k++){
                value += list.get(k);
            }
            value = value/5.0;
            map.put(id, value);
        }
        return map;
    }




    public static void main(String[] args) {
        Result r1 = new Result(1, 95);
        Result r2 = new Result(1, 95);
        Result r3 = new Result(1, 91);
        Result r4 = new Result(1, 91);
        Result r5 = new Result(1, 93);
        Result r6 = new Result(1, 105);
        Result r7 = new Result(2, 6);
        Result r8 = new Result(2, 6);
        Result r9 = new Result(2, 7);
        Result r10 = new Result(2, 6);
        Result r11 = new Result(2, 6);
        Result[] arr = {r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11};
        Map<Integer, Double> res = getHighFive(arr);

        System.out.println(res.get(1) + " " +res.get(2));
    }
}
