package set.student.manager;

public class Student {
    private Long matriculation;
    private String name;
    private Double average;

    public Student(Long matriculation, String name, Double average) {
        this.matriculation = matriculation;
        this.name = name;
        this.average = average;
    }

    public Long getMatriculation() {
        return matriculation;
    }

    public String getName() {
        return name;
    }

    public Double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matriculation=" + matriculation +
                ", name='" + name + '\'' +
                ", average=" + average +
                '}';
    }
}
