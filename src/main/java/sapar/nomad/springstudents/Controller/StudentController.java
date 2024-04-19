package sapar.nomad.springstudents.Controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sapar.nomad.springstudents.Model.Student;
import sapar.nomad.springstudents.Service.IStudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    @NonNull
    private IStudentService IStudentService;

    @GetMapping
    @CrossOrigin
    public List<Student> findAllStudent() {
        return IStudentService.findAllStudent();
    }

    @PostMapping("save_student")
    @CrossOrigin
    public String saveStudent(@RequestBody Student student) {
        IStudentService.saveStudent(student);
        return "Student successfully saved";
    }

    @GetMapping("/{email}")
    @CrossOrigin
    public Student findByEmail(@PathVariable("email") String email) {
        return IStudentService.findByEmail(email);
    }

    @PutMapping("update_student")
    @CrossOrigin
    public Student updateStudent(@RequestBody Student student) {
        return IStudentService.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    @CrossOrigin
    public void deleteStudent(@PathVariable("email") String email) {
        IStudentService.deleteStudent(email);
    }
}
