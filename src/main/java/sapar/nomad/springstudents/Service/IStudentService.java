package sapar.nomad.springstudents.Service;

import sapar.nomad.springstudents.Model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAllStudent();

    Student saveStudent(Student student);

    Student findByEmail(String email);

    Student updateStudent(Student student);

    void deleteStudent(String email);
}
