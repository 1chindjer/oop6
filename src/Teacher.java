import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User implements Comparable<Teacher>{
    /**
     * Принцип инверсии зависимостей (DIP), зависимости внутри системы строятся на основе абстракций
     */
    /**
     * Принцип единственной ответственности.
     */

    private int teacherId;


    public Teacher(String firstName, String secondName, int teacherId) {
        super(firstName, secondName);
        this.teacherId = teacherId;
    }
    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, int teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    /**
     * Принцип открытости/закрытости, здесь мы не вносим изменения в родительский класс, а просто
     * переопределяем метод/ы
     * Принцип подстановки Барбары Лисков (LSP), переопределили метод, не нарушив функциональность.
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}