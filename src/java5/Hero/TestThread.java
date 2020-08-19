package java5.Hero;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/5 0005
 * Time: 15:29
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TestThread {

    public static void main(String[] args) {
        Hero gareen=new Hero();
        gareen.name="盖伦";
        gareen.hp=616;
        gareen.damage=50;
        Hero teemo=new Hero();
        teemo.hp=300;
        teemo.damage=30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        //盖伦攻击提莫
        //如果提莫还有血就攻击成功
        while (!teemo.isDead()){
            gareen.attckHero(teemo);
        }
        //上京猎人攻击盲僧
        while (!leesin.isDead()){
            bh.attckHero(leesin);
        }


    }
}
