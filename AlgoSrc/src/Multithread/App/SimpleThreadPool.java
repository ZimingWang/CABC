package Multithread.App;

/**
 * Created by wangziming on 10/31/16.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class SimpleThreadPool {
}


class MyRunnable implements Runnable{
    @Override
    public void run() {

        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"::"+i);
        }
    }
}

 class ThreadPoolDemo {

    public static void main(String[] args) {
        //创建线程池对象

        ExecutorService service = Executors.newFixedThreadPool(2);
        //执行Runnable对象代表的线程
        service.submit(new MyRunnable());
        service.submit(new MyRunnable());
        //关闭线程池
        service.shutdown();
    }
}