package collection.exer;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/8 0008
 * Time: 20:38
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class GiantDragon {

    //构造私有化
    private GiantDragon() {
    }

   //对象私有
    private static volatile GiantDragon giao;

    //通过外部访问的方法
    public static GiantDragon getInstance(){

        if(giao==null){

              synchronized (GiantDragon.class){
                  if (giao==null){
                  giao=new GiantDragon();
              }
          }

        }

        return giao;
    }
}
