package java1;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/2 0002
 * Time: 10:00
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Student extends Persion {

    String major;

    public Student(){

    }

    public Student(String major){
       this.major=major;
    }

    public  void study(){
   System.out.println("学习的专业是软件工程");
    }

    //对父类重写eat方法
    void  eat(){
        System.out.println("学生要补充营养，多补脑！");
    }


    public void show(){
        System.out.println("我是一个学生");
    }

    public void walk(int distabce){
        System.out.println("重写的方法！"+distabce);
    }





}
