import java.time.LocalDate;

public interface UserController <T extends User>{
    /**
     * Принцип единственной ответственности, данный интерфейс выполняет только одну функцию создать юзера.
     * Принцип разделения интерфейса (ISP)
     */
    void create(String firstName, String surName, String lastName);
}
