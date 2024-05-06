package jsr2.alura.university.models.vector;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Student otherStudent = (Student) obj;
        return otherStudent.getName().equals(this.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
