package java4;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/3 0003
 * Time: 22:12
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public interface InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
//		Flyable.MIN_SPEED = 2;

        Plane plane = new Plane();
        plane.fly();
    }
}


interface Flyable{

    //全局常量
    public static final int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;//省略了public static final

    //抽象方法
    public abstract void fly();
    //省略了public abstract
    void stop();


    //Interfaces cannot have constructors
//	public Flyable(){
//
//	}
}

interface Attackable{

    void attack();

}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }

}

abstract class Kite implements Flyable{

    @Override
    public void fly() {

    }

}

class Bullet extends Object implements Flyable,Attackable,CC{

    @Override
    public void attack() {
        // TODO Auto-generated method stub

    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub

    }

    @Override
    public void method1() {
        // TODO Auto-generated method stub

    }

    @Override
    public void method2() {
        // TODO Auto-generated method stub

    }

}
//************************************

interface AA{
    void method1();
}
interface BB{

    void method2();
}

interface CC extends AA,BB{

}
