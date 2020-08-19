package IO.file.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/20 0020
 * Time: 19:50
 * E-mail:1460595002@qq.com
 * 类说明:自定义注解
 */
public class Test03 {
      //注解可以显示赋值，如果没有默认值，我们必须给注解赋值

    @MyAnnotation(age = 18,name = "你好")
    public void test(){

    }






@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    //注解参数：+注解类型+参数名
    String name() default "";
    int age();
    int id() default -1;//默认值-1表示不存在

    String[] schools() default {"北京大学","清华大学"};


}

@MyAnnotation1("年后")//注解类型默认value不用写
public void test1(){

}

    @Target({ElementType.TYPE,ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnnotation1{

        String value();

    }

}
