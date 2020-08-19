package java2;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/3 0003
 * Time: 14:42
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class CircleTest {


    public static void main(String[] args) {

        Circle c1=new Circle();
        Circle c2=new Circle();

        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println("创建圆的个数："+Circle.getTotal());
    }
}




class Circle{

    private  double redius;
   private  int id;// id自动赋值

    public Circle(){
        id=init++; //给id自动赋值
        total++;
    }


    public  Circle(double redius)
    {
        this();
//        id=init++;
//        total++;
        this.redius=redius;


    }

    private static int total;//创建圆的个数
    private static int init=1001;//声明属性被所有对象所共享



    public double findArea(){
        return Math.PI*redius*redius;
    }


    public void  getRedius(double redius) {
        this.redius=redius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }
}