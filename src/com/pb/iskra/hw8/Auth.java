package com.pb.iskra.hw8;




import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {

    private String login;
    private String password;
    private String confirmPassword;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }


    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        int login1 = login.length();
        int password1 = password.length();

        if (login1 < 5 && login1 > 20) {
            throw new WrongLoginException(login);
        }
        String pattern = "[а-яёА-ЯЁ.,\\/#!$%\\^&\\*;:{}=\\-`~_()+]";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(login);

        if (m.find()) {

            throw new WrongLoginException(login);
        } else {
            setLogin(login);
        }
        if (password1 < 5 && password1 > 20) {
            throw new WrongPasswordException(password);
        }
        String pattern2 = "[а-яёА-ЯЁ.,\\/#!$%\\^&\\*;:{}=\\-`~()+]";

        Pattern r2 = Pattern.compile(pattern2);
        Matcher m2 = r2.matcher(password);

        if (m2.find()) {
            throw new WrongPasswordException(password);
        }

        if (password.equals(confirmPassword)) {

            setPassword(password);
            System.out.println("Регистрация успешна!");
        } else {
            throw new WrongPasswordException(password);

        }
    }


    public void singIn(String login, String password) throws WrongLoginException, WrongPasswordException {
        if (login.equals(getLogin())) {

        } else {
            throw new WrongLoginException(login);
        }

        if (password.equals(getPassword())) {
            System.out.println("Спасибо!  Вы вошли");
        } else {
            throw new WrongPasswordException("Пароли не совпадают");

        }

    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}


//Создать пакет hw8.
//Создать класс Auth, который содержит поля login и password и методы:
//
//- signUp (регистрация на сайте) принимающий login, password, и confirmPassword.
//Проверяет параметр login, длинна должна быть от 5 до 20 символов. Login должен содержать только латинские буквы и цифры.
// Если логин не соответствует требованиям нужно выбросить WrongLoginException.
//Проверяет параметр password, длинна более 5, только латинские буквы и цифры и знак подчеркивания. Также password
// и confirmPassword должны совпадать. Если password не соответствует требованиям нужно выбросить WrongPasswordException.
//Если проверки все пройдены успешно записать в свои поля значение login и password. Так сохраняем пользователя :)
//
//- signIn (вход на сайт) принимающий login и password.
//Проверяет что login и password соответствуют значениям из полей класса.
//Если нет - выбрасывает исключение WrongLoginException.
//
//WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
// второй принимает сообщение и передает его в конструктор класса Exception.
//
//Создать класс OnlineShop с методом main.
//В main создать один объект класса Auth.
//Предложить пользователю сперва зарегистрироваться (signUp) потом войти на сайт (signIn).
//Обработать исключения методов signUp signIn с помощью блоков try-catch.