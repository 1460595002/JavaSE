package java3;

/*
 * 单例设计模式：
 * 1. 所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。
 *
 * 2. 如何实现？
 * 	 饿汉式  vs 懒汉式
 *
 * 3. 区分饿汉式 和 懒汉式
 *   饿汉式：
 *   	坏处：对象加载时间过长。
 *   	好处：饿汉式是线程安全的
 *
 *   懒汉式：好处：延迟对象的创建。
 * 		  目前的写法坏处：线程不安全。--->到多线程内容时，再修改
 *
 *
 */
public class SingletonTest1 {

    public static void main(String[] args) {
        Bank bank =Bank.getBank();
        Bank bank1=Bank.getBank();
        //只能实例对象只能出现一次所以bank bank1是同一对象
        System.out.println(bank==bank1);
    }


}

//饿汉式
class Bank {

      //构造方法进行私有化
    private  Bank(){

    }

    //对象进行静态私有化
    private  static  Bank bank=new Bank();  //在声明对象的时候就进行了实例化

    //提供公共的静态方法让外界进行访问对象，
    public  static  Bank getBank(){

        return bank;
    }


}