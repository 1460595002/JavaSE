package collection03.demo;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/19 0019
 * Time: 14:37
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class MyGenericClass<MVP> {
    //没有MVP类型，在这里代表位置 一种类型，未来传递什么类型就是什么类型
    private MVP mvp;

    public MyGenericClass() {


    }

    public MyGenericClass(MVP mvp) {

        this.mvp = mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }

    public  MVP getMvp(){
        return mvp;
    }
}
