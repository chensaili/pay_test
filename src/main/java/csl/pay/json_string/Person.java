package csl.pay.json_string;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -5398047475191584600L;
    private String name;
    private int age;

    public Person(){
        super();
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String toString(){
        return "Customer [name=" + name + ", age=" + age + "]";
    }
}
