package Thread.state;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/17 0017
 * Time: 15:26
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//测试守护线程
//上帝守护着你
public class TestDaemon {

    public static void main(String[] args) {
        You you = new You();
        God god = new God();

        Thread thread = new Thread(god);
         thread.setDaemon(true);//设置守护线程，默认为false
        thread.start();//守护线程启动
        new Thread(you).start();//你用户线程启动

    }
}

//你
class You implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <36500 ; i++) {
            System.out.println("你开心的活着！");
        }
        System.out.println("-==========goodbyworld--==============");

    }
}

//上帝
class God implements Runnable{
    @Override
    public void run() {

        while (true){
            System.out.println("上帝守护着你！！！");
        }

    }
}