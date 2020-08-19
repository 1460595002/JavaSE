package collection02.Set.treeset;

/**
 * 定义一个Employee类。
 该类包含：private成员变量name,age,birthday，其中 birthday 为 MyDate 类的对象；
 并为每一个属性定义 getter, setter 方法；
 并重写 toString 方法输出 name, age, birthday
 */
public class Employee  implements Comparable{

    private  String name;
    private int age;
    private  MyDate myDate;

    public Employee(String name, int age, MyDate myDate) {
        this.name = name;
        this.age = age;
        this.myDate = myDate;
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

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", myDate=" + myDate +
                '}';
    }
    //按 姓名 排序
    @Override
    public int compareTo(Object o) {

        if (o instanceof Employee){
            Employee e= (Employee) o;

            return this.name.compareTo(e.name);
        }
        throw new RuntimeException("传入的数据类型不一致！");
    }
}
