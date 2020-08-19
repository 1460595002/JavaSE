package collection.LinkedList;


import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/9 0009
 * Time: 20:07
 * E-mail:1460595002@qq.com
 * 类说明:二叉树排序-插入数据
 */
public class Node1 {


    //左子节点
    public Node1 leftNode;
    //右子节点
    public Node1 reghtNode;
    //值
    public  Object value;



  //增加方法
    public void add(Object values){
        if (value==null){
            value=values;
        }else {
         if ((int)value-(int)values>=0){
             if (leftNode==null){
                 leftNode=new Node1();
             }
             leftNode.add(values);

         }else {
             if (reghtNode==null){
                reghtNode =new Node1();
             }
             reghtNode.add(values);
         }

        }

    }
   //中序遍历所有节点
   public List<Object> values(){
       ArrayList<Object> values=new ArrayList<>();

        //左节点
       if (leftNode!=null){
             values.addAll(leftNode.values());

       }
        //当前节点
       values.add(value);
       //右节点
       if (reghtNode!=null){
           values.addAll(reghtNode.values());
       }

   return values;

   }

    public static void main(String[] args) {
        ArrayList<Hero>heros=new ArrayList<>();

        for (int i=0;i<10;i++){

            heros.add(new Hero("hero"+i,(int)Math.random()*100));

        }


        System.out.println(heros);


    }


}
