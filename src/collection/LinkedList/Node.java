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
public class Node {


    //左子节点
    public  Node leftNode;
    //右子节点
    public  Node reghtNode;
    //值
    public  Object value;



  //增加方法
    public void add(Object values){
        if (value==null){
            value=values;
        }else {
         if ((int)value-(int)values>=0){
             if (leftNode==null){
                 leftNode=new Node();
             }
             leftNode.add(values);

         }else {
             if (reghtNode==null){
                reghtNode =new Node();
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

        int[] i=new int[]{54,548,84,6,34,255,98,88};

        Node node=new Node();

       for (int number : i){
           node.add(number);
       }


        System.out.println(node.values());




    }


}
