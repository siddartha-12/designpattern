package Registrydesignpattern;

import prototypedesignpattern.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry implements Registry<Student> {
    private final Map<String,Student> studentMap;
    public StudentRegistry(){
        studentMap = new HashMap<>();
    }
    @Override
    public Student get(String key) {
        return studentMap.getOrDefault(key,null);
    }

    @Override
    public void register(String key, Student template) {
        studentMap.put(key, template);
    }

    @Override
    public void unRegister(String key) {
        studentMap.remove(key);
    }

    @Override
    public Student clone(String key) {
        return studentMap.get(key).clone();
    }

}
