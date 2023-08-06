import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User student1 = new User("Студент 1", "Студент", "студентович", LocalDate.now());
        User student2 = new User("студент2", "студет2", "втроооевич", LocalDate.now());
        User student3 = new User("третий имя", "фамилия3", "третьевич", LocalDate.now());
        User student4 = new User("четвертый", "фамилия четыре", "четвертович", LocalDate.now());
        User student5 = new User("пятый", "пятый", "пятович", LocalDate.now());
        User student6 = new User("шест", "шестович", "шестов", LocalDate.now());

        User teacher = new Teacher("Учитель", "Училович", 134423);
        System.out.println(teacher.toString());
        List<Student> studentList = new ArrayList<>();

        StudentGroup students = new StudentGroup((Teacher) teacher, studentList);
        students.createStudent(student1);
        students.createStudent(student2);
        students.createStudent(student3);
        students.createStudent(student4);
        students.createStudent(student5);
        students.createStudent(student6);

        StudentView studentView = new StudentView();
    }
}