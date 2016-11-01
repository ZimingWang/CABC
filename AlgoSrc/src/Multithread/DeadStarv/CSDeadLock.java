package Multithread.DeadStarv;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by wangziming on 10/30/16.
 */
public class CSDeadLock {

}



// Client 和 Server 分别写 读
/*
* 互斥；Server端和Client端都既是生产者，也是消费者，互斥的使用两个TCP缓冲队列。
请求与保持；由于write方法每次写8KB，而read方法每次只读1B，所以两个缓冲队列都很快被填满。此时，两端都请求空的缓冲区，并保持着对方空缓冲的释放权利。
不剥夺；这两个程序请求资源是非抢占式的，显然不会被剥夺。
环路等待；Server端和Client端的程序都阻塞在write，互相等待对方释放空的缓冲区。
解决死锁的办法也很简单，将write和read分离在不同的线程，写归写，读归读，打破环路等待的条件。那样虽然读的比较慢，但死锁是不存了。
将读写分离成不同线程时，需要特别注意：不要在Socket对象上加同步锁。这样跟不分离没有实质上的区别。
* */
 class Server {

    public static void main(String[] args) throws Exception {
        int count = 0;
        // serversocket
        ServerSocket ss = new ServerSocket(6060);

        Socket s = ss.accept();

        while (true) {
            s.getOutputStream().write(new byte[1024 ]);
            s.getInputStream().read();
            System.out.println("server: " + ++count);
        }
    }
}

 class Client {

    public static void main(String[] args) throws Exception {
        int count = 0;
        // 注册
        Socket s = new Socket("localhost", 6060);
        while (true) {
            s.getOutputStream().write(new byte[1024 ]);
            s.getInputStream().read();
            System.out.println("client: " + ++count);
        }
    }
}