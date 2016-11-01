package Multithread.App;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
//http://www.cnblogs.com/fingerboy/p/5351650.html

public class TimerDelete {
}



class MyTask extends TimerTask{
    /**
     * 定时删除指定位置的文件,(这里以删除f盘下aa文件夹的所有文件为例)
     */
    @Override
    public void run() {
        File file=new File("f://aa");
        deleteFolder(file);
    }

    public void deleteFolder(File file){
        File[] files=file.listFiles();
        for(File f:files){
            if(f.isDirectory()){
                //使用递归
                deleteFolder(f);
            }else{
                f.delete();
            }
        }
        file.delete();
    }

}
 class TimerDemo {

    public static void main(String[] args) throws ParseException {
        //创建定时器对象
        Timer t=new Timer();
        String time="2016-04-04 11:26:40";
        Date d=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time);
        t.schedule(new MyTask(), d);
    }
}