package collection.exer;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/11 0011
 * Time: 20:13
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Person {

     int id;
     String name;


     public Person(){}

     public Person(int id,String name){
         this.id=id;
         this.name=name;
     }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
