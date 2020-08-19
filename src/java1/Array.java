package java1;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/7 0007
 * Time: 21:12
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Array {

    public static void main(String[] args) {


        //线性查找：

        String [] arr=new String[]{"SS","DFD","DFDF","FGFG","ERE"};

        //要查找的元素
        String desc="DF222DF";

        boolean isF=true;

        for (int i = 0; i <arr.length ; i++) {
            if (desc.equals(arr[i])){
                System.out.println("找到了指定的位置："+i);
                isF=false;

            }
        }

        if (isF){

            System.out.println("没找到");
        }



    }
}
