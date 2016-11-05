package DataStru.Linkedlist;//https://segmentfault.com/a/1190000007065373


import java.util.*;
class RandomListNode{
    int val;
    RandomListNode next;
    RandomListNode random;
    public RandomListNode(int val){
        this.val = val;
        next = null;
        random = null;
    }
}
public class Deep_Copy_List {
    public static RandomListNode deepCopy(RandomListNode head){
        //建一个对应的映射表
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode point = head;
        while (point != null){
            //来一个,建一个
            RandomListNode cur = new RandomListNode(point.val);
            map.put(point, cur);
            point = point.next;
        }
        point = head; //复位
        while (point != null){
            //开始了复制的旅程
            map.get(point).next = map.get(point.next);
            map.get(point).random = map.get(point.random);
            point = point.next;
        }
        return map.get(head);
    }
    //这题非常自信的不测试了
    public static void main(String[] args) {

    }
}
