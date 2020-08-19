package reflection.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/14 0014
 * Time: 15:07
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Person {

    private String name;
    public  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        this.name = name;
        this.age = age;
    }

    public  void show (){
        System.out.println("一个人");
    }
    private String showNation(String nation){
        System.out.println("我的国籍是："+nation);
        return nation;

    }

    @Override
    public String
    toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
