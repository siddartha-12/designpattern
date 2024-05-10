package builderpattern;

public class Client {
    public static void main(String[] args) {
        Student student = new Student.
                StudentBuilder().
                setId(1).setAge(3).
                setName("siddhu1").
                build();
        Student student2 = new Student.
                StudentBuilder().
                setId(1).
                setAge(3).
                setName("siddhu1").
                build();
        System.out.println(student);
        System.out.println(student2);
    }
}
