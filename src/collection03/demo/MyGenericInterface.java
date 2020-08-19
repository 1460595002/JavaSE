package collection03.demo;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/19 0019
 * Time: 15:00
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public interface MyGenericInterface<E> {
    abstract void add(E e);
    abstract E getE();
}
