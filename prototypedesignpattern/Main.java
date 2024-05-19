package prototypedesignpattern;

import Registrydesignpattern.StudentRegistry;

public class Main {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        Student student = new Student("1","siddhu",22,"MBU","Bangalore");
        studentRegistry.register("general",student);
        Student advancedStudent = new AdvanceStudent(1);
        advancedStudent.setAge(3);
        advancedStudent.setCollege("cole");
        advancedStudent.setName("ss");
        advancedStudent.setCollegeCity("kadi");
        advancedStudent.setId("3");
        studentRegistry.register("advance",advancedStudent);

        Student student1 = studentRegistry.clone("general");
        Student student2 = studentRegistry.clone("advance");
        Student student3 = studentRegistry.clone("advance");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}
