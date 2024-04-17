package sapar.nomad.springstudents.Service.Implemented;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sapar.nomad.springstudents.Model.Student;
import sapar.nomad.springstudents.Repository.InMemoryStudentDAO;
import sapar.nomad.springstudents.Service.IStudentService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InMemoryIStudentService implements IStudentService {
    /**
     * A repository for CRUD with students
     */
    @NonNull
    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
