package collection.Hero;

import org.junit.Test;

import java.util.ArrayList;


/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/8 0008
 * Time: 17:15
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TestCollection {


   @Test
    public void test1(){
       ArrayList  heros=new ArrayList();


       for (int i=0;i<=5;i++){
           heros.add(new Hero("hero"+i));
       }

       System.out.println(heros);

       //方式二：

       //创建要追加的对象 在指定的位置追加对象
       Hero hero1=new Hero("盖伦提莫");
       heros.add(3,hero1);
       System.out.println(heros);

       //通过contaios判断对象是否在容器当中
       //是同一个对象不是同一名字
       System.out.println("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
       System.out.print(heros.contains(new Hero("hero 1")));

       System.out.print("然而对hero1的判断，则返回的是：");
       System.out.println(heros.contains(hero1));
   }



   //获取指定对象的位置
   @Test
    public  void test(){
       ArrayList heros=new ArrayList();


       //初始化5个对象
       for (int i=0;i<=5;i++){

           heros.add(new Hero("英雄"+i));
       }
       System.out.println(heros);

       Hero hero=new Hero("特殊英雄");
       heros.add(hero);
       System.out.println(heros);


       //获取指定位置的英雄
       System.out.println(heros.get(6));





   }

   //指定位置的对象
   @Test
    public void test3(){
       ArrayList heros=new ArrayList();


       //初始化5个对象
       for(int i=0;i<5;i++){
           heros.add(new Hero("英雄"+i));

       }
       System.out.println("初始化5个英雄是："+heros);

       Hero hero=new Hero("特殊英雄");
          heros.add(hero);
       System.out.println(heros);

       //获取指定英雄的位置
       System.out.println(heros.indexOf(hero));


       //新英雄 “英雄1”虽然和原集合中的“英雄”相同但是它的位置是：
       System.out.println(heros.indexOf(new Hero("英雄 2")));


   }

   @Test
    public void  test4(){

       ArrayList heros=new ArrayList();

       //初始化5个对象
       for (int i=0;i<5;i++){
           heros.add(new Hero("英雄"+i));


       }
       System.out.println(heros);

       Hero hero=new Hero("特殊英雄");
       heros.add(hero);

       System.out.println(heros);



       //删除指定位置的英雄
       System.out.println(heros.remove(3));
       System.out.println(heros);
       //删除指定对象通过引用
       System.out.println(heros.remove(hero));
       System.out.println(heros);
   }

   @Test
    public void test5(){
       ArrayList heros=new ArrayList();

        //初始化5个元素
       for(int i=0;i<5;i++){
           heros.add(new Hero("英雄"+i));

       }
       System.out.println(heros);

       System.out.print("替换指定下标的数据：");
       System.out.println(heros.set(2,"提莫"));
       System.out.println("替换后的数据是："+heros);

       //集合的大小
       System.out.println("heros集合的大小是："+heros.size());





   }



   @Test
    public void test6(){
       ArrayList heros =new ArrayList();

       for (int i=0;i<5;i++){
           heros.add(new Hero("英雄"+i));
       }
       System.out.println("heros中的数据："+heros);

       ArrayList arrayList=new ArrayList();
       arrayList.add("英雄a");
       arrayList.add("英雄b");
       arrayList.add("英雄c");
       System.out.println("arrayList中的数据："+arrayList);
       //把另外一个容器的所有元素都加进来
       heros.addAll(arrayList);
       System.out.println("把另一个ArrayList的元素都加入到当前ArrayList:");
       System.out.println("ArrayList heros:\t" + heros);


      //清空集合中的所有数据
       heros.clear();
       System.out.println("heros清空后"+heros);


   }

   //如果就是要判断集合里是否存在一个 name等于 "hero 1"的对象，
   @Test
    public void test7(){


       ArrayList heros=new ArrayList();
         //初始化5个对象
       for (int i=0;i<5;i++){
           heros.add(new Hero("英雄"+i));
       }
       System.out.println(heros);
         String name="英雄1";
         //查找heros是否又英雄1
       for (int i=0;i<heros.size();i++){
          Hero o = (Hero) heros.get(i);
           if (name.equals(o.name)){
               System.out.printf("找到了%s在heros集合中",name);
               break;
           }

       }


    }



}
