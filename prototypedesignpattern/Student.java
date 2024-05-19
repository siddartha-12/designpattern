package prototypedesignpattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Student implements Prototype<Student>{
    private String id;
    private String name;
    private int age;
    private String college;
    private String collegeCity;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", college='" + college + '\'' +
                ", collegeCity='" + collegeCity + '\'' +
                '}';
    }

    Student(){

    }

    protected Student(Student other){
        this.id = other.id;
        this.name = other.name;
        this.age = other.age;
        this.college = other.college;
        this.collegeCity = other.collegeCity;
    }
    @Override
    public Student clone() {
        return new Student(this);
    }
}
