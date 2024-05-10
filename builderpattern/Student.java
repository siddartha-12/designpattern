package builderpattern;

public class Student {
    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    Student(StudentBuilder studentBuilder)
    {
        this.id = studentBuilder.getId();
        this.age = studentBuilder.getAge();
        this.name = studentBuilder.getName();
    }

    public static class StudentBuilder{
        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getId() {
            return id;
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        private int id;
        private String name;

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        private int age;
        public Student build(){
            return new Student(this);
        }

    }
}
