package reflection.demo2;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/15 0015
 * Time: 09:19
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Creature<S> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }
    public void eat(){
        System.out.println("生物吃東西");
    }
}
