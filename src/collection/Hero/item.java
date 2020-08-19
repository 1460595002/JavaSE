package collection.Hero;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/8 0008
 * Time: 21:23
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class item implements  lol{

    String name;
    float price;
    public item(){

    }

    public  item(String name){
     this.name=name;
    }

    public String toString(){
        return name;
    }


}
