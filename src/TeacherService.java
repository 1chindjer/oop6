
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherService {
    private TeacherGroup teacherGroup;
    public void createTeacherGroup(String since, List<Teacher> teacherList){
        this.teacherGroup = new TeacherGroup(since, teacherList);
    }
    public TeacherGroup getTeacherGroup(){
        return teacherGroup;
    }
    public Teacher FindTeacherFromTeacherGroup(String firstName, String secondName){
        Iterator<Teacher> iterator = teacherGroup.iterator();
        List<Teacher> result = new ArrayList<>();
        while (iterator.hasNext()){
            Teacher teacher = iterator.next();
            if(teacher.getFirstName().equalsIgnoreCase(firstName)
                    && teacher.getSecondName().equalsIgnoreCase(secondName)){
                result.add(teacher);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Нет учителя с именем %s и фамилией %s ", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("С такими Именем и Фамилией больше 1 учителя");
        }
        return result.get(0);
    }
    public List<Teacher> getSortedTeacherGroup(){
        List<Teacher> teachers = new ArrayList<>(teacherGroup.getTeacherList());
        Collections.sort(teachers);
        return teachers;
    }
    public List<Teacher> getSortedByFIOTeachersGroup(){
        List<Teacher> teachers = new ArrayList<>(teacherGroup.getTeacherList());
        teachers.sort(new UserComparator<Teacher>());
        return teachers;
    }
    public void createTeacher(User user){
        teacherGroup.createTeacher(user);
    }
}