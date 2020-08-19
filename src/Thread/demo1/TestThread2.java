package Thread.demo1;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/16 0016
 * Time: 15:46
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//练习Thread，实现多线程同步下载图片
public class TestThread2 implements Runnable{

    private  String name;
    private String url;

    public TestThread2(String name ,String url){
        this.name=name;
        this.url=url;
    }

    @Override
    public void run() {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downloader(url,name);

        System.out.println("文件下载中"+name);
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("4.jpg", "http://www.zto56.com/images/page/recruit-xuanjiang.png");
        TestThread2 t2 = new TestThread2("5.jpg", "http://www.zto56.com/images/page/recruit-xuanjiang.png");
        TestThread2 t3 = new TestThread2("6.jpg", "http://www.zto56.com/images/page/recruit-xuanjiang.png");

        //启动线程
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }
}

//下载器
class WebDownLoader{

    //下载方法
    public void downloader(String url,String name){

        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader出错了！");
        }
    }
}
