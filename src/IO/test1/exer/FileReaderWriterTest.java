package IO.test1.exer;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/10 0010
 * Time: 20:40
 * E-mail:1460595002@qq.com
 * 类说明:
 */


public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file =new File("hello.text");//相对于当前工程
        System.out.println(file.getAbsolutePath());

        File file1=new File("javaSE/hello.text");
        System.out.println(file1.getAbsolutePath());


    }
    @Test
    public void test() throws IOException {

        FileReader fileReader=null;

        try {
            //1.先指定需要操作的文件
            File file=new File("test.text");//相当于当前的model
            //2.提供具体的流
            fileReader=new FileReader(file);



/*
     方式一：
    //数据文件的读入
            //read():返回读入的一个字符，如果达到末尾，返回-1
            int read = fileReader.read();

            while (read !=-1){
                System.out.print((char)read);

                read=fileReader.read();//这样才能遍历所有的字符相当于i++
            }*/

            //方式二：
            int data;
            while ((data=fileReader.read()) != -1){
                System.out.print((char) data);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader !=null){
                fileReader.close();//释放资源
            }
        }
    }

    //read的升级操作
    @Test
    public void testFileReader1() throws IOException {
        //1.File类的实例化
        //2.FileReader流的实例化
        //3.读入操作
        //资源关闭
        FileReader fileReader=null;

        try {
            //1.先指定需要操作的文件
            File file=new File("test.text");//相当于当前的model
            //2.提供具体的流
            fileReader=new FileReader(file);



            char [] cbuf=new char[5];
            int len;

            while ((len=fileReader.read(cbuf)) !=-1){

                //方式一：
                //错误的写法
//                for(int i = 0;i < cbuf.length;i++){
//                    System.out.print(cbuf[i]);
//                }
                //正确的写法
//                for(int i = 0;i < len;i++){
//                    System.out.print(cbuf[i]);
//                }
                //方式二：
                //错误的写法,对应着方式一的错误的写法
//                String str = new String(cbuf);
//                System.out.print(str);
                //正确的写法
                String str = new String(cbuf,0,len);
                System.out.print(str);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader !=null){
                fileReader.close();//释放资源
            }
        }
    }

    /*
    把内存中的数据写入硬盘里。
    说明：
    1.输出操作：对应的file可以不存在，并不会报异常
    2.File对应硬盘中文件如果不存在，在输出过程中，会自动创建这个文件
       对应硬盘中文件如果存在：
      如果流使用的构造器是：FileWriter(file,false) / FileWriter(file):对原有文件的覆盖
      如果流使用的构造器是：FileWriter(file,true):不会对原有文件覆盖，而是在原有文件基础上追加内容
     */

    @Test
    public void testFileWriter(){
        FileWriter fileWrite=null;

        try {
            //1.提供file类的对象，指定写出到文件
            File file=new File("test.text");
            //2.提供FileWriter对象，用户数据的写出
            fileWrite=new  FileWriter(file);

            //3.写出操作
            fileWrite.write("你好啊");
            fileWrite.write("很搞笑！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileWrite !=null){
                try {
                    fileWrite.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileReaderFileWriter(){

        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类的对象，指明读入和写出的文件
            File srcFile = new File("test.text");
            File destFile = new File("test2.text");

            //不能使用字符流来处理图片等字节数据
//            File srcFile = new File("手机.jpg");
//            File destFile = new File("手机1.jpg");


            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);


            //3.数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;//记录每次读入到cbuf数组中的字符的个数
            while((len = fr.read(cbuf)) != -1){
                //每次写出len个字符
                fw.write(cbuf,0,len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            //方式一：
//            try {
//                if(fw != null)
//                    fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally{
//                try {
//                    if(fr != null)
//                        fr.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            //方式二：
            try {
                if(fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
