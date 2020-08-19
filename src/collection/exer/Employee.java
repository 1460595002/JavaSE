package collection.exer;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/11 0011
 * Time: 17:24
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Employee  implements Comparable{
    private String name;
    private int age;
    private MyDate birthday;


       public Employee(){}
       public  Employee(String name,int age,MyDate birthday){

           this.name=name;
           this.age=age;
           this.birthday=birthday;

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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Object o) {
           if(o instanceof  Employee){
               Employee e= (Employee) o;
               return this.name.compareTo(e.name);
           }
           throw  new RuntimeException("输入类型不一致！");
    }
}
