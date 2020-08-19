package file.filedemo;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/22 0022
 * Time: 07:59
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Demo01DiGui {
    /*
     * 3.构造方法,禁止递归
     * 编译报错:构造方法是创建对象使用的,不能让对象一直创建下去
     */
    public Demo01DiGui() {
        //Demo01DiGui();
    }

    public static void main(String[] args) {
      b(500);
      a();//Exception in thread "main" java.lang.StackOverflowError
    }


    private static void b(int i){
//添加一个递归结束的条件,i==5000的时候结束
        if (i==5000){

            return;//结束方法
        }
        System.out.println(i++);
        b(++i);
    }

    private static void a(){
        System.out.println("我是a方法");
        a();
    }
}
