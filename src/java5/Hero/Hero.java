package java5.Hero;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/5 0005
 * Time: 15:25
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Hero {

    public String name;
    public float hp;

    public int damage; //伤害

    //攻击方法
    public void attckHero(Hero h){
        try {
            //攻击需要时间
            Thread.sleep(100);
        }catch (InterruptedException e){

            e.printStackTrace();
        }

        h.hp=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);

        if(h.isDead()){
            System.out.println(h.name +"死了！");
        }

    }
    public boolean isDead() {
        return 0>=hp?true:false;
    }

}
