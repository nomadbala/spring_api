package sapar.nomad.springstudents.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sapar.nomad.springstudents.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);

    Student findStudentByEmail(String email);
}
