import java.util.List;

public interface UserViewInterface<T extends User> {
    /**
     * Принцип единственной ответственности, данный интерфейс выполняет только один метод печати.
     * Принцип разделения интерфейса (ISP)
     */
    public void naPechat(List<T> listT);
}