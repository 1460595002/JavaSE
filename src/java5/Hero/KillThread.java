package java5.Hero;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/5 0005
 * Time: 15:42
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class KillThread extends Thread{

    private Hero h1;
    private Hero h2;
    public KillThread(Hero h1,Hero h2){
        this.h1=h1;
        this.h2=h2;
    }


    public void run(){
        while (!h2.isDead()){
            h1.attckHero(h2);
        }
    }
}
