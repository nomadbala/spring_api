package sapar.nomad.springstudents.Service;

import sapar.nomad.springstudents.Model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAllStudent();

    void saveStudent(Student student);

    Student findByEmail(String email);

    void updateStudent(Student student);

    void deleteStudent(String email);
}
