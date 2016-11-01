package Multithread.yeild_join;

/**
 * Created by wangziming on 10/31/16.
 */
//http://uule.iteye.com/blog/1101994



//1. t.join(), 保证t执行完之后再往下走,例1
 class JoinTest implements Runnable{

    public static int a = 0;

    public void run() {
        for (int k = 0; k < 5; k++) {
            a = a + 1;
        }
    }

    public static void main(String[] args) throws Exception {
        Runnable r = new JoinTest();
        Thread t = new Thread(r);
        t.start();
        System.out.println(a);
    }
}

//例子2
public class Join {
}
//线程实例的方法join()方法可以使得一个线程在另一个线程结束后再执行。
// 如果join()方法在一个线程实例上调用，当前运行着的线程将阻塞直到这个线程实例完成了执行
 class JoinExample
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t = new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("First task started");
                System.out.println("Sleeping for 2 seconds");
                try
                {
                    Thread.sleep(2000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("First task completed");
            }
        });

        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("Second task completed");
            }
        });

        t.start(); // Line 15
        //t.join(); // Line 16
        t1.start();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////
//t.join(1000);  main线程只等这么久
//Thread.currentThread().getName();
// t.join mian线程先得进入wait才行main 线程调用t.join时，必须能够拿到线程t对象的锁，如果拿不到它是无法wait的 ，
// 刚开的例子t.join(1000)不是说明了main线程等待1 秒，如果在它等待之前，其他线程获取了t对象的锁，则总时间不是1毫秒了

class RunnableImpl implements Runnable {

    public void run() {
        try {
            System.out.println("Begin sleep");
            Thread.sleep(2000);
            System.out.println("End sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadTest extends Thread {

    Thread thread;

    public ThreadTest(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        synchronized (thread) {
            System.out.println("getObjectLock");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("ReleaseObjectLock");
        }
    }
}

 class JoinTests {
    public static void main(String[] args) {
        Thread t = new Thread(new RunnableImpl());
        new ThreadTest(t).start();
        t.start();
        try {
            t.join();
            System.out.println("joinFinish");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}