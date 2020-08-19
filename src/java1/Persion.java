package java1;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/2 0002
 * Time: 09:55
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Persion {

    String name;

    int age;



    public  Persion(){

    }

    public  Persion(String name,int age){
        this.name=name;
        this.age=age;
    }

     void eat(){
        System.out.println("在吃饭！");
     }

     public void walk(int distance){
        System.out.println("今天走路的距离是："+distance+"公里");

        eat();

     }

     private  void show(){
        System.out.println("一个人我是这个方法被privata了");
     }



}
