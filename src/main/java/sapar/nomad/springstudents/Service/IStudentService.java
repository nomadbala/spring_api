package sapar.nomad.springstudents.Service;

import sapar.nomad.springstudents.Model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAllStudent();

    // todo: Change returning type to void
    Student saveStudent(Student student);

    Student findByEmail(String email);

    // todo: Change returning type to void
    Student updateStudent(Student student);

    void deleteStudent(String email);
}
