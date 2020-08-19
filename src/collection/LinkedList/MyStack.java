package collection.LinkedList;

import collection.Hero.Hero;
import org.junit.Test;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/9 0009
 * Time: 15:36
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class MyStack implements Stack {

    LinkedList<Hero>heros=new LinkedList<>();
    @Override
    public void push(Hero hero) {
        heros.addLast(hero);
    }

    @Override
    public Hero pull() {


        return   heros.removeLast();
    }

    @Override
    public Hero peek() {
        return heros.getLast();
    }


    @Test
    public void test(){
        MyStack heroStack = new MyStack();
        for (int i = 0; i < 5; i++) {
            Hero h = new Hero("hero name " + i);
            System.out.println("压入 hero:" + h);
            heroStack.push(h);
        }
        for (int i = 0; i < 5; i++) {
            Hero h =heroStack.pull();
            System.out.println("弹出 hero" + h);
        }







    }

}
