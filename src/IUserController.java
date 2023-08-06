import java.time.LocalDate;

public class IUserController implements UserController {
    /**
     * Принцип единственной ответственности, данный класс выполняет только одну функцию создать юзера.
     */
    @Override
    public void create(String firstName, String surName, String lastName) {
        User newUser = new User(firstName, lastName, surName, LocalDate.now());
    }

    public void printConsole(User user) {

    }
}
