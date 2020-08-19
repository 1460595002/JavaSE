package java1;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/19 0019
 * Time: 21:42
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class HeapDemo {
    public static void main(String[] args) {
        System.out.println("CPU核心数："+Runtime.getRuntime().availableProcessors());
        //虚拟机占用内存的初始化大小
        System.out.println("-Xms:TOTAL_MEMORY=虚拟机中的内存总量："+(Runtime.getRuntime().totalMemory())/(double)1024/1024+"MB");
        //虚拟机最大分配内存的大小
        System.out.println("-Xmx:MAX_MEMORY = 虚拟机试图占用最大的内存量："+(Runtime.getRuntime().maxMemory())/(double)1024/1024+"MB");
    }
}
