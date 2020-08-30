package Queue;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/8/30 0030
 * Time: 09:46
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class ArrayQueueDemo {

    public static void main(String[] args) {

        //����һ��
        //����һ������
        ArrayQueue arrayQueue = new ArrayQueue(5);

        char key=' ';//�����û�������
        Scanner scanner=new Scanner(System.in);
        boolean loop=true;

        //���һ���˵�
        while (loop){
            System.out.println("s(show): ��ʾ����");
            System.out.println("e(exit): �˳�����");
            System.out.println("a(add): ������ݵ�����");
            System.out.println("g(get): �Ӷ���ȡ������");
            System.out.println("h(head): �鿴����ͷ������");

            key=scanner.next().charAt(0);//����һ���ַ�

            switch (key){

                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                case 'g'://ȡ������

         try {
             int queue = arrayQueue.getQueue();
             System.out.printf("����ͷ��������%d\n", queue);
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
        System.out.println("�����˳�����������");
    }
}

// ʹ������ģ�����-��дһ��ArrayQueue��
class ArrayQueue{
    private int maxSize;//��ʾ������������
    private int front;//����ͷ
    private int rear;//����β
    private int []arr;//���������ڴ�����ݣ�ģ�����

    //�������еĹ�����

    public ArrayQueue(int arrMaxSize) {
       maxSize=arrMaxSize;
       arr=new int[maxSize];
       front=-1; //ָ�����ͷ����������front��ָ�����ͷ��ǰһ��λ��
       rear=-1; //ָ�����β��ָ�����β�����ݣ������Ƕ�������һ�����ݣ�
    }

    //�ж϶����Ƿ���
    public boolean isFull(){
        return rear==maxSize-1;
    }
    //�ж϶����Ƿ��
    public boolean isEmpty(){
        return rear==front;
    }

    //������ݵ�����
    public void addQueue(int n){
        //�ж϶����Ƿ���
        if (isFull()){
            System.out.println("�����Ѿ����ˡ�����");
            return;
        }
        rear++;
        arr[rear]=n;
    }
  //��ȡ���е����ݣ�������
    public int getQueue(){
        //�ж��Ƿ�Ϊ��
        if (isFull()){
            throw  new RuntimeException("���пգ����ܻ�ȡ���ݣ�����");
        }
       front++;

        return arr[front];
    }

    //��ʾ���е����е�����
    public void showQueue(){

        //����
        if (isEmpty()){
            System.out.println("�����ǿյ�û�����ݣ�");
            return;
        }

        for (int i  = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

    //��ʾ���е�ͷ���ݣ�ע�ⲻ��ȡ������
    public int headQueue(){
        //�ж�
        if(isEmpty()){
            throw  new RuntimeException("���пյġ�û������ȡ����~~");

                    }
        return arr[front+1];

    }
}

