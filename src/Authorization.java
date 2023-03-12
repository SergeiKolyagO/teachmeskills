import Exception.WrongLoginException;
import Exception.WrongPasswordException;

public class Authorization {
    private String login;
    private String password;
    private String confirmPassword;

    Authorization(){
    }

    public void setLogin (String login) throws WrongLoginException {
        if (!(getSize(login)) || !(getSpase(login))){
            throw new WrongLoginException("incorrect login");
        }
        this.login = login;

    }
    public void setPassword(String password) throws WrongPasswordException {
        if ((!getSpase(password) || !(getSize(password)) ||  (!getDigit(password)))){
            throw new WrongPasswordException("incorrect password");
        }
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) throws WrongPasswordException {
        System.out.println(yesOrNo(password,confirmPassword));
        if (!yesOrNo(password,confirmPassword)) {
            throw new WrongPasswordException("incorrect password");
        }
        this.confirmPassword = confirmPassword;
    }

    // поиск числа
    public boolean getDigit(String s){
        boolean hasDigits = false;
        for(int i = 0; i < s.length() && !hasDigits; i++) {
            if(Character.isDigit(s.charAt(i))) {
                hasDigits = true;
            }
        }
        return hasDigits;
    }
    // пробелы
    public boolean getSpase(String s){
        return s.indexOf(' ') == -1;
    }
    // длина строки
    public boolean getSize (String s){
        return s.length() <= 20;
    }

    public boolean yesOrNo(String password, String confirmPassword){
        return password.equals(confirmPassword);
    }
}