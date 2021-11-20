package com.pb.iskra.hw8;

public class WrongLoginException extends Throwable {


    public String getLogin() {
        return login;
    }

    private String login;

    public WrongLoginException(String login) {
        this.login = login;
    }

}
