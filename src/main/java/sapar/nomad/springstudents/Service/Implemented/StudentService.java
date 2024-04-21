package sapar.nomad.springstudents.Service.Implemented;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import sapar.nomad.springstudents.Model.Student;
import sapar.nomad.springstudents.Repository.StudentRepository;
import sapar.nomad.springstudents.Service.IStudentService;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentService implements IStudentService {
    private final StudentRepository repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        repository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public void updateStudent(Student student) {
        repository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String email) {
        repository.deleteByEmail(email);
    }
}
