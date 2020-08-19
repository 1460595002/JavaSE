package collection.Hero;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/8 0008
 * Time: 17:15
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Hero implements lol{

    float hp;
    String name;

    public Hero(){

    }

   public Hero(String name){
        this.name=name;
   }
    @Override
    public String toString() {
        return name;
    }
}
