package Multithread.ProConsu;

/**
 * Created by wangziming on 10/31/16.
 */
public class StudentGetSet {
}




//学生实体类作为共享资源
class Student {
    private String name;// 姓名
    private int age;// 年龄
    boolean flag;// 标记变量,判断当前学生对象是否已创建赋值好

    //生产者的功能  ,为studnet对象赋值
    public synchronized void set(String name, int age) {

        if (this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        this.age = age;

        this.flag = true;
        this.notify();
    }

    //消费者的功能,打印sutdent对象的内容
    public synchronized void get() {
        if (!this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + ":::" + age);

        this.flag = false;
        this.notify();
    }

}

// 模拟生产者线程类
class SetStudent implements Runnable {

    // 共享资源s
    private Student s;
    private int x = 0;

    public SetStudent(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                s.set("郭靖", 27);
            } else {
                s.set("黄蓉", 18);
            }
            x++;
        }
    }

}

// 模拟消费者线程类
class GetStudent implements Runnable {

    // 共享资源s
    private Student s;

    public GetStudent(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            s.get();
        }
    }

}

// 测试类
 class Demo03{

    public static void main(String[] args) {
        Student s = new Student();

        SetStudent ss = new SetStudent(s);
        GetStudent gs = new GetStudent(s);

        Thread t1 = new Thread(ss, "生产者");
        Thread t2 = new Thread(gs, "消费者");

        t1.start();
        t2.start();
    }

}