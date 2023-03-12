import Exception.WrongLoginException;
import Exception.WrongPasswordException;
/*
Все поля имеют тип данных String.
Длина login должна быть меньше 20 символов и не должен содержать
пробелы.
Если login не соответствует этим требованиям, необходимо выбросить
WrongLoginException.
Длина password должна быть меньше 20 символов, не должен содержать
пробелы и должен содержать хотя бы одну цифру.
Также password и confirmPassword должны быть равны.
Если password не соответствует этим требованиям, необходимо
выбросить WrongPasswordException.
Метод возвращает true, если значения верны или false в другом случае
 */
public class MyMain {
    public static void main (String[] args) throws WrongLoginException, WrongPasswordException {
        Authorization l1 = new Authorization();
        l1.setLogin("Kolyago");
        l1.setPassword("123ol");
        l1.setConfirmPassword("123ol");






}
}

