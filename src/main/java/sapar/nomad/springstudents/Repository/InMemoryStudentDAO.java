package sapar.nomad.springstudents.Repository;

import org.springframework.stereotype.Repository;
import sapar.nomad.springstudents.Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {
    /**
     * A list of students stored in the repository
     */
        private final List<Student> STUDENTS = new ArrayList<>();

    /**
     * Retrieves all students stored in the repository
     * @return a list of all students stored in the repository
     */
    public List<Student> findAllStudent() {
        return STUDENTS;
    }

    /**
     * Saves a new student to the repository.
     *
     * @param student the student to be saved
     * @return the saved student
     */
    public void saveStudent(Student student) {
        STUDENTS.add(student);
    }

    /**
     * Finds a student in the repository by email.
     *
     * @param email the email of the student to be found
     * @return the student with the specified email, or null if not found
     */
    public Student findByEmail(String email) {
        return STUDENTS.stream()
                       .filter(student -> student.getEmail().equals(email))
                       .findFirst()
                       .orElse(null);
    }

    /**
     * Updates an existing student in the repository.
     *
     * @param student the updated student
     * @return the updated student
     * @throws IllegalArgumentException if no student with the specified email is found
     */
    public void updateStudent(Student student) {
        var studentIndex = IntStream.range(0, STUDENTS.size())
                           .filter(idx -> STUDENTS.get(idx).getEmail().equals(student.getEmail()))
                           .findFirst()
                           .orElse(-1);

        if (studentIndex == -1)
            throw new IllegalArgumentException("Student with email " + student.getEmail() + " not found");

        STUDENTS.set(studentIndex, student);
    }

    /**
     * Deletes a student from the repository by email.
     *
     * @param email the email of the student to be deleted
     * @throws IllegalArgumentException if no student with the specified email is found
     */
    public void deleteStudent(String email) {
        var student = findByEmail(email);

        if (student == null)
            throw new IllegalArgumentException("Student with email " + email + " not found");

        STUDENTS.remove(student);
    }
}
