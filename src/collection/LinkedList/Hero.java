package collection.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/9 0009
 * Time: 22:55
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Hero {
   String name;

   float hp;
    public Hero(){

    }
    public Hero(String name,float hp){
        this.name=name;
        this.hp=hp;
    }


    public String toString() {
        return String.format("[name:%s hp:%.0f]%n", name,hp);
    }


}
