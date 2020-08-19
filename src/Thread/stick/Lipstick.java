package Thread.stick;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/18 0018
 * Time: 10:20
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Lipstick {

    public static void main(String[] args) {
        Makeup m1  = new Makeup(0, "灰姑娘");
        Makeup m2  = new Makeup(1, "白雪公主");
        m1.start();
        m2.start();
    }
}

//口红
class Destick{

}
//镜子
class Mirror{

}


class Makeup  extends Thread{

    //需要的资源自有一份，用static来保证只有一份
      static  Lipstick lipstick=new Lipstick();
      static Mirror mirror=new Mirror();

      int choice;//选择
    String girlName;//使用化妆品的人

    public Makeup(int choice, String girlName) {
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //化妝
    }
    //化妆，相互持有对方的锁，就是需要拿到对方的资源
  private  void makeup() throws InterruptedException {

        if(choice==0){
            synchronized (lipstick){
                System.out.println(this.girlName+"获取口红的锁");


                    Thread.sleep(1000);
            }

            synchronized (mirror){
                System.out.println(this.girlName+"获取镜子的锁");
            }
        }else {
            synchronized (mirror){
                System.out.println(girlName+"获取镜子的锁");


                Thread.sleep(2000);


            }
            synchronized (lipstick){
                System.out.println(this.girlName+"获取口红的锁");
            }
        }
  }

}