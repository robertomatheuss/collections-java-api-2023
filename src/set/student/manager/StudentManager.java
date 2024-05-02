package set.student.manager;

import java.util.*;
import java.util.stream.Collectors;

public class StudentManager {
    private Set<Student> studentSet;

    public StudentManager() {
        this.studentSet = new HashSet<>();
    }

    public void addStudent(Student student){
        studentSet.add(student);
    }

    public void removeStudent(Long matriculation){
        for(Student student : studentSet){
            if(!(student.getMatriculation()==matriculation)){
                throw new RuntimeException("There are no students with this matriculation");
            }
        }
        studentSet.removeIf(x-> Objects.equals(x.getMatriculation(), matriculation));
    }

    public Set<Student> sortByName(){
        return studentSet.stream().sorted((x,y)->x.getName().compareToIgnoreCase(y.getName()))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<Student> sortByAverage(){
        return studentSet.stream().sorted(Comparator.comparing(Student::getAverage))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

}
