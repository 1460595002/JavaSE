package Thread.state;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/17 0017
 * Time: 14:20
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//线程状态
public class TestState {

    public static void main(String[] args) {
        Thread thread = new Thread(()->{

            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("................");
        });

        //观察状态
        Thread.State state = thread.getState();
        System.out.println(state);

        //观察启动后
        thread.start();//启动线程
        state = thread.getState();
        System.out.println(state);//输出状态



        while (state !=Thread.State.TERMINATED){//只要线程不停止，就一直输出

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            state = thread.getState();//更新线程的状态
            System.out.println(state);//输出状态

        }
    }
}
