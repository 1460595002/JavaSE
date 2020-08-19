package Thread;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/18 0018
 * Time: 15:04
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Student {
    private String name;
    private int age;
    private boolean flag;//true说明有数据

    public synchronized void set(String name,int age){
        //如果有数据就等待
        if (flag){
            try {
                this.wait();//等待释放锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //设置数据
        this.name=name;
        this.age=age;

        //修改标记
        this.flag=false;
        this.notify();
    }
    public synchronized void get(){
        //如果没有数据就等待
        if(!this.flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(this.name+"----"+this.age);
        // 修改标记
        this.flag = false;
        this.notify();
    }
}
