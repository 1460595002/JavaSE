package collection.LinkedList;

import collection.Hero.Hero;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/9 0009
 * Time: 15:34
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public interface Stack {

    //把英雄推入最后一个位置
    public  void push(Hero hero);
    //把最后后一个英雄取出来
    public Hero pull();
    //查看最后一个英雄
    public Hero peek();




}
