package db;

import entity.Student;

import java.util.List;

public class StudenRepository implements Repository<Student> {

    private static List<Student> students;
    @Override
    public void create(Student student) {
        students.add(student);
    }

    @Override
    public void read(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(Student student) {

    }
}
