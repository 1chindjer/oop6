import java.time.LocalDate;
import java.util.List;

public class StudentController implements UserController{

    private UserViewInterface studentsView = new StudentView();
    @Override
    public void create(String firstName, String surName, String lastName){
        Student newStudent = new Student(firstName, lastName, surName, LocalDate.now());
    }
    public void printConsole(List<Student> students){
        studentsView.naPechat(students);
    }
}