package de.kittlaus.list;

public class Student {

    public static final int UNDEFINED = -1;

    private final String name;

    private int id = UNDEFINED;

    public Student(String name) {
        this.name = name;

    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[id=" + getId() + ", name=" + getName() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;
        return this.getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}