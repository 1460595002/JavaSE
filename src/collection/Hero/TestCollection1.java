package collection.Hero;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/8 0008
 * Time: 21:26
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TestCollection1 {

    @Test
    public void test() {

        //对于没有加泛型的集合什么类型的对象都可添加
        List heros = new ArrayList();
        heros.add(new Hero("gareen"));
        heros.add(new item("冰仗"));


        //对象转向会出现问题
        Hero h1 = (Hero) heros.get(0);
        //尤其容器放了多个对象时候，就记不清楚那个位置的对象是什么数据类型了
        Hero h2 = (Hero) heros.get(1);


        //引入泛型Generic
        //声明泛型的时候就就指定了集合只能放Hero，放其他会出错
        List<Hero> heros2 = new ArrayList<>();
        heros2.add(new Hero("提莫"));
        //不能放除了Hero以外的对象，因为声明集合的时候就添加了泛型Hero
//        heros2.add(new item());


        //除此之外还能放Hero的子类 并且在取出数据的时候，不需要再进行转型了，因为里面肯定是放的Hero或者其子类


    }


    //设计一个ArrayList，使得这个ArrayList里，又可以放Hero，又可以放Item,但是除了这两种对象，其他的对象都不能放
    @Test
    public void test1() {
        //泛型是lol接口 Hero与item都实现了这个接口 这个集合两个对象都可以存放
        List<lol> hero = new ArrayList<>();
        hero.add(new Hero("Gareen"));
        hero.add(new item("冰仗"));


    }


    //集合的遍历

    //for循环遍历
    @Test
    public void test2() {
        List<Hero> heros = new ArrayList<>();
        //初始化五个元素
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("英雄" + i));

        }


        //获取heros容器中的元素
        for (int i = 0; i < heros.size(); i++) {
            //获取容器中的所有元素
            heros.get(i);
            System.out.println(heros.get(i));


        }
    }


    //通过迭代器遍历集合
    @Test
    public void test3() {
        List<Hero> heroes = new ArrayList<>();
        //初始化5个元素
        for (int i = 0; i < 5; i++) {
            heroes.add(new Hero("英雄" + i));

        }

        //使用迭代器
        System.out.println("-----使用while的iteration-------");
        Iterator<Hero> it = heroes.iterator();
        //从最开始位置判断下个“下一个”位置是否有数据
        //如果有数据通过next取出来，并把指针往下移动
        //直到下一个位置没有数据
        while (it.hasNext()) {
            System.out.println(it.next());

        }

        //迭代器for的写法
        System.out.println("-----迭代器for的写法-----------");
        for (Iterator<Hero> iterator = heroes.iterator(); iterator.hasNext(); ) {

            Hero hero = iterator.next();
            System.out.println(hero);
        }

        System.out.println("------增强for循环------");
        //增强for循环
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }


    //通过遍历的手段，删除掉名字编号是8的倍数的对象
    @Test
    public void test9() {
        List<Hero>heroes=new ArrayList<>();

        for (int i=0;i<100;i++){

            heroes.add(new Hero("英雄"+i));
        }
//        System.out.println("heros中的集合对象分别是："+heroes);

      //准备一个集合放8的倍数
        List<Hero> remove8=new ArrayList<>();
        for (Hero hero: heroes){
            int id = Integer.parseInt(hero.name.substring(10));
            if (0==id%8){
                remove8.add(hero);
            }
        }

//               for (Hero hero: remove8){
//            heroes.remove(hero);
//
//        }
        heroes.removeAll(remove8);

        System.out.println(heroes);






    }


}

