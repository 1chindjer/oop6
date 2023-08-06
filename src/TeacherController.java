import java.util.List;

public class TeacherController implements TeacherControllerInterface{
    private TeacherViewInterface teacherView = (TeacherViewInterface) new TeacherView();

    @Override
    public void create(String firstName, String secondName, Integer teacherID) {
        Teacher newTeacher = new Teacher(firstName, secondName, teacherID);
    }
    public void naPechat(List<Teacher> teacherList){
        teacherView.naPechat(teacherList);
    }
}