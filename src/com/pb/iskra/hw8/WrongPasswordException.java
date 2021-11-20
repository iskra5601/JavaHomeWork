package com.pb.iskra.hw8;

public class WrongPasswordException extends Exception {

    private String password;

    public WrongPasswordException(String password) {
        this.password = password;

    }


}
