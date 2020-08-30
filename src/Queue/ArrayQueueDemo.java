package Queue;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/8/30 0030
 * Time: 09:46
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class ArrayQueueDemo {

    public static void main(String[] args) {

        //测试一把
        //创建一个队列
        ArrayQueue arrayQueue = new ArrayQueue(5);

        char key=' ';//接收用户的输入
        Scanner scanner=new Scanner(System.in);
        boolean loop=true;

        //输出一个菜单
        while (loop){
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头的数据");

            key=scanner.next().charAt(0);//接收一个字符

            switch (key){

                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                case 'g'://取出数据

         try {
             int queue = arrayQueue.getQueue();
             System.out.printf("队列头的数据是%d\n", queue);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }
           break;

                case 'e':
                    scanner.close();
                    loop=false;
                    break;
                default:
                    break;
            }

        }
        System.out.println("程序退出！！！！！");
    }
}

// 使用数组模拟队列-编写一个ArrayQueue类
class ArrayQueue{
    private int maxSize;//表示数组的最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int []arr;//该数据用于存放数据，模拟队列

    //创建队列的构造器

    public ArrayQueue(int arrMaxSize) {
       maxSize=arrMaxSize;
       arr=new int[maxSize];
       front=-1; //指向队列头部，分析出front是指向队列头部前一个位置
       rear=-1; //指向对垒尾，指向队列尾的数据（即就是队列最后的一个数据）
    }

    //判断队列是否满
    public boolean isFull(){
        return rear==maxSize-1;
    }
    //判断队列是否空
    public boolean isEmpty(){
        return rear==front;
    }

    //添加数据到队列
    public void addQueue(int n){
        //判断队列是否满
        if (isFull()){
            System.out.println("队列已经满了。。。");
            return;
        }
        rear++;
        arr[rear]=n;
    }
  //获取队列的数据，出队列
    public int getQueue(){
        //判断是否为空
        if (isFull()){
            throw  new RuntimeException("队列空，不能获取数据！！！");
        }
       front++;

        return arr[front];
    }

    //显示队列的所有的数据
    public void showQueue(){

        //遍历
        if (isEmpty()){
            System.out.println("队列是空的没有数据！");
            return;
        }

        for (int i  = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

    //显示队列的头数据，注意不是取出数据
    public int headQueue(){
        //判断
        if(isEmpty()){
            throw  new RuntimeException("队列空的。没有数据取出·~~");

                    }
        return arr[front+1];

    }
}

