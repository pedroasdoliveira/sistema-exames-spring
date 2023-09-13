package com.sistema.exames.exceptions;

public class UserNotFoundException extends Exception {

    public UserNotFoundException() {
        super("O usuário com esse nome não existe!");
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
