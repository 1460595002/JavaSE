package collection.List;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/10 0010
 * Time: 10:20
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Person {

    private  String name;
    private  int age;


    public Person(){

    }

    public Person(String name,int age){
        this.name=name;
        this.age=age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
