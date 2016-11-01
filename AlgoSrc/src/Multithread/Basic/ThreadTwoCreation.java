package Multithread.Basic;

/**
 * Created by wangziming on 10/30/16.
 */

class MyThread extends Thread{
    private int ticket = 5;
    public void run(){
        for (int i=0;i<10;i++)
        {
            if(ticket > 0){
                System.out.println("ticket = " + ticket--);
            }
        }
    }
}

// 本质new runnable()   可以写为 Thread t = new Thread(new runnable(){public void run(){});
//继承接口就要new thread去执行它
public class ThreadTwoCreation implements Runnable {
    private int ticket = 10;



    // 没有返回,好多条件判断不了
    public void run(){
        for (int i = ticket; i > 0; i--){
            // 类似singleton双重检索
            if (ticket > 0){
                System.out.println(ticket--);
            }
        }
    }
    // run只是仍然顺序执行[下面调run的话,仍然是5 4 3 2 1], start才是过程
    public static void main(String[] argv){
        ThreadTwoCreation a = new ThreadTwoCreation();
        new Thread(a).start();
        new Thread(a).start();
        new Thread(a).start();

        //继承了Thread就直接执行它
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}
