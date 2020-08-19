package Thread.demo1;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;


public class TestCallable implements Callable {
    private  String name;
    private String url;

    public TestCallable(String name ,String url){
        this.name=name;
        this.url=url;
    }

    @Override
    public Boolean call() {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downloader(url,name);

        System.out.println("文件下载中"+name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestThread2 t1 = new TestThread2("7.jpg", "http://www.zto56.com/images/page/recruit-xuanjiang.png");
        TestThread2 t2 = new TestThread2("8.jpg", "http://www.zto56.com/images/page/recruit-xuanjiang.png");
        TestThread2 t3 = new TestThread2("9.jpg", "http://www.zto56.com/images/page/recruit-xuanjiang.png");


        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);

        //执行代码
        Future<Boolean> r1 = (Future<Boolean>) ser.submit(t1);
        Future<Boolean> r2 = (Future<Boolean>) ser.submit(t2);
        Future<Boolean> r3 = (Future<Boolean>) ser.submit(t3);

        //获取结果
        Boolean rs1 = r1.get();
        Boolean rs2 = r2.get();
        Boolean rs3 = r3.get();

        //关闭服务
        ser.shutdown();


    }
}

//下载器
class WebDownLoader1{

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
