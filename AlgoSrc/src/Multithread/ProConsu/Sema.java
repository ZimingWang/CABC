package Multithread.ProConsu;

/**
 * Created by wangziming on 10/31/16.
 */


// semaphore例子
// http://www.cnblogs.com/fingerboy/p/5359252.html
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
public class Sema {
}


/**
 * 创建10个线程,最多只能有三个线程同时执行功能代码
 * @author Administrator
 *
 */
 class SemaphoreTest {
    public static void main(String[] args) {
        //创建一个可调整大小的缓冲线程池
        ExecutorService service = Executors.newCachedThreadPool();
        //只能有三个线程同时访问
        final  Semaphore sp = new Semaphore(3);
        //循环创建一个线程
        for(int i=0;i<10;i++){
            Runnable runnable = new Runnable(){
                public void run(){
                    try {
                        //获取一个许可,得到许可就可以往下执行,得不到就阻塞,等待该信号量空出可用的许可
                        sp.acquire();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    //功能代码
                    System.out.println("线程" + Thread.currentThread().getName() +
                            "进入，当前已有" + (3-sp.availablePermits()) + "个并发");
                    try {
                        Thread.sleep((long)(Math.random()*10000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程" + Thread.currentThread().getName() +
                            "即将离开");
                    //执行完功能代码,归还许可
                    sp.release();
                    //下面代码有时候执行不准确，因为其没有和上面的代码合成原子单元
                    System.out.println("线程" + Thread.currentThread().getName() +
                            "已离开，当前已有" + (3-sp.availablePermits()) + "个并发");
                }
            };
            service.execute(runnable);
        }
    }

}