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
public class SingletonTest2 {

    public static void main(String[] args) {

    }
}
//懒汉式
class  Bank2{
    //构造方法进行私有化
    private  Bank2(){

    }

    //定义类对象 ，懒汉的不进行初始化
    //此对象必须是static的
    private static  Bank2 bank;


    //提供静态公共的方法，如果有对象调用就对对象进行初始化
    public static  Bank2 getBank(){
        if (null==bank){
            bank=new Bank2();
        }

        return bank;
    }

}